<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: Universidade do Minho
License Type: Academic-->
<html>
<head><title>FeedRSS List</title>
</head>
<body>
<center>
<h1>FeedRSS List</h1>
<table border="1" width="80%">
	<tr>
		<td>ID(PK)</td>
		<td>URL</td>
		<td></td>
	</tr>
<%
implementacao.FeedRSS[] feedRSSs = implementacao.FeedRSSDAO.listFeedRSSByQuery(null, null);
for(int i = 0; i < feedRSSs.length; i++) {
		out.print("<tr>");
		out.print("<td>");
		out.print(feedRSSs[i].getORMID());
		out.print("</td>");
		out.print("<td>");
		out.print(feedRSSs[i].getURL());
		out.println("</td>");
		out.print("<td>");
		out.print("<a href=\"FeedRSS.jsp?action=search&ID=");
		out.print(feedRSSs[i].getORMID());
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
<a href="FeedRSS.jsp">Add FeedRSS</a>
</center>
</body>
</html>
