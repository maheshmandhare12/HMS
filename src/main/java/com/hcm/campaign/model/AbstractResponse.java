package com.hcm.campaign.model;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

public abstract class AbstractResponse implements Serializable{


	private static final long serialVersionUID = 6585192838797386966L;

	@NotNull
	private ResponseHeader responseHeader;

	public AbstractResponse() {
		
	}
	
	public AbstractResponse(ResponseHeader responseHeader) {
		super();
		this.responseHeader = responseHeader;
	}

	public ResponseHeader getResponseHeader() {
		return responseHeader;
	}

	public void setResponseHeader(ResponseHeader responseHeader) {
		this.responseHeader = responseHeader;
	}
	
	

}
