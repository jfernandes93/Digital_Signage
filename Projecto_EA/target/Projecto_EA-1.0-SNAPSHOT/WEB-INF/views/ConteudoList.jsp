<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: Universidade do Minho
License Type: Academic-->
<html>
<head><title>Conteudo List</title>
</head>
<body>
<center>
<h1>Conteudo List</h1>
<table border="1" width="80%">
	<tr>
		<td>ID(PK)</td>
		<td>Duracao</td>
		<td>Reproducoes</td>
		<td>_canal(FK)</td>
		<td>_conteudo(FK)</td>
		<td></td>
	</tr>
<%
implementacao.Conteudo[] conteudos = implementacao.ConteudoDAO.listConteudoByQuery(null, null);
for(int i = 0; i < conteudos.length; i++) {
		out.print("<tr>");
		out.print("<td>");
		out.print(conteudos[i].getORMID());
		out.print("</td>");
		out.print("<td>");
		out.print(conteudos[i].getDuracao());
		out.println("</td>");
		out.print("<td>");
		out.print(conteudos[i].getReproducoes());
		out.println("</td>");
		
		implementacao.Canal _canal = conteudos[i].get_canal();
		if(_canal != null) {
			out.print("<td>");
			out.print("<a href=\"Canal.jsp?action=search&ID=");
			out.print(_canal.getORMID());
			out.print("\">");
			out.print(_canal.getORMID());
			out.print("</a>");
			out.println("</td>");
		}
		
		else
 {
out.println("<td></td>");
		}
		
		
		implementacao.Tipo _conteudo = conteudos[i].get_conteudo();
		if(_conteudo != null) {
			out.print("<td>");
			out.print("<a href=\"Tipo.jsp?action=search&ID=");
			out.print(_conteudo.getORMID());
			out.print("\">");
			out.print(_conteudo.getORMID());
			out.print("</a>");
			out.println("</td>");
		}
		
		else
 {
out.println("<td></td>");
		}
		
		out.print("<td>");
		out.print("<a href=\"Conteudo.jsp?action=search&ID=");
		out.print(conteudos[i].getORMID());
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
<a href="Conteudo.jsp">Add Conteudo</a>
</center>
</body>
</html>
