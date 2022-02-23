package com.lagm.webflux.actuator.controller;

import org.springframework.boot.actuate.endpoint.web.annotation.RestControllerEndpoint;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Component
@RestControllerEndpoint(id = "controller-end-point")
public class CustomEndPoint {

	// http://localhost:8067/mgmt/controller-end-point/my-endpoint
	@GetMapping("/my-endpoint")
	public @ResponseBody ResponseEntity customEndPoint() {
		return new ResponseEntity<>("Something from my controller", HttpStatus.OK);
	}
}
