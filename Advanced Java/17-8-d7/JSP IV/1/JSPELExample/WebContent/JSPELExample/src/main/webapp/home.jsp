<%@ page language="java" contentType="text/html; charset=US-ASCII" pageEncoding="US-ASCII" import="java.util.*"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
		<title>JSP EL Example</title>
	</head>
	<body>
	<%
			List<String> dummyNames = new ArrayList<String>();
			dummyNames.add("Daniel Atlas");
			dummyNames.add("Lucifer Morningstar");
			pageContext.setAttribute("names", dummyNames);
	%>
	<div id="sampleElExpressionsDiv">
		<span><strong>EL Example?= </strong> ${requestScope.personReqObj.name}</span><br /><br />
		<span><strong>EL Example (Without Scope)?= </strong> ${personReqObj.name}</span><br /><br />
		<span><strong>Application Scope Example?= </strong> ${applicationScope["User.Cookie"]}</span><br /><br />
		<span><strong>Multiple EL Example?= </strong> ${sessionScope.candidateReqObj.id} <span id="pipeSeparator">|</span> ${sessionScope.candidateReqObj.name} <span id="pipeSeparator">|</span> ${sessionScope.candidateReqObj.address.address}</span><br /><br />
		<span><strong>List EL Example?= </strong> ${names[0]} <span id="pipeSeparator">|</span> ${names[1]}</span><br /><br />
		<span><strong>Header Information EL Example?= </strong> ${header["Accept-Encoding"]}</span><br /><br />
		<span><strong>'pageContext' EL Example?= </strong> <span id="httpMethodId">Http Method Is?= </span>${pageContext.request.method}</span><br /><br />
		<span><strong>Context Param EL Example?= </strong> ${initParam.AppId}</span><br /><br />
		<span><strong>Arithmetic Operator EL Example?= </strong> ${initParam.AppId + 200}</span><br /><br />
		<span><strong>Relational Operator EL Example?= </strong> ${initParam.AppId < 200}</span><br /><br />
	</div>
	</body>
</html>