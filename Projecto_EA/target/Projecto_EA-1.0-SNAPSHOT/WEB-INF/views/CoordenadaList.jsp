<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: Universidade do Minho
License Type: Academic-->
<html>
<head><title>Coordenada List</title>
</head>
<body>
<center>
<h1>Coordenada List</h1>
<table border="1" width="80%">
	<tr>
		<td>ID(PK)</td>
		<td>Latitude</td>
		<td>Longitude</td>
		<td>_player(FK)</td>
		<td></td>
	</tr>
<%
implementacao.Coordenada[] coordenadas = implementacao.CoordenadaDAO.listCoordenadaByQuery(null, null);
for(int i = 0; i < coordenadas.length; i++) {
		out.print("<tr>");
		out.print("<td>");
		out.print(coordenadas[i].getORMID());
		out.print("</td>");
		out.print("<td>");
		out.print(coordenadas[i].getLatitude());
		out.println("</td>");
		out.print("<td>");
		out.print(coordenadas[i].getLongitude());
		out.println("</td>");
		
		implementacao.Player _player = coordenadas[i].get_player();
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
		out.print("<a href=\"Coordenada.jsp?action=search&ID=");
		out.print(coordenadas[i].getORMID());
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
<a href="Coordenada.jsp">Add Coordenada</a>
</center>
</body>
</html>
