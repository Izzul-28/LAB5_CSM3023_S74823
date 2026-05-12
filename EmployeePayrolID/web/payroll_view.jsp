<%-- 
    Document   : payroll_view
    Created on : 12 May 2026
    Author     : IZZUL MUAZZAM
    COURSE     : CSM3023
    LAB 5      : EXERCISE

--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Employee Payroll</title>
    </head>
    <body>
        <h2>Employee Payroll Display System</h2>
        <table>
            <thead>
                <tr>
                    <th>Emp ID</th>
                    <th>Name</th>
                    <th>Department</th>
                    <th>Basic Salary (RM)</th>
                    <th>Status</th>
                </tr>
            </thead>
            <tbody>
                <%-- Iterasi menggunakan c:forEach  --%>
                <c:forEach items="${employeeList}" var="emp">
                    <tr>
                        <td><c:out value="${emp.empId}" /></td>
                        <td><c:out value="${emp.name}" /></td>
                        <td><c:out value="${emp.department}" /></td>
                        <td><c:out value="${emp.basicSalary}" /></td>
                        <td>
                            <%-- Logic Challenge: Senior vs Junior [cite: 121, 122] --%>
                            <c:choose>
                                <c:when test="${emp.basicSalary >= 3000}">
                                <strong>Senior</strong>
                                </c:when>
                                <c:otherwise>
                                <span>Junior</span>
                                </c:otherwise>
                            </c:choose>
                        </td>
                    </tr>
                </c:forEach>
        </tbody>
    </table>
    </body>
</html>