<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: Universidade do Minho
License Type: Academic-->
<html>
<head><title>Cliente List</title>
</head>
<body>
<center>
<h1>Cliente List</h1>
<table border="1" width="80%">
	<tr>
		<td>ID(PK)</td>
		<td>Nome</td>
		<td>NIF</td>
		<td>Email</td>
		<td>Password</td>
		<td></td>
	</tr>
<%
implementacao.Cliente[] clientes = implementacao.ClienteDAO.listClienteByQuery(null, null);
for(int i = 0; i < clientes.length; i++) {
		out.print("<tr>");
		out.print("<td>");
		out.print(clientes[i].getORMID());
		out.print("</td>");
		out.print("<td>");
		out.print(clientes[i].getNome());
		out.println("</td>");
		out.print("<td>");
		out.print(clientes[i].getNIF());
		out.println("</td>");
		out.print("<td>");
		out.print(clientes[i].getEmail());
		out.println("</td>");
		out.print("<td>");
		out.print(clientes[i].getPassword());
		out.println("</td>");
		out.print("<td>");
		out.print("<a href=\"Cliente.jsp?action=search&ID=");
		out.print(clientes[i].getORMID());
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
<a href="Cliente.jsp">Add Cliente</a>
</center>
</body>
</html>
