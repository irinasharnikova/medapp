<%@ page contentType="text/html; charset=utf8"
         pageEncoding="utf8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf8">
    <%--<title><spring:message code="label.title" /></title>--%>
</head>
<body>

<%--<a href="<c:url value="/logout" />">--%>
    <%--<spring:message code="label.logout" />--%>
<%--</a>--%>

<%--<h2><spring:message code="label.title" /></h2>--%>

<form:form method="post" action="add" modelAttribute="patient">

    <table>
        <tr>
            <td><form:label path="patient.name">
                <spring:message code="patient.name" />
            </form:label></td>
            <td><form:input path="patient.name" /></td>
        </tr>
        <tr>
            <td><form:label path="patient.insuranceNumber">
                <spring:message code="patient.surname" />
            </form:label></td>
            <td><form:input path="patient.insuranceNumber" /></td>
        </tr>
        <%--<tr>--%>
            <%--<td><form:label path="email">--%>
                <%--<spring:message code="label.email" />--%>
            <%--</form:label></td>--%>
            <%--<td><form:input path="email" /></td>--%>
        <%--</tr>--%>
        <%--<tr>--%>
            <%--<td><form:label path="telephone">--%>
                <%--<spring:message code="label.telephone" />--%>
            <%--</form:label></td>--%>
            <%--<td><form:input path="telephone" /></td>--%>
        <%--</tr>--%>
        <tr>
            <td colspan="2"><input type="submit"
                                   value="<spring:message code="label.addPatient"/>" /></td>
        </tr>
    </table>
</form:form>

<%--<h3><spring:message code="label.contacts" /></h3>--%>
<%--<c:if test="${!empty patientList}">--%>
    <%--<table class="data">--%>
        <%--<tr>--%>
            <%--<th><spring:message code="patient.name" /></th>--%>
            <%--<th><spring:message code="patient.insuranceNumber" /></th>--%>
            <%--<th>&nbsp;</th>--%>
        <%--</tr>--%>
        <%--<c:forEach items="${patientList}" var="patient">--%>
            <%--<tr>--%>
                <%--<td>${patient.name}</td>--%>
                <%--<td>${patient.insuranceNumber}</td>--%>
                <%--<td><a href="delete/${patient.id}"><spring:message code="label.delete" /></a></td>--%>
            <%--</tr>--%>
        <%--</c:forEach>--%>
    <%--</table>--%>
<%--</c:if>--%>

</body>
</html>