.PHONY: install-setup
install-setup:
ifeq (, $(shell which python3 2> /dev/null))
	@echo "python3 is not available, please install it to be able to install poetry for the build"
	exit 1
endif
ifeq (, $(shell which poetry 2> /dev/null))
	@curl -sSL https://install.python-poetry.org | python -
endif

.PHONY: build 
build: install-setup
	@poetry build

.PHONY: publish
publish: install-setup 
	@twine upload dist/*

.PHONY: compile-requirements
compile-requirements:
	pip-compile --output-file=requirements.txt --resolver=backtracking requirements.in

.PHONY: generate-sdk
generate-sdk:
	kiota generate -l python -d ../.openapi/connector_mgmt.yaml -o ./connector_mgmt_sdk --co
	kiota generate -l python -d ../.openapi/kafka-admin-rest.yaml -o ./kafka_instance_sdk --co
	kiota generate -l python -d ../.openapi/srs-fleet-manager.json -o ./registry_mgmt_sdk --co
	kiota generate -l python -d ../.openapi/kafka-admin-rest.yaml -o ./kafka_mgmt_sdk --co
	kiota generate -l python -d ../.openapi/registry-instance.json -o ./registry_instance_sdk --co
	kiota generate -l python -d ../.openapi/smartevents_mgmt_v2.yaml -o ./smart_events_mgmt_sdk --co
	kiota generate -l python -d ../.openapi/service-accounts.yaml -o ./service_accounts_mgmt_sdk --co

# The staggered make target explanations are printed correctly (not staggered) to the console.
.PHONY: help
help:
		@echo "App servces Python SDK make targets" 
		@echo "" 																				
		@echo "make install-setup	Installs poetry"
		@echo "make build			Build the SDK"					
		@echo "make publish			Publish the SDK"
		@echo "compile-requirements" Generate a requirements.txt based on the requirements.in
		@echo "generate-sdk" Generate Python SDK
		@echo "make help 			Print this help"