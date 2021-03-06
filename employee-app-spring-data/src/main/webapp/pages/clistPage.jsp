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
			
			<a href="addEmployee">Add Contact</a>
			<c:choose>
				<c:when test = "${ employees eq null or employees.size() eq 0 }">
					<h3>No records found!</h3>
				</c:when>
				
				<c:otherwise>
					<table>
						<tr>
						<th>Employees</th>
						<th>Name</th>
						<th>Basic</th>
						<th>Hra</th>
						<th>Dept</th>
						</tr>
						
						
						<tr>
						<c:forEach items ="${employees }" var="employee">
						<tr>
							<td>${employee.empId }</td>
							<td>${employee.empName }</td>
							<td>${employee.basic }</td>
							<td>${employee.hra }</td>
							<td>${employee.dept }</td>
							
						</tr>
						</c:forEach>
						</tr>
						
						
					</table>
				</c:otherwise>	
			</c:choose>
			
		</body>
</html>
	
