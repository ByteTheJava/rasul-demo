package com.app.hospital.age.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AgeController 
{
	private static final Logger LOG = LoggerFactory.getLogger(AgeController.class);

	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public String welcomeMsg() 
	{
		LOG.info("AgeController | welcomeMsg() | invoked");
		String msg="Welcome HMS System";
		LOG.info("AgeController | welcomeMsg() | terminated");
		return msg;
	}
}
