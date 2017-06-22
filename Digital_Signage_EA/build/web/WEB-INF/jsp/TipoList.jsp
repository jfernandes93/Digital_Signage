<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: Universidade do Minho
License Type: Academic-->
<html>
<head><title>Tipo List</title>
</head>
<body>
<center>
<h1>Tipo List</h1>
<table border="1" width="80%">
	<tr>
		<td>ID(PK)</td>
		<td></td>
	</tr>
<%
implementacao.Tipo[] tipos = implementacao.TipoDAO.listTipoByQuery(null, null);
for(int i = 0; i < tipos.length; i++) {
		out.print("<tr>");
		out.print("<td>");
		out.print(tipos[i].getORMID());
		out.print("</td>");
		out.print("<td>");
		out.print("<a href=\"Tipo.jsp?action=search&ID=");
		out.print(tipos[i].getORMID());
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
<a href="Tipo.jsp">Add Tipo</a>
</center>
</body>
</html>
