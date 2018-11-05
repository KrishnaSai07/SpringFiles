<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%><html>
<head>
<title>Add Contact</title>
</head>
<body>
	<h2>Contact Form</h2>
	<form:form modelAttribute="contact" action="addContact" method="POST">
		<table>
			<tr>
				<td><form:label path="empName">First Name</form:label></td>
				<td><form:input path="empName" /> <form:errors
						path="empName"></form:errors></td>
			</tr>
			<tr>
				<td><form:label path="lastName">Last Name</form:label></td>
				<td><form:input path="lastName" /> <form:errors
						path="lastName"></form:errors></td>
			</tr>
			
			<tr>
				<td><form:label path="emailId">Email</form:label></td>
				<td><form:input path="emailId" /> <form:errors path="emailId"></form:errors>
				</td>
			</tr>
			<tr>
				<td><form:label path="mobileNumber">Mobile Number</form:label>
				</td>
				<td><form:input path="mobileNumber" /> <form:errors
						path="mobileNumber"></form:errors></td>
			</tr>
			<tr>
				<td><form:label path="dept">Date Of Birth</form:label></td>
				<td><form:input type="dept" path="dateOfBirth" /> <form:errors
						path="dateOfBirth"></form:errors></td>
			</tr>
			<tr>
				<td colspan="2" style="text-align: right">
					<button>Add Contact</button>
				</td>
			</tr>
		</table>
	</form:form>
</body>
</html>