package com.java.irctc.client.service;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.java.irctc.client.binding.Request;
import com.java.irctc.client.binding.Responce;

@Service
public class ServiceImpl {
	// post
	public Responce bookTiket(Request request) {
		String endurl = "http://localhost:8080/book";
		
		//here i add headers
		HttpHeaders header=new HttpHeaders();
		header.set("Content-Type", "application/json");
		header.set("Accept", "application/json");
		HttpEntity<Request> requEntity=new HttpEntity<Request>(request, header);
		
		RestTemplate rt = new RestTemplate();
		ResponseEntity<Responce> re = rt.postForEntity(endurl, requEntity, Responce.class);
		Responce body = re.getBody();
		return body;
		 
		
		 
	}
}
