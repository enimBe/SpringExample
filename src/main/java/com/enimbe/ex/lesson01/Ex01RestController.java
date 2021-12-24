package com.enimbe.ex.lesson01;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/lesson01/ex01")
@RestController // @Controller + @ResponseBody
public class Ex01RestController {

	@RequestMapping("/3")
	public String printString() {
		return "RestController 테스트";
	}
	
	@RequestMapping("/4")
	public Data printData() {
		Data data = new Data();
		data.setId(10);
		data.setName("서예주");
		
		return data;
	}
	
	@RequestMapping("/5")
	public ResponseEntity<Data> entity() {
		Data data = new Data();
		data.setId(5);
		data.setName("서예주");
		
		ResponseEntity<Data> entity = new ResponseEntity<>(data, HttpStatus.INTERNAL_SERVER_ERROR);
		
		return entity;
	}
}
