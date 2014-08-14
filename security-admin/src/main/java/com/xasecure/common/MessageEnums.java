package com.xasecure.common;

import com.xasecure.view.VXMessage;


public enum MessageEnums {

    // Note: Please do not format this file. It messes up the indentations

    // Common Errors
    DATA_NOT_FOUND("xa.error.data_not_found", "Data not found"),
    OPER_NOT_ALLOWED_FOR_STATE( "xa.error.oper_not_allowed_for_state", "Operation not allowed in current state"),
    OPER_NOT_ALLOWED_FOR_ENTITY( "xa.error.oper_not_allowed_for_state", "Operation not allowed for entity"),
    OPER_NO_PERMISSION("xa.error.oper_no_permission", "User doesn't have permission to perform this operation"),
    DATA_NOT_UPDATABLE( "xa.error.data_not_updatable", "Data not updatable"),
    ERROR_CREATING_OBJECT("xa.error.create_object", "Error creating object"),
    ERROR_DUPLICATE_OBJECT("xa.error.duplicate_object", "Error creating duplicate object"),
    ERROR_SYSTEM("xa.error.system", "System Error. Please try later."),
    OPER_NO_EXPORT("xa.error.oper_no_export", "repository is disabled"),

    // Common Validations
    INVALID_PASSWORD( "xa.validation.invalid_password", "Invalid password"),
    INVALID_INPUT_DATA("xa.validation.invalid_input_data", "Invalid input data"),
    NO_INPUT_DATA("xa.validation.no_input_data", "Input data is not provided"),
    INPUT_DATA_OUT_OF_BOUND("xa.validation.data_out_of_bound", "Input data if out of bound");

    String rbKey;
    String messageDesc;

    MessageEnums(String rbKey, String messageDesc) {
    	this.rbKey = rbKey;
    	this.messageDesc = messageDesc;
    }

    public VXMessage getMessage() {
    	VXMessage msg = new VXMessage();
    	msg.setName(this.toString());
    	msg.setRbKey(rbKey);
    	msg.setMessage(messageDesc);
    	return msg;
    }

    public VXMessage getMessage(Long objectId, String fieldName) {
    	VXMessage msg = new VXMessage();
    	msg.setName(this.toString());
    	msg.setRbKey(rbKey);
    	msg.setMessage(messageDesc);
    	msg.setObjectId(objectId);
    	msg.setFieldName(fieldName);
    	return msg;
    }
}