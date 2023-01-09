# ConnectorRequest


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** |  | 
**connector_type_id** | **str** |  | 
**namespace_id** | **str** |  | 
**desired_state** | [**ConnectorDesiredState**](ConnectorDesiredState.md) |  | 
**kafka** | [**KafkaConnectionSettings**](KafkaConnectionSettings.md) |  | 
**service_account** | [**ServiceAccount**](ServiceAccount.md) |  | 
**connector** | **{str: (bool, date, datetime, dict, float, int, list, str, none_type)}** |  | 
**channel** | [**Channel**](Channel.md) |  | [optional] 
**annotations** | [**ConnectorResourceAnnotations**](ConnectorResourceAnnotations.md) |  | [optional] 
**schema_registry** | [**SchemaRegistryConnectionSettings**](SchemaRegistryConnectionSettings.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


