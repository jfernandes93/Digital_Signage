<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: Universidade do Minho
License Type: Academic-->
<html>
<jsp:useBean id="CanalBean" scope="page" class="implementacao.CanalProcessor" />
<jsp:setProperty name="CanalBean" property="*" />
<% String result = CanalBean.process(); %>

<script language="javascript">
<!--
function perform(command)  {
		form1.action.value = command;
		form1.submit();
		return true;
	}
function listAll()  {
		window.location.href = 'CanalList.jsp';
		return true;
	}
// -->
</script>
<head><title>Canal</title>
</head>
<body>
<h1>Canal</h1>
<form method="POST" name="form1" action=Canal.jsp>
	<table>
		<tr>
			<td>*ID : </td>
			<td><input type=text name="ID" value="<jsp:getProperty name="CanalBean" property="ID"/>" /></td>
		</tr>
		<tr>
			<td>Descricao : </td>
			<td><input type=text name="Descricao" value="<jsp:getProperty name="CanalBean" property="descricao"/>" /></td>
		</tr>
		<tr>
			<td>Nome : </td>
			<td><input type=text name="Nome" value="<jsp:getProperty name="CanalBean" property="nome"/>" /></td>
		</tr>
		<tr>
			<td>Cliente_clienteID : </td>
			<td><input type=text name="cliente_clienteID" value="<jsp:getProperty name="CanalBean" property="cliente_clienteID"/>" /></td>
		</tr>
		<tr>
			<td>_player_playerID : </td>
			<td><input type=text name="_player_playerID" value="<jsp:getProperty name="CanalBean" property="_player_playerID"/>" /></td>
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
