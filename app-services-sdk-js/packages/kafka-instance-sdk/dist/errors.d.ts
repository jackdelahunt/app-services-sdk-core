/**
   kafkainstance error codes
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
    /** Invalid or missing credentials*/
    ERROR_1: string;
    /** Client is not authorized to perform the requested operation*/
    ERROR_2: string;
    /** No such topic*/
    ERROR_3: string;
    /** No such consumer group*/
    ERROR_4: string;
    /** Topic/Partition in request is invalid*/
    ERROR_5: string;
    /** Topic/Partition in request does not exist*/
    ERROR_6: string;
    /** Request body is malformed or invalid*/
    ERROR_7: string;
    /** Request violates topic configuration policy*/
    ERROR_8: string;
    /** Request contains invalid configuration*/
    ERROR_9: string;
    /** Requested topic already exists*/
    ERROR_10: string;
    /** Consumer group has connected clients*/
    ERROR_11: string;
    /** Cluster not available*/
    ERROR_12: string;
    /** Invalid ACL binding resourceType or operation*/
    ERROR_13: string;
    /** No such error*/
    ERROR_14: string;
    /** Unknown consumer group member*/
    ERROR_15: string;
    /** Request body or parameters invalid*/
    ERROR_16: string;
    /** Server has encountered an unexpected error*/
    ERROR_99: string;
};
