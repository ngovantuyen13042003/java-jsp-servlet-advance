<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Search job of student after graduate</title>
<%@include file="../common/BoostrapCSS.jsp"%>
</head>
<body>
	<div class="container">
		<h2 class="text-center mt-5" style="margin-bottom: 30px">SEARCH
			INFOMATION JOB OF STUDENT AFTER GRADUATE</h2>
		<form action="search-student-job-graduate" method="get"
			style="margin: 20px">
			<div class="input-group">
				<div class="form-outline">
					<input type="search" id="form1" class="form-control"
						name="searchContent" /> <label class="form-label" for="form1">Search</label>
				</div>
				<button type="button" class="btn btn-primary">
					<i class="fas fa-search"></i>
				</button>
			</div>
		</form>
		<table class="table align-middle mb-0 bg-white">
			<thead class="bg-light">
				<tr>
					<th>Identity card number</th>
					<th>Name</th>
					<th>Major code graduate</th>
					<th>School code</th>
					<th>Major code work</th>
					<th>company name</th>
					<th>Working time</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="item" items="${resultSearch}">
					<tr>
						<td>
							<p class="fw-bold mb-1">${item.identityCardNumber}</p>
						</td>
						<td>
							<p class="text-muted mb-0">${item.name}</p>
						</td>
						<td>
							<p class="text-muted mb-0">${item.graduate.idMajor}</p>
						</td>
						<td>
							<p class="fw-normal mb-1">${item.graduate.idSchool}</p>
						</td>
						<td>
							<p class="fw-normal mb-1">${item.job.idMajor}</p>
						</td>
						<td>
							<p class="text-muted mb-0">${item.job.nameCompany}</p>
						</td>

						<td>
							<p class="fw-normal mb-1">${item.job.workingTime}</p>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>


	<%@include file="../common/BoostrapJS.jsp"%>
</body>
</html>