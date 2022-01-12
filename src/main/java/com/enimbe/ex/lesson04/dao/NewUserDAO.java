package com.enimbe.ex.lesson04.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.enimbe.ex.lesson04.model.NewUser;

@Repository
public interface NewUserDAO {

	public int insertUser(
				@Param("name") String name,
				@Param("yyyymmdd") String yyyymmdd,
				@Param("email") String email,
				@Param("introduce") String introduce
			);
	
	public NewUser selectUser(@Param("id") int id);
	
	public int selectCountName(@Param("name") String name);
}
