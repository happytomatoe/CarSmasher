<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!Doctype html>
<html>
<head>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">
	<title>Cars</title>
</head>
<body>
  <div class="navbar navbar-inverse">
          <div class="	">
          	<div class="navbar-inner">
            <ul class="nav ">
              <li >
                <a href="${pageContext.request.scheme}://${pageContext.request.serverName}
:${pageContext.request.serverPort}${pageContext.request.contextPath}"/>Home</a>
              </li>
            
              <li >
                <a href="./cars">Cars</a>
              </li>
               <li >
                <a href="./tires">Tires</a>
              </li>
                  </ul>
          </div>
          </div>
        </div>