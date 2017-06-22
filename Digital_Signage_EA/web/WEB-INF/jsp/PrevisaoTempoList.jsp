<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: Universidade do Minho
License Type: Academic-->
<html>
<head><title>PrevisaoTempo List</title>
</head>
<body>
<center>
<h1>PrevisaoTempo List</h1>
<table border="1" width="80%">
	<tr>
		<td>ID(PK)</td>
		<td>URL</td>
		<td></td>
	</tr>
<%
implementacao.PrevisaoTempo[] previsaoTempos = implementacao.PrevisaoTempoDAO.listPrevisaoTempoByQuery(null, null);
for(int i = 0; i < previsaoTempos.length; i++) {
		out.print("<tr>");
		out.print("<td>");
		out.print(previsaoTempos[i].getORMID());
		out.print("</td>");
		out.print("<td>");
		out.print(previsaoTempos[i].getURL());
		out.println("</td>");
		out.print("<td>");
		out.print("<a href=\"PrevisaoTempo.jsp?action=search&ID=");
		out.print(previsaoTempos[i].getORMID());
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
<a href="PrevisaoTempo.jsp">Add PrevisaoTempo</a>
</center>
</body>
</html>
