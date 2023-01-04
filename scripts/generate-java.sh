#!/usr/bin/env bash
## OPENAPI_FILENAME=yourapi generate_js.sh 

set -e

npx @openapitools/openapi-generator-cli version-manager set 5.4.0
echo "Generating SDKs"

TEMPLATES_DIR="$(dirname $0)/templates"

GROUP_ID="com.redhat.cloud"
ARTIFACT_ID="smartevents-management-sdk"
OPENAPI_FILENAME=".openapi/smartevents_mgmt.yaml"
PACKAGE_NAME="com.openshift.cloud.api.smartevents"
OUTPUT_PATH="app-services-sdk-java/packages/smartevents-management-sdk/"

echo "Generating based on ${OPENAPI_FILENAME}"
rm -Rf $OUTPUT_PATH/src $OUTPUT_PATH/target

npx @openapitools/openapi-generator-cli generate -g java \
    --library resteasy -t "$TEMPLATES_DIR" \
    -i "$OPENAPI_FILENAME" -o "$OUTPUT_PATH" \
    --package-name="${PACKAGE_NAME}" \
    --additional-properties="apiTests=false,modelTests=false,hideGenerationTimestamp=true,groupId=${GROUP_ID},artifactId=${ARTIFACT_ID},modelPackage=${PACKAGE_NAME}.models,invokerPackage=${PACKAGE_NAME}.invoker,apiPackage=${PACKAGE_NAME},dateLibrary=java8,licenseName=Apache-2.0,licenseUrl=https://www.apache.org/licenses/LICENSE-2.0.txt" \
    --ignore-file-override=.openapi-generator-ignore