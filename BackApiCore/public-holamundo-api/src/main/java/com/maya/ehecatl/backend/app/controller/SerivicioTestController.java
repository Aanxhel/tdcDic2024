package com.maya.ehecatl.backend.app.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SuppressWarnings({ "rawtypes" })
public class SerivicioTestController {

	
	@GetMapping(value = "/holamundo",consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> serviceUp() {
		ResponseEntity entity = null;
		entity = ResponseEntity.ok().body("{\"status\":\"ok\"}");
		return entity;
	}
	
	@GetMapping(value = "/welcome")
	@ResponseBody
	public String serviceUppage() {
		return "Hola Mundo!";
	}
}
