package com.enimbe.ex.lesson04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.enimbe.ex.lesson04.bo.NewStudentBO;
import com.enimbe.ex.lesson04.model.NewStudent;

@Controller
public class NewStudentController {

	@Autowired
	private NewStudentBO newStudentBO;
	
	@RequestMapping("/lesson04/ex02/1")
	public String addStudentView() {
		return "/lesson04/addStudent";
	}
	
//	@ResponseBody
//	@RequestMapping(path = "/lesson04/ex02/add_student", method = RequestMethod.POST)
	@PostMapping("/lesson04/ex02/add_student")
	public String addStudent(
			@ModelAttribute NewStudent student) {
		
		int count = newStudentBO.addStudent(student);
		
		
//		return "입력 성공 : " + count;
		return "/lesson04/studentInfo";
	}
	
	
}
