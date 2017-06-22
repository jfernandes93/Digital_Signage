<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: Universidade do Minho
License Type: Academic-->
<html>
<head><title>FicheiroMultimedia List</title>
</head>
<body>
<center>
<h1>FicheiroMultimedia List</h1>
<table border="1" width="80%">
	<tr>
		<td>ID(PK)</td>
		<td>URL</td>
		<td></td>
	</tr>
<%
implementacao.FicheiroMultimedia[] ficheiroMultimedias = implementacao.FicheiroMultimediaDAO.listFicheiroMultimediaByQuery(null, null);
for(int i = 0; i < ficheiroMultimedias.length; i++) {
		out.print("<tr>");
		out.print("<td>");
		out.print(ficheiroMultimedias[i].getORMID());
		out.print("</td>");
		out.print("<td>");
		out.print(ficheiroMultimedias[i].getURL());
		out.println("</td>");
		out.print("<td>");
		out.print("<a href=\"FicheiroMultimedia.jsp?action=search&ID=");
		out.print(ficheiroMultimedias[i].getORMID());
		out.print("\">");
		out.print("Edit");
		out.print("</a>");
		out.print("</td>");
		out.println("</td>");
		out.println("</tr>");
}

%>
</table><br>
<a href="index.html">Index page</a>
 | 
<a href="FicheiroMultimedia.jsp">Add FicheiroMultimedia</a>
</center>
</body>
</html>
