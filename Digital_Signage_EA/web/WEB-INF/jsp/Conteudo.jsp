<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: Universidade do Minho
License Type: Academic-->
<html>
<jsp:useBean id="ConteudoBean" scope="page" class="implementacao.ConteudoProcessor" />
<jsp:setProperty name="ConteudoBean" property="*" />
<% String result = ConteudoBean.process(); %>

<script language="javascript">
<!--
function perform(command)  {
		form1.action.value = command;
		form1.submit();
		return true;
	}
function listAll()  {
		window.location.href = 'ConteudoList.jsp';
		return true;
	}
// -->
</script>
<head><title>Conteudo</title>
</head>
<body>
<h1>Conteudo</h1>
<form method="POST" name="form1" action=Conteudo.jsp>
	<table>
		<tr>
			<td>*ID : </td>
			<td><input type=text name="ID" value="<jsp:getProperty name="ConteudoBean" property="ID"/>" /></td>
		</tr>
		<tr>
			<td>Duracao : </td>
			<td><input type=text name="Duracao" value="<jsp:getProperty name="ConteudoBean" property="duracao"/>" /></td>
		</tr>
		<tr>
			<td>Reproducoes : </td>
			<td><input type=text name="Reproducoes" value="<jsp:getProperty name="ConteudoBean" property="reproducoes"/>" /></td>
		</tr>
		<tr>
			<td>_canal_canalID : </td>
			<td><input type=text name="_canal_canalID" value="<jsp:getProperty name="ConteudoBean" property="_canal_canalID"/>" /></td>
		</tr>
		<tr>
			<td>_conteudo_tipoID : </td>
			<td><input type=text name="_conteudo_tipoID" value="<jsp:getProperty name="ConteudoBean" property="_conteudo_tipoID"/>" /></td>
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
