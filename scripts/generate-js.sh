#!/usr/bin/env bash

# generate an API client for a service
generate_sdk() {
    local file_name=$1
    local output_path=$2
    local package_name=$3
     
    echo "Validating OpenAPI ${file_name}"
    npx @openapitools/openapi-generator-cli validate -i "$file_name"

    echo "Generating source code based on ${file_name}"

    # remove old generated models
    rm -Rf $OUTPUT_PATH/model $OUTPUT_PATH/api
    
    generate_command_params=()
    generate_command_params+=(--package-name="${package_name}")
    generate_command_params+=(--additional-properties=$additional_properties)
    generate_command_params+=(--ignore-file-override=.openapi-generator-ignore)
    [[ "$file_name" == *"smartevents"* ]] && generate_command_params+=(--remove-operation-id-prefix)

    npx @openapitools/openapi-generator-cli generate -g typescript-axios -i \
    "$file_name" -o "$output_path" "${generate_command_params[@]}"
}

npx @openapitools/openapi-generator-cli version-manager set 5.4.0
echo "Generating SDKs"
additional_properties="ngVersion=6.1.7,npmName=${PACKAGE_NAME},supportsES6=true,withInterfaces=true,withSeparateModelsAndApi=true,modelPackage=model,apiPackage=api"

OPENAPI_FILENAME=".openapi/smartevents_mgmt.yaml"
PACKAGE_NAME="@rhoas/smart-events-management-sdk"
OUTPUT_PATH="app-services-sdk-js/packages/smart-events-management-sdk/src/generated"

generate_sdk $OPENAPI_FILENAME $OUTPUT_PATH $PACKAGE_NAME
