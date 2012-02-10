<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<link rel="stylesheet" href="../css/style.css">

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Forum - grupo de usuarios Java</h1>
<br>

<h2><%= request.getParameter("topico") %></h2>


<div style="border: solid 1px; padding: 2px;">

<img alt="mayara" src="../imagens/IMG_1044.JPG" width="200" height="200">
<label>Resposta</label>
texto da resposta
<br>

<label>Autor</label>
nome do autor
<br>

<label>Data</label>
data 12/02/2001
<br>
</div>

<br>
<div style="border: solid 1px; padding: 2px;">

<img alt="mayara" src="../imagens/IMG_1080.JPG" width="40" height="40">

<label>Resposta</label>
texto da resposta
<br>

<label>Autor</label>
nome do autor
<br>

<label>Data</label>
data 12/02/2001
<br>
</div>

<jsp:include page="rodape.jsp"></jsp:include>
</body>
</html>