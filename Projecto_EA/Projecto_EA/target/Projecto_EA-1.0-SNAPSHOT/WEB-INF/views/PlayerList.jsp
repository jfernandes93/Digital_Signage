<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: Universidade do Minho
License Type: Academic-->
<html>
<head><title>Player List</title>
</head>
<body>
<center>
<h1>Player List</h1>
<table border="1" width="80%">
	<tr>
		<td>ID(PK)</td>
		<td>Nome</td>
		<td>Descricao</td>
		<td>Tamanho</td>
		<td>Estado</td>
		<td>_rede(FK)</td>
		<td>_canal(FK)</td>
		<td>_coordenada(FK)</td>
		<td></td>
	</tr>
<%
implementacao.Player[] players = implementacao.PlayerDAO.listPlayerByQuery(null, null);
for(int i = 0; i < players.length; i++) {
		out.print("<tr>");
		out.print("<td>");
		out.print(players[i].getORMID());
		out.print("</td>");
		out.print("<td>");
		out.print(players[i].getNome());
		out.println("</td>");
		out.print("<td>");
		out.print(players[i].getDescricao());
		out.println("</td>");
		out.print("<td>");
		out.print(players[i].getTamanho());
		out.println("</td>");
		out.print("<td>");
		out.print(players[i].getEstado());
		out.println("</td>");
		
		implementacao.Rede _rede = players[i].get_rede();
		if(_rede != null) {
			out.print("<td>");
			out.print("<a href=\"Rede.jsp?action=search&ID=");
			out.print(_rede.getORMID());
			out.print("\">");
			out.print(_rede.getORMID());
			out.print("</a>");
			out.println("</td>");
		}
		
		else
 {
out.println("<td></td>");
		}
		
		
		implementacao.Canal _canal = players[i].get_canal();
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
		
		
		implementacao.Coordenada _coordenada = players[i].get_coordenada();
		if(_coordenada != null) {
			out.print("<td>");
			out.print("<a href=\"Coordenada.jsp?action=search&ID=");
			out.print(_coordenada.getORMID());
			out.print("\">");
			out.print(_coordenada.getORMID());
			out.print("</a>");
			out.println("</td>");
		}
		
		else
 {
out.println("<td></td>");
		}
		
		out.print("<td>");
		out.print("<a href=\"Player.jsp?action=search&ID=");
		out.print(players[i].getORMID());
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
<a href="Player.jsp">Add Player</a>
</center>
</body>
</html>
