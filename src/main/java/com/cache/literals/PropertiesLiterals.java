package com.cache.literals;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cache.utils.LogUtils;

public class PropertiesLiterals {
	
	private static Properties cacheProperties;
	private static InputStream propertiesStream;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(PropertiesLiterals.class);
	
	private static final String CACHE_PROPERTIES_FILE = "cache.properties";
	
	public static final String SENTINEL_HOST = cacheProperties.getProperty("ptc.sentinel.host");
	public static final int SENTINEL_FIRST_INSTANCE = Integer.parseInt(cacheProperties.getProperty("ptc.sentinel.host"));
	public static final int SENTINEL_SECOND_INSTANCE = Integer.parseInt(cacheProperties.getProperty("ptc.sentinel.host"));
	public static final int SENTINEL_THIRD_INSTANCE = Integer.parseInt(cacheProperties.getProperty("ptc.sentinel.host"));
	
	static{
		try{
			propertiesStream = PropertiesLiterals.class.getClassLoader().getResourceAsStream(CACHE_PROPERTIES_FILE);
			if(null == propertiesStream){
				LogUtils.warn(LOGGER, " :::: CAUTION ! cache.properties is not loaded :::: "); 
			}
			
			cacheProperties.load(propertiesStream);
		}catch(IOException ioException){
			LogUtils.error(LOGGER, "Error in loading properties file in PropertiesLiterals",ioException);
		}catch(Exception exception){
			LogUtils.error(LOGGER, "Error in loading properties file in PropertiesLiterals",exception);
		}finally{
			if(null != propertiesStream){
				try{
					propertiesStream.close();
				}catch(IOException ioException){
					LogUtils.error(LOGGER, " :::: Error in closing the cache.properties stream :::: ", ioException);
				}
			}
		}
		
	}
	
	public static void main(String args[]){
		System.out.println(SENTINEL_HOST);
	}
}
