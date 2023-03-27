/**
   connectormgmt error codes
    ```ts
    apiCall.then((data) => {
        console.log(data?.data.items)
    }).catch((err) => {
      if(APIErrorCodes.ERROR_5 == err.response?.data.code) {
        // Handle error
      }
    })
    ```
*/
export declare const APIErrorCodes: {
    /** Forbidden to perform this action*/
    ERROR_4: string;
    /** Forbidden to create more instances than the maximum allowed*/
    ERROR_5: string;
    /** An entity with the specified unique values already exists*/
    ERROR_6: string;
    /** Resource not found*/
    ERROR_7: string;
    /** General validation failure*/
    ERROR_8: string;
    /** Unspecified error*/
    ERROR_9: string;
    /** HTTP Method not implemented for this endpoint*/
    ERROR_10: string;
    /** Account is unauthorized to perform this action*/
    ERROR_11: string;
    /** Required terms have not been accepted*/
    ERROR_12: string;
    /** Account authentication could not be verified*/
    ERROR_15: string;
    /** Unable to read request body*/
    ERROR_17: string;
    /** Bad request*/
    ERROR_21: string;
    /** Failed to parse search query*/
    ERROR_23: string;
    /** The maximum number of allowed kafka instances has been reached*/
    ERROR_24: string;
    /** Resource gone*/
    ERROR_25: string;
    /** Provider not supported*/
    ERROR_30: string;
    /** Region not supported*/
    ERROR_31: string;
    /** Kafka cluster name is invalid*/
    ERROR_32: string;
    /** Minimum field length not reached*/
    ERROR_33: string;
    /** Maximum field length has been depassed*/
    ERROR_34: string;
    /** Only multiAZ Kafkas are supported, use multi_az=true*/
    ERROR_35: string;
    /** Kafka cluster name is already used*/
    ERROR_36: string;
    /** Field validation failed*/
    ERROR_37: string;
    /** Service account name is invalid*/
    ERROR_38: string;
    /** Service account desc is invalid*/
    ERROR_39: string;
    /** Service account id is invalid*/
    ERROR_40: string;
    /** Instance Type not supported*/
    ERROR_41: string;
    /** Synchronous action is not supported, use async=true parameter*/
    ERROR_103: string;
    /** Failed to create kafka client in the mas sso*/
    ERROR_106: string;
    /** Failed to get kafka client secret from the mas sso*/
    ERROR_107: string;
    /** Failed to get kafka client from the mas sso*/
    ERROR_108: string;
    /** Failed to delete kafka client from the mas sso*/
    ERROR_109: string;
    /** Failed to create service account*/
    ERROR_110: string;
    /** Failed to get service account*/
    ERROR_111: string;
    /** Failed to delete service account*/
    ERROR_112: string;
    /** Failed to find service account*/
    ERROR_113: string;
    /** Insufficient quota*/
    ERROR_120: string;
    /** Failed to check quota*/
    ERROR_121: string;
    /** Too Many requests*/
    ERROR_429: string;
    /** An unexpected error happened, please check the log of the service for details*/
    ERROR_1000: string;
};
