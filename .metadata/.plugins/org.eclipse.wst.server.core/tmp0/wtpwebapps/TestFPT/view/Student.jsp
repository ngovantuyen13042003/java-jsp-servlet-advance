<%@include file="/common/taglib.jsp"%> 

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<%@include file="../common/BoostrapCSS.jsp" %>
	
	<style type="text/css">
		.rq{
			color: red;
		}
	</style>
</head>
<body>
<%
	String notifyError = request.getAttribute("notifyError") + "";
	notifyError = (notifyError.equals("null"))?"":notifyError;
%>
	<div class="container mb-5" style="width: 700px">
		<h1 class="text-center mt-5" >NHẬP THÔNG TIN</h1>
		<p class="rq"><%=notifyError%></p>
		<form action="student" method="post">
			<div class="form-group">
				<label for="fullname">Họ và tên:</label> <input type="text"
					class="form-control" id="fullname" name="name" placeholder="Nhập họ và tên">
			</div>
			<div class="form-group">
				<label for="email">Email:</label> <input type="email"
					class="form-control" id="email" name="email" placeholder="Nhập email">
			</div>

			<div class="form-group">
				<label for="phoneNumber">Số điện thoại:</label> <input type="text"
					class="form-control" id="phoneNumber" name="phoneNumber"
					placeholder="Nhập số điện thoại">
			</div>
			<div class="form-group">
				<label for="identityCardNumber" >Số chứng minh nhân dân:<span class="rq">*</span></label> <input type="text"
					class="form-control" id="identityCardNumber" name="identityCardNumber"
					placeholder="Nhập số chứng minh nhân dân" required>
			</div>
			<div class="form-group">
				<label for="address">Địa chỉ:</label> <input type="text"
					name="address"    class="form-control" id="address" placeholder="Nhập địa chỉ">
			</div> 

			<div class="form-group">
				<label for="graduateDate">Loại tốt nghiệp:</label> <select
					class="form-control" id="graduateDate" name="graduateType"> 
					<option>Giỏi</option>
					<option>khá</option>
					<option>Trung bình</option>
				</select>
			</div>
			
			<div class="form-group">
				<label for="graduateType">Hệ tốt nghiệp:</label> <select
					class="form-control" id="graduateType" name="graduateDegree">
					<option>Cữ nhân</option>
					<option>Kỹ sư</option>
					<option>Giáo sư</option>
					<option>Tiến sĩ</option>
				</select>
			</div>

			<div class="form-group">
				<label for="nameSchool">Chọn tên trường:<span class="rq">*</span></label> <select
					class="form-control" id="nameSchool" name="idSchool" required>
					<c:forEach var="item" items="${schoolList}">
						<option value="${item.idSchool}">${item.idSchool}</option>
					</c:forEach>
				</select>
			</div>
			
			<div class="form-group">
				<label for="nameMajor" >Chọn tên ngành:<span class="rq">*</span></label> <select
					class="form-control" id="nameMajor" name="idMajor" required>
					<c:forEach var="item" items="${majorList}">
						<option value="${item.idMajor}">${item.idMajor}</option>
					</c:forEach>
				</select>
			</div>

			<div class="form-group">
				<label for="graduateDate">Ngày tốt nghiệp:</label> <input
					type="date" class="form-control" id="graduateDate" name="graduateDate">
			</div>

			<div class="text-center">
				<button type="submit" style="width: 100%; margin-top: 20px" class="btn btn-primary ">Submit</button>
			</div>
		</form>
	</div>

	<%@include file="../common/BoostrapJS.jsp" %>
</body>
</html>