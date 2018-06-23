<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<style>
	input[type="text"] {
		float:right;
	}
	input[type="submit"] {
		align:center;
	}
	form {
		width: 250px;
		text-align:left;
		margin-top:10px;
	}
	div form input[type="submit"] {
		width:100%;
	}
	select {
		margin-bottom:20px;
	}
</style>
<body>
	<%@ include file="/index.jsp" %>
	<div align="center">
		강의추가<br>
		<form action="classInsert.do" method="post">
			<select name="major">
				<optgroup label="무도대학">
					<option value="m1">유도학과</option>
					<option value="m2">유도경기지도학과</option>
					<option value="m3">격기지도학과</option>
					<option value="m4">동양무예학과</option>
					<option value="m5">태권도학과</option>
					<option value="m6">경호학과</option>
					<option value="m7">군사학과</option>
				</optgroup>
				<optgroup label="체육과학대학">
					<option value="p1">스포츠레저학과</option>
					<option value="p2">체육학과</option>
					<option value="p3">뷰티헬스케어학과</option>
					<option value="p4">골프학과</option>
					<option value="p5">특수체육교육과</option>
				</optgroup>
				<optgroup label="문화예술대학">
					<option value="c1">무용과</option>
					<option value="c2">미디어디자인학과</option>
					<option value="c3">회화학과</option>
					<option value="c4">연극학과</option>
					<option value="c5">실용음악과</option>
					<option value="c6">국악과</option>
					<option value="c7">영화영상학과</option>
					<option value="c8">문화재학과</option>
					<option value="c9">문화콘텐츠학과</option>
				</optgroup>
				<optgroup label="경영행정대학">
					<option value="ma1">경영학과</option>
					<option value="ma2">문화관광학과</option>
					<option value="ma3">경영정보학과</option>
					<option value="ma4">경찰행정학과</option>
					<option value="ma5">중국학과</option>
					<option value="ma6">영어과</option>
					<option value="ma7">미용경영학과</option>
				</optgroup>
				<optgroup label="환경과학대학">
					<option value="e1">산업환경보건학과</option>
					<option value="e2">환경학과</option>
					<option value="e3">컴퓨터과학과</option>
					<option value="e4">물류통계정보학과</option>
					<option value="e5">생명과학과</option>
				</optgroup>
				<optgroup label="보건복지대학">
					<option value="h1">식품영양학과</option>
					<option value="h2">물리치료학과</option>
					<option value="h3">사회복지학과</option>
					<option value="h4">뷰티케어학과</option>
				</optgroup>
			</select><br>
			학수번호 <input type="text" name="number"><br><br>
			학년 <input type="text" name="grade"><br><br>
			과목명 <input type="text" name="name"><br><br>
			학점 <input type="text" name="credit"><br><br>
			교수명 <input type="text" name="professor"><br><br>
			
		<input type="submit" value="추가">
		</form>
	</div>
</body>
</html>