<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>

<!-- <script src="https://code.jquery.com/jquery-3.6.0.min.js" integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script>
 -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</head>
<body>

	<div class="container">
		<h1>회원 정보 추가</h1>
		<form method="post" action="/lesson06/ex01/add_user" id="joinform"> 
			<label>이름</label>
			<div class="d-flex">
				<input type="text" name="name" id="nameInput" class="form-control"> 
				<button type="button" id="duplicateBtn" class="btn">중복확인</button> <br>
			</div>
			<label>생년월일</label>
			<input type="text" name="yyyymmdd" id="yyyymmddInput" class="form-control">
			<label>자기소개</label> <br>
			<textarea rows="10" cols="50" name="introduce" id="introduceInput" class="form-control"></textarea> <br>
			<label>이메일 주소:</label> <input type="text" name="email" id="emailInput" class="form-control"> <br>
			<button type="submit" id="submitBtn">추가</button> 
		
		</form>
	</div>
	
	<script>
		$(document).ready(function() {
			
			
			$("#joinForm").on("submit", function() {
				let name = $("#nameInput").val();
				let yyyymmdd = $("#yyyymmddInput").val();
				let introduce = $("#introduceInput").val();
				let email = $("#emailInput").val();
				
				if(name == "") {
					alert("이름을 입력하세요");
					return false;
				}
				if(yyyymmdd == "") {
					alert("생일을 입력하세요");
					return false;
				}
				if(introduce == "") {
					alert("자기소개를 입력하세요");
					return false;
				}
				
				if(email == "") {
					alert("이메일을 입력하세요");
					return false;
				}
				
				$.ajax({
					type:"post",
					url:"/lesson06/ex01/add_user",
					data:{"name":name, "yyyymmdd":yyyymmdd, "introduce":introduce, "email":email},
					success:function(data) {
						if(data == "success") {
							alert("입력성공");
						} else {
							alert("입력 실패");
						}
					},
					error:function() {
						alert("에러발생");
					}
					
				});
				
				return false;
				
				
			});
			
			$("#addBtn").on("click", function() {
				let name = $("#nameInput").val();
				let yyyymmdd = $("#yyyymmddInput").val();
				let introduce = $("#introduceInput").val();
				let email = $("#emailInput").val();
				
				if(name == "") {
					alert("이름을 입력하세요");
					return ;
				}
				if(yyyymmdd == "") {
					alert("생일을 입력하세요");
					return ;
				}
				if(introduce == "") {
					alert("자기소개를 입력하세요");
					return ;
				}
				
				if(email == "") {
					alert("이메일을 입력하세요");
					return ;
				}
				
				$.ajax({
					type:"post",
					url:"/lesson06/ex01/add_user",
					data:{"name":name, "yyyymmdd":yyyymmdd, "introduce":introduce, "email":email},
					success:function(data) {
						if(data == "success") {
							alert("입력성공");
						} else {
							alert("입력 실패");
						}
					},
					error:function() {
						alert("에러발생");
					}
					
				});
				
				
				
			});
			
			
			$("#duplicateBtn").on("click", function() {
				let name = ${"#nameInput"}.val();
				
				if(name == "") {
					alert("이름을 입력해주세요");
					return;
				}
				
				$.ajax({
					type:"get",
					url:"/lesson06/ex01/duplicate_name",
					data:{"data":name},
					success:function(data){
						
					},
					error:function() {
						alert("에러발생")
					}
				});
			});
			
			
			
		});
	
	</script>
</body>
</html>