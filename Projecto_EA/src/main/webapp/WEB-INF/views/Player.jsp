<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: Universidade do Minho
License Type: Academic-->
<html>
<jsp:useBean id="PlayerBean" scope="page" class="implementacao.PlayerProcessor" />
<jsp:setProperty name="PlayerBean" property="*" />
<% String result = PlayerBean.process(); %>

<script language="javascript">
<!--
function perform(command)  {
		form1.action.value = command;
		form1.submit();
		return true;
	}
function listAll()  {
		window.location.href = 'PlayerList.jsp';
		return true;
	}
// -->
</script>
<head><title>Player</title>
</head>
<body>
<h1>Player</h1>
<form method="POST" name="form1" action=Player.jsp>
	<table>
		<tr>
			<td>*ID : </td>
			<td><input type=text name="ID" value="<jsp:getProperty name="PlayerBean" property="ID"/>" /></td>
		</tr>
		<tr>
			<td>Nome : </td>
			<td><input type=text name="Nome" value="<jsp:getProperty name="PlayerBean" property="nome"/>" /></td>
		</tr>
		<tr>
			<td>Descricao : </td>
			<td><input type=text name="Descricao" value="<jsp:getProperty name="PlayerBean" property="descricao"/>" /></td>
		</tr>
		<tr>
			<td>Tamanho : </td>
			<td><input type=text name="Tamanho" value="<jsp:getProperty name="PlayerBean" property="tamanho"/>" /></td>
		</tr>
		<tr>
			<td>Estado : </td>
			<td><input type=text name="Estado" value="<jsp:getProperty name="PlayerBean" property="estado"/>" /></td>
		</tr>
		<tr>
			<td>_rede_redeID : </td>
			<td><input type=text name="_rede_redeID" value="<jsp:getProperty name="PlayerBean" property="_rede_redeID"/>" /></td>
		</tr>
		<tr>
			<td>_canal_canalID : </td>
			<td><input type=text name="_canal_canalID" value="<jsp:getProperty name="PlayerBean" property="_canal_canalID"/>" /></td>
		</tr>
		<tr>
			<td>_coordenada_coordenadaID : </td>
			<td><input type=text name="_coordenada_coordenadaID" value="<jsp:getProperty name="PlayerBean" property="_coordenada_coordenadaID"/>" /></td>
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
