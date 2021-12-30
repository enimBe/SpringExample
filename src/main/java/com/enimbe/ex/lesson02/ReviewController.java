package com.enimbe.ex.lesson02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.enimbe.ex.lesson02.bo.ReviewBO;
import com.enimbe.ex.lesson02.model.Review;

@RestController
public class ReviewController {

	@Autowired
	private ReviewBO reviewBO;
	
	@RequestMapping("/lesson03/ex01")
	public Review ex01 (
					@RequestParam("id") int id
//					, @RequestParam("name") int name
//					@RequestParam(value="id", required=false, defaultValue="5") int id
			) {
		return reviewBO.getReview(id);
	}
	
	@RequestMapping("/lesson03/ex02")
	public String ex02() {
		
		// 4, "콤비네이션피자", "김바다", 4.5, "할인도 많이 받고 잘 먹었습니다"
		
//		int count = reviewBO.addReview(4, "콤비네이션피자", "김바다", 4.5, "할인도 많이 받고 잘 먹었습니다");
		
		
		Review review = new Review();
		review.setStoreId(4);
		review.setMenu("콤비네이션 피자");
		review.setUserName("김바다");
		review.setPoint(4.5);
		review.setReview("2222222");
		
		int count = reviewBO.addReviewAsObject(review);
		
		return "입력 결과 " + count;
		
	}
	
}
