package com.enimbe.ex.lesson04.dao;

import org.springframework.stereotype.Repository;

import com.enimbe.ex.lesson04.model.NewStudent;

@Repository
public interface NewStudentDAO {

	public int insertStudent(NewStudent student);
	
}
