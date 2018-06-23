<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
     request.setCharacterEncoding("UTF-8");
 %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>비밀번호 찾기</title>
</head>
<style>
	body {
		margin:0px;
		padding:0px;
	}
	.all_box {
		width:100%;
		height: 350px;
		background-color:rgba(150,148,148,0.2);
		transform: translateY(28%);
	}
	.login_box {
		width:300px;
		height:250px;
		background-color:rgba(120,209,238,0.7);
		margin:0 auto;
		border-radius:5px;
		transform: translateY(20%);
	}
	h3 {
		text-align:center;
		padding-top:20px;
	}
	 .login_box .fg {
	 	border-bottom: 2px solid #aaacaa; padding: 15px 0 9px 0;
	 }
    .login_box .fg input {
    	width: 90%; color: #828180; font-size: 15px; font-family:'돋움'; border:none;
    	margin-left:15px;
    }
    form .input2 {
    	border:0;
    	margin-top:10px;
    	align:center;
    	margin-left:125px;
    }
</style>
<body>
<div class="all_box">
	<div class="login_box">
		<form action="forgetpwd.do" method="post">
			<h3>Forget your password?</h3>
			<div class="fg">
				<input type="text" class="fc" placeholder="아이디 또는 학번" name="id" />
			</div>
			<div class="fg">
				<input type="text" class="fc" placeholder="이름" name="name" />
			</div>
			<div class="fg">
				<input type="text" class="fc" placeholder="E-Mail" name="email" />
			</div>
			<div class = "input2">
				<input type="submit" value="확인" />
			</div>
		</form>
	</div>
</div>
</body>
</html>