<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">

<!-- Font Awesome Link -->
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.1.0/css/all.css"
	integrity="sha384-lKuwvrZot6UHsBSfcMvOkWwlCMgc0TaWr+30HWe3a4ltaBwTZhyTEggF5tJv8tbt"
	crossorigin="anonymous">

<!-- CSS File Quiz.css -->
<link rel="stylesheet" href="./css/quiz.css">

<!-- Google Fonts -->
<link href="https://fonts.googleapis.com/css?family=Rancho"
	rel="stylesheet">

<title>Document</title>
</head>
<body>
	<header>
	<div id="container">
		<div id="logo-img">
			<img src="./images/logo.png" alt="#">
		</div>
		<div id="main-list">
			<ul>
				<li><a href="">Home</a></li>
				<li><a href="">Quiz</a></li>
				<li><a href="">About Us</a></li>
			</ul>
		</div>
		<div class="btn">
			<button type="button">Login</button>
			<button type="button">Sign Up</button>
		</div>
	</div>
	</header>

	<section id="quest-center">

	<h1>Quiz</h1>
	<h3>Answer the following questions</h3>
	<form action="result">
<div id="quiz-questions">

	<c:forEach items="${Questions}" var="Questions" >
	<div class="question-2">
 		<h4>	 Question : ${Questions.key} <input type = "hidden" name="question"  value="${Questions.key}"></h4>
 			
 				 <c:forEach items="${Questions.value}" var="Options" varStatus="loop">
					<!-- <input type="checkbox"/>${Options} ${loop.last ? '  ' : ''}   -->	
					<h5>  <input type="checkbox" name="answer" value="${Options} ${loop.last ? '  ' : ''}" >${Options} ${loop.last ? '  ' : ''}    </h5>
					
 				</c:forEach>
 				</div>
	</c:forEach> 
	</div>

	<button type="submit">Submit</button>
	</form>
	<!-- 	<div id="quiz-questions">
		<div class="question-1">
			<label>Which is the best operating system?</label><br> <input
				type="checkbox">Yes <input type="checkbox">No
		</div>
		<div class="question-2">
			<label>Which is the best operating system?</label><br> <input
				type="checkbox">Yes <input type="checkbox">No
		</div>
		<div class="question-3">
			<label>Which is the best operating system?</label><br> <input
				type="checkbox">Yes <input type="checkbox">No
		</div>
		<div class="question-4">
			<label>Which is the best operating system?</label><br> <input
				type="checkbox">Yes <input type="checkbox">No
		</div>
		<div class="question-5">
			<label>Which is the best operating system?</label><br> <input
				type="checkbox">Yes <input type="checkbox">No
		</div>
		<div class="question-6">
			<label>Which is the best operating system?</label><br> <input
				type="checkbox">Yes <input type="checkbox">No
		</div>
		<div class="question-7">
			<label>Which is the best operating system?</label><br> <input
				type="checkbox">Yes <input type="checkbox">No
		</div>
		<div class="question-8">
			<label>Which is the best operating system?</label><br> <input
				type="checkbox">Yes <input type="checkbox">No
		</div>
		<div class="question-9">
			<label>Which is the best operating system?</label><br> <input
				type="checkbox">Yes <input type="checkbox">No
		</div>
		<div class="question-10">
			<label>Which is the best operating system?</label><br> <input
				type="checkbox">Yes <input type="checkbox">No
		</div>

		<button type="submit">Submit</button>
	</div>
-->

	</section>
 
 <footer>
	<div id="footer-container">
		<div id="copy">
			<p>Quiz, Copywrite &copy; 2018</p>
		</div>
		<div id="footer-list">
			<ul>
				<li><a href=""><i class="fab fa-facebook-f"></i></a></li>
				<li><a href=""><i class="fab fa-twitter"></i></a></li>
				<li><a href=""><i class="fab fa-youtube"></i></a></li>
				<li><a href=""><i class="fab fa-google-plus-g"></i></a></li>
			</ul>
		</div>
	</div>
	</footer>
</body>
</html>
