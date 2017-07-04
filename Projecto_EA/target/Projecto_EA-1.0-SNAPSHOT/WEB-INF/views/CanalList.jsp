<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: Universidade do Minho
License Type: Academic-->
<html>
<head><title>Canal List</title>
</head>
<body>
<center>
<h1>Canal List</h1>
<table border="1" width="80%">
	<tr>
		<td>ID(PK)</td>
		<td>Descricao</td>
		<td>Nome</td>
		<td>Cliente(FK)</td>
		<td>_player(FK)</td>
		<td></td>
	</tr>
<%
implementacao.Canal[] canals = implementacao.CanalDAO.listCanalByQuery(null, null);
for(int i = 0; i < canals.length; i++) {
		out.print("<tr>");
		out.print("<td>");
		out.print(canals[i].getORMID());
		out.print("</td>");
		out.print("<td>");
		out.print(canals[i].getDescricao());
		out.println("</td>");
		out.print("<td>");
		out.print(canals[i].getNome());
		out.println("</td>");
		
		implementacao.Cliente cliente = canals[i].getCliente();
		if(cliente != null) {
			out.print("<td>");
			out.print("<a href=\"Cliente.jsp?action=search&ID=");
			out.print(cliente.getORMID());
			out.print("\">");
			out.print(cliente.getORMID());
			out.print("</a>");
			out.println("</td>");
		}
		
		else
 {
out.println("<td></td>");
		}
		
		
		implementacao.Player _player = canals[i].get_player();
		if(_player != null) {
			out.print("<td>");
			out.print("<a href=\"Player.jsp?action=search&ID=");
			out.print(_player.getORMID());
			out.print("\">");
			out.print(_player.getORMID());
			out.print("</a>");
			out.println("</td>");
		}
		
		else
 {
out.println("<td></td>");
		}
		
		out.print("<td>");
		out.print("<a href=\"Canal.jsp?action=search&ID=");
		out.print(canals[i].getORMID());
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
<a href="Canal.jsp">Add Canal</a>
</center>
</body>
</html>
