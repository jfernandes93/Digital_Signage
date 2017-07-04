<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: Universidade do Minho
License Type: Academic-->
<html>
<head><title>Rede List</title>
</head>
<body>
<center>
<h1>Rede List</h1>
<table border="1" width="80%">
	<tr>
		<td>ID(PK)</td>
		<td>Descricao</td>
		<td>Nome</td>
		<td>_cliente(FK)</td>
		<td></td>
	</tr>
<%
implementacao.Rede[] redes = implementacao.RedeDAO.listRedeByQuery(null, null);
for(int i = 0; i < redes.length; i++) {
		out.print("<tr>");
		out.print("<td>");
		out.print(redes[i].getORMID());
		out.print("</td>");
		out.print("<td>");
		out.print(redes[i].getDescricao());
		out.println("</td>");
		out.print("<td>");
		out.print(redes[i].getNome());
		out.println("</td>");
		
		implementacao.Cliente _cliente = redes[i].get_cliente();
		if(_cliente != null) {
			out.print("<td>");
			out.print("<a href=\"Cliente.jsp?action=search&ID=");
			out.print(_cliente.getORMID());
			out.print("\">");
			out.print(_cliente.getORMID());
			out.print("</a>");
			out.println("</td>");
		}
		
		else
 {
out.println("<td></td>");
		}
		
		out.print("<td>");
		out.print("<a href=\"Rede.jsp?action=search&ID=");
		out.print(redes[i].getORMID());
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
<a href="Rede.jsp">Add Rede</a>
</center>
</body>
</html>
