"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.APIErrorCodes = void 0;
/**
   srs error codes

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
exports.APIErrorCodes = {
// TODO - Team to define specific error codes to handle
};
