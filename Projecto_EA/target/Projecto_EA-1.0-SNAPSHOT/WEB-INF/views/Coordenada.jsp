<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: Universidade do Minho
License Type: Academic-->
<html>
<jsp:useBean id="CoordenadaBean" scope="page" class="implementacao.CoordenadaProcessor" />
<jsp:setProperty name="CoordenadaBean" property="*" />
<% String result = CoordenadaBean.process(); %>

<script language="javascript">
<!--
function perform(command)  {
		form1.action.value = command;
		form1.submit();
		return true;
	}
function listAll()  {
		window.location.href = 'CoordenadaList.jsp';
		return true;
	}
// -->
</script>
<head><title>Coordenada</title>
</head>
<body>
<h1>Coordenada</h1>
<form method="POST" name="form1" action=Coordenada.jsp>
	<table>
		<tr>
			<td>*ID : </td>
			<td><input type=text name="ID" value="<jsp:getProperty name="CoordenadaBean" property="ID"/>" /></td>
		</tr>
		<tr>
			<td>Latitude : </td>
			<td><input type=text name="Latitude" value="<jsp:getProperty name="CoordenadaBean" property="latitude"/>" /></td>
		</tr>
		<tr>
			<td>Longitude : </td>
			<td><input type=text name="Longitude" value="<jsp:getProperty name="CoordenadaBean" property="longitude"/>" /></td>
		</tr>
		<tr>
			<td>_player_playerID : </td>
			<td><input type=text name="_player_playerID" value="<jsp:getProperty name="CoordenadaBean" property="_player_playerID"/>" /></td>
		</tr>
	</table>
	<INPUT type="hidden" name="action" value="">
	<hr>
	<INPUT type="button" value="List All" onclick="return listAll();">
	<INPUT type="button" value="Search" onclick="return perform('search');">
	<INPUT type="button" value="Insert" onclick="return perform('insert');">
	<INPUT type="button" value="Update" onclick="return perform('update');">
	<INPUT type="button" value="Delete" onclick="return perform('delete');">
	<INPUT type="reset">
</form>
<hr>
<h3><b>Result :</b><%=result%></h3>
</body>
</html>
