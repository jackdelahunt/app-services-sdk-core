#!/usr/bin/env bash

# generates an API client for the given OpenAPI spec file
generate_sdk() {
    local oas_file_name=$1
    local output_path=$2
    local package_name=$3
    local package_version=$4
     
    echo "Validating OpenAPI ${oas_file_name}"
    npx @openapitools/openapi-generator-cli validate -i "$oas_file_name"

    echo "Generating source code based on ${oas_file_name}"

    # remove old generated models
    rm -Rf $OUTPUT_PATH

    additional_properties=packageVersion="$package_version"

    echo "Generating SDK"
    npx @openapitools/openapi-generator-cli generate -g python -i\
        $oas_file_name -o $output_path \
        --package-name="$package_name" \
        --ignore-file-override='.openapi-generator-ignore' \
        --template-dir './scripts/templates' \

}
npx @openapitools/openapi-generator-cli version-manager set 6.1.0

OPENAPI_FILENAME=".openapi/smartevents_mgmt.yaml"
PACKAGE_NAME="rhoas_smart_events_mgmt_sdk"
OUTPUT_PATH="app-services-sdk-python/sdks/smart_events_mgmt_sdk"

generate_sdk $OPENAPI_FILENAME $OUTPUT_PATH $PACKAGE_NAME