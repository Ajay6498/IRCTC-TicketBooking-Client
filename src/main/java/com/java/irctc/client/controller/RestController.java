package com.java.irctc.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.java.irctc.client.binding.Request;
import com.java.irctc.client.binding.Responce;
import com.java.irctc.client.service.ServiceImpl;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	@Autowired
	private ServiceImpl serviceImpl;
	
	@PostMapping("/booktiket")
	public Responce book(@RequestBody Request request) {
		return serviceImpl.bookTiket(request);
	}
}
