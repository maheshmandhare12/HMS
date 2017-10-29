package com.hcm.campaign.model;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class ResponseHeader implements Serializable{

    private static final long serialVersionUID = -3089810671804818297L;
    
    @NotNull
    private ResponseType responseType;
    
    @NotNull
    @Size(max=4)
    private String errorCode;
    
    @Size(max=50)
    private String errorDescription;
    
    public ResponseHeader() {
    }
    
    public ResponseHeader(ResponseType responseType, String errorCode, String errorDescription) {
        super();
        this.responseType = responseType;
        this.errorCode = errorCode;
        this.errorDescription = errorDescription;
    }

    public ResponseType getResponseType() {
        return responseType;
    }
    
    public void setResponseType(ResponseType responseType) {
        this.responseType = responseType;
    }
    
    public String getErrorCode() {
        return errorCode;
    }
    
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
    
    public String getErrorDescription() {
        return errorDescription;
    }
    
    public void setErrorDescription(String errorDescription) {
        this.errorDescription = errorDescription;
    }
        
}
