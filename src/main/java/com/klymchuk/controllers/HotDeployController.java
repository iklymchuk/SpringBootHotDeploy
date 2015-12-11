package com.klymchuk.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HotDeployController {
	
	boolean isHotDeployable = false;
	
	public boolean isHotDeployable() {
		return isHotDeployable;
	}

	public void setHotDeployable(boolean isHotDeployable) {
		this.isHotDeployable = isHotDeployable;
	}
	
	//can use ***/hotdeploy?isHotDeployable=true
	@RequestMapping(
			value = "/hotdeploy",
			method = RequestMethod.GET,
			produces = {MediaType.APPLICATION_JSON_VALUE}
			)
	public HotDeployController hotDeployable (@RequestParam(required = false) boolean isHotDeployable) {
		
		HotDeployController hotDeploy = new HotDeployController();
		
		if (isHotDeployable) {
			hotDeploy.setHotDeployable(isHotDeployable);
		}
		return hotDeploy;
		
	}
}
