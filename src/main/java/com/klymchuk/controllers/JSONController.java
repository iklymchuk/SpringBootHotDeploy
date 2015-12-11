package com.klymchuk.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JSONController {
	
	//@ResponseBody delegate json responce json
	@RequestMapping("/jsontest")
	public @ResponseBody Map<String, String> testMap () {
		
		Map<String, String> map = new HashMap<String, String>();
			map.put("add", "Spring-Loaded");
			map.put("tech", "Spring Boot");
			
		return map;
	}

}
