"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.getErrorCode = exports.isServiceApiError = void 0;
/**
 * Check if the error code originates from the API
 *
 * @param error generic error returned from fumction
 * @returns true if error originated from the API
 */
const isServiceApiError = (error) => {
    var _a;
    return ((_a = error.response) === null || _a === void 0 ? void 0 : _a.data.error) !== undefined;
};
exports.isServiceApiError = isServiceApiError;
/**
 * Get the error code from the API error
 *
 * @param error generic error returned from fumction
 * @returns error code (one of fields of APIErrorCodes)
 */
const getErrorCode = (error) => {
    var _a, _b;
    return (_b = (_a = error.response) === null || _a === void 0 ? void 0 : _a.data) === null || _b === void 0 ? void 0 : _b.error;
};
exports.getErrorCode = getErrorCode;
