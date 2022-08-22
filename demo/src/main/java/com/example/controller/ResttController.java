package com.example.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResttController {
	private static final Logger LOGGER = LogManager.getLogger(ResttController.class);
	@PostMapping(value = "/alert")
	public String alert(@RequestBody String json) {
		System.out.println(json);
		LOGGER.info("alert-> "+json);
		return "done";
	}

	@GetMapping(value = "/log")
	public String log() {
		LOGGER.info("alert");
		return "done";
	}
}
