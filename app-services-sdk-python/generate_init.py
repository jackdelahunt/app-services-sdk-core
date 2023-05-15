import os

directories = [
    "connector_mgmt_sdk",
    "kafka_instance_sdk",
    "kafka_mgmt_sdk",
    "registry_mgmt_sdk",
    "registry_instance_sdk",
    "service_accounts_mgmt_sdk",
    "smart_events_mgmt_sdk"
]

def create_init_in_directory(path: str):
    for file_or_dir in os.listdir(path):
        full_path = f"{path}/{file_or_dir}"
        if os.path.isdir(full_path):
            open(f"{full_path}/__init__.py", "+a")
            create_init_in_directory(full_path)


cwd = os.getcwd()

for dir in directories:
    path = f"{cwd}/{dir}"
    create_init_in_directory(path)

