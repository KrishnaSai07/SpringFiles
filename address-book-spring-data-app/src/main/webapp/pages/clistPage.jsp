<%@ taglib uri="http://java.sun.com/jstl/core_rt"  prefix="c" %> 
  
<!-- keep the c in prefix inside quotes-->
<!-- -above line to use the things we have used below:choose etc -->
<!-- core_rt is core run time -->

<html>
		<head>
		<title>Contacts List</title>
		</head>
		
		<body>
			<h3> Contacts List</h3>
			
			<a href="addContact">Add Contact</a>
			<c:choose>
				<c:when test = "${ contacts eq null or contacts.size() eq 0 }">
					<h3>No records found!</h3>
				</c:when>
				
				<c:otherwise>
					<table>
						<tr>
						<th>Contacts</th>
						<th>Name</th>
						<th>Mobile</th>
						<th>Email</th>
						<th>Date of Birth</th>
						</tr>
						
						
						<tr>
						<c:forEach items ="${contacts }" var="contact">
						<tr>
							<td>${contact.contactId }</td>
							<td>${contact.firstName } ${contact.lastName }</td>
							<td>${contact.mobileNumber }</td>
							<td>${contact.emailId }</td>
							<td>${contact.dateOfBirth }</td>
							
						</tr>
						</c:forEach>
						</tr>
						
						
					</table>
				</c:otherwise>	
			</c:choose>
			
		</body>
</html>
	
