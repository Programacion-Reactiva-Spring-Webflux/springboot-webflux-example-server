package com.lagm.webflux.actuator;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.boot.actuate.endpoint.annotation.DeleteOperation;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.Selector;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;

public class MyHealthEndpoint {
	Map<String, String> healthMap = new LinkedHashMap<>();

	@ReadOperation
	public Map<String, String> health() {
		healthMap.put("MyHealth", "Working");
		return healthMap;
	}

	@ReadOperation
	public String getHealth(@Selector String name) {
		return healthMap.get(name);
	}

	@WriteOperation
	public void writeOperation(@Selector String name) {
		// TODO this write operation
	}

	@DeleteOperation
	public void deleteOperation(@Selector String name) {
		// TODO delete operation
	}
}
