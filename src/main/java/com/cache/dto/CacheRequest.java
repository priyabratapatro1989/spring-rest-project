package com.cache.dto;

import java.io.Serializable;

import com.cache.literals.TimeUnitLiterals;

/**
 * This class is to be used for storing entries into cache server
 * @author ppatro
 *
 */
public class CacheRequest implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String key;
	private Object value;
	private Integer time;
	private TimeUnitLiterals timeUnitLiterals;
	
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public Object getValue() {
		return value;
	}
	public void setValue(Object value) {
		this.value = value;
	}
	public Integer getTime() {
		return time;
	}
	public void setTime(Integer time) {
		this.time = time;
	}
	public TimeUnitLiterals getTimeUnitLiterals() {
		return timeUnitLiterals;
	}
	public void setTimeUnitLiterals(TimeUnitLiterals timeUnitLiterals) {
		this.timeUnitLiterals = timeUnitLiterals;
	}
	
}
