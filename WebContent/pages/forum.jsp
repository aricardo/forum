<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<link rel="stylesheet" href="../css/style.css">


<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Forum</title>
</head>
<body>

<h1>Forum - grupo de usuarios Java</h1>
<br>
<br>

<form action="processa.jsp?acao=inctop">

<label> Título </label>
<input type="text" name="titulo" size="80">
<br>
<br>
<label> Autor</label>
<input type="text" name="autor" size="80">
<br>
<br>
<label> Post </label>
<br>
<textarea rows="5" cols="80"> </textarea>
<br>
<input type="submit" value="Enviar Tópico" >
</form>
<br>

<div align="center">
<table width="80%" cellpadding="1" cellpadding="1" border="1" >

<caption>Lista de Tópicos</caption>

<tr>
<th>Tópico</th>
<th>Quantidade de Respostas</th>
<th>Autor</th>
<th>Data Criação</th>
</tr>

<tr>
<td>
<a href="topico.jsp?topico=Melhor linguagem de programação">

Melhor linguagem de programação
</a>
</td>
<td>0</td>
<td>Allan</td>
<td>15/06/2011 Criação</td>
</tr>

<tr>
<td>
<a href="topico.jsp?topico=Erro no Tomcat">

Erro no Tomcat

</a>
</td>
<td>0</td>
<td>Allan</td>
<td>15/06/2011</td>
</tr>

</table>

</div>

<jsp:include page="rodape.jsp"></jsp:include>

</body>
</html>