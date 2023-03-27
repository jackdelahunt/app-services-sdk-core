import { AxiosError } from "axios";
import { ModelError } from "./generated";
/**
 * Check if the error code originates from the API
 *
 * @param error generic error returned from fumction
 * @returns true if error originated from the API
 */
export declare const isServiceApiError: (error: unknown) => error is AxiosError<ModelError, any>;
/**
 * Get the error code from the API error
 *
 * @param error generic error returned from fumction
 * @returns error code (one of fields of APIErrorCodes)
 */
export declare const getErrorCode: (error: unknown) => string | undefined;
