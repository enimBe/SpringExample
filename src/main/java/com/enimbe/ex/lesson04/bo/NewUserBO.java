package com.enimbe.ex.lesson04.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.enimbe.ex.lesson04.dao.NewUserDAO;
import com.enimbe.ex.lesson04.model.NewUser;

@Service
public class NewUserBO {

	@Autowired
	private NewUserDAO newUserDAO;
	
	public int addUser(String name, String yyyymmdd, String email, String introduce) {
		return newUserDAO.insertUser(name, yyyymmdd, email, introduce);
	}
	
	public NewUser getUser(int id) {
		return newUserDAO.selectUser(id);
	}
	
	public boolean isDuplicateName(String name) {
		int count = newUserDAO.selectCountName(name);
		if(count == 0) { // 중복이 안된상태
			return false;
		} else {
			return true;
		}
		
	}
	
}
