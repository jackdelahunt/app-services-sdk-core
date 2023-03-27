/**
   registrymgmt error codes
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
    /** Unspecified error*/
    ERROR_1: string;
    /** Registry with id='?' not found*/
    ERROR_2: string;
    /** Bad date or time format*/
    ERROR_3: string;
    /** Invalid request content or parameters. Make sure the request conforms to the given JSON schema*/
    ERROR_4: string;
    /** Bad request format - invalid JSON*/
    ERROR_5: string;
    /** Required terms have not been accepted for account id='?'*/
    ERROR_6: string;
    /** The maximum number of allowed Registry instances has been reached*/
    ERROR_7: string;
    /** Error type with id='?' not found*/
    ERROR_8: string;
    /** Data conflict. Make sure a Registry with the given name does not already exist*/
    ERROR_9: string;
    /** Bad request format - unsupported media type*/
    ERROR_10: string;
    /** Could not check quota for user?*/
    ERROR_11: string;
    /** Evaluation instances not allowed*/
    ERROR_12: string;
    /** User already has the maximum number of allowed Evaluation instances*/
    ERROR_13: string;
    /** Total (global) number of instances exhausted*/
    ERROR_14: string;
    /** User is not authorized to perform the operation*/
    ERROR_15: string;
};
