package com.cache.dto;

import java.io.Serializable;

/**
 * This class will be travelling as response of cache services to client
 * @author ppatro
 *
 */
public class CacheResponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2L;
	
	private Object value;
	private int errorCode;
	private String message;
	private boolean isError;
	
	public Object getValue() {
		return value;
	}
	public void setValue(Object value) {
		this.value = value;
	}
	public int getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public boolean isError() {
		return isError;
	}
	public void setError(boolean isError) {
		this.isError = isError;
	}
}
