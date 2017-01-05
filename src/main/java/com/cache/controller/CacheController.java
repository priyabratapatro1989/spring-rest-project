package com.cache.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cache.dto.CacheRequest;
import com.cache.dto.CacheResponse;
import com.cache.service.CacheService;

/**
 * Endpoint for stroing , deleting and retrieving entries from cache server
 * @author ppatro
 *
 */
@RestController
@RequestMapping("/cache")
public class CacheController {
	
	@Autowired
	private CacheService cacheService;
	
	/**
	 * This method creates entry in cache server with provided inputs
	 * @param cacheRequest
	 * @return
	 */
	@RequestMapping(value="/create",method=RequestMethod.POST,consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<CacheResponse> createEntry(@RequestBody CacheRequest cacheRequest){
		return null;
	}
	
	/**
	 * This method returns value based on given identifier if found , null if not found
	 * @param key
	 * @return
	 */
	@RequestMapping(value="/get/{idenitifier}",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<CacheResponse> getValueByIdentifier(@PathVariable("idenitifier")String key){
		return null;
	}
	
	@RequestMapping(value="/delete/{identifier}",method=RequestMethod.DELETE)
	public ResponseEntity<CacheResponse> deleteValueByIdentiifer(@PathVariable("identifier")String key){
		return null;
	}
	
	@RequestMapping(value="/get/message",method=RequestMethod.GET)
	public String getValueByIdentifier(){
		return "hello";
	}
}
