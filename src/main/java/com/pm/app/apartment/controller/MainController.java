package com.pm.app.apartment.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@RequestMapping(value = "/v1/{locationID}",method = RequestMethod.GET)
	public String getContactInfo(@PathVariable String locationID) {
        return locationID;
	}

	@RequestMapping(method = RequestMethod.GET)
	public String custom() {
		return "custom";
	}
}
