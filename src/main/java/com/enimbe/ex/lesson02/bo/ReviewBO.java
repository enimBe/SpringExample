package com.enimbe.ex.lesson02.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.enimbe.ex.lesson02.dao.ReviewDAO;
import com.enimbe.ex.lesson02.model.Review;

@Service
public class ReviewBO {

	@Autowired
	private ReviewDAO reviewDAO;
	
	public Review getReview(int id) {
		return reviewDAO.selectReview(id);
	}
	
	public int addReview(int storeId, String menu, String userName, double point, String review) {
		return reviewDAO.insertReview(storeId, menu, userName, point, review);
	}
	
	public int addReviewAsObject(Review review) {
		return reviewDAO.insertReviewAsObject(review);
	}
}
