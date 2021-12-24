package com.enimbe.ex.lesson01;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Ex01Controller {

	@ResponseBody
	@RequestMapping("/lesson01/ex01/1")
	public String printString() {
		
		return "Spring을 통한 첫번째 response";
		
	}

	@ResponseBody
	@RequestMapping("/lesson01/ex01/2")
	public Map<String, Integer> printMap() {
		Map<String, Integer> map = new HashMap<>();
		map.put("apple", 1500);
		map.put("banana", 5000);
		map.put("orange", 1000);
		
		return map;
	}

}
