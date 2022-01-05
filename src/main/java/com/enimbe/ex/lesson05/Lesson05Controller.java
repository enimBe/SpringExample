package com.enimbe.ex.lesson05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/lesson05")
@Controller
public class Lesson05Controller {

	@GetMapping("/ex01")
	public String ex01() {
		return "lesson05/ex01";
	}
	
	@GetMapping("/ex02")
	public String ex02(Model model) {
		
		// 과일 이름 리스트
		List<String> fruits = new ArrayList<>();
		fruits.add("strawberry");
		fruits.add("watermelon");
		fruits.add("grape");
		fruits.add("mango");
		fruits.add("lychee");
		
		model.addAttribute("fruits", fruits);
		
		// 회원정보
		List<Map<String, Object>> users = new ArrayList<>();		
		Map<String, Object> map = new HashMap<>();
		map.put("name", "김인규");
		map.put("age", 28);
		map.put("hobby", "댄스");
		users.add(map);
		
		map = new HashMap<>();
		map.put("name", "서예주");
		map.put("age", 24);
		map.put("hobby", "쇼핑");
		users.add(map);

		model.addAttribute("users", users);
		
		return "lesson05/ex02";
	}
	
	@GetMapping("/ex03")
	public String ex03() {
		return "lesson05/ex03";
	}
}




















