package com.cache.utils;

import org.slf4j.Logger;

/**
 * This class is for printing log messages of different levels
 * @author ppatro
 *
 */
public final class LogUtils {
	
	/**
	 * Stopping outside world to instantiate LogUtils
	 */
	private LogUtils(){
	}
	
	/**
	 * checks debug level is enabled or not and than logs incoming message to appender
	 * @param logger
	 * @param message
	 */
	public static void debug(Logger logger,String message){
		if(logger.isDebugEnabled()){
			logger.debug(message);
		}
	}
	
	/**
	 * checks info level is enabled or not and than logs incoming message to appender
	 * @param logger
	 * @param message
	 */
	public static void info(Logger logger,String message){
		if(logger.isInfoEnabled()){
			logger.info(message);
		}
	}
	
	/**
	 * Logs error messages to the log files
	 * @param logger
	 * @param message
	 */
	public static void error(Logger logger,String message,Throwable exception){
		logger.error(message,exception);
	}
	
	/**
	 * Logs warn messages to the log files
	 * @param logger
	 * @param message
	 */
	public static void warn(Logger logger,String message){
		logger.warn(message);
	}
}
