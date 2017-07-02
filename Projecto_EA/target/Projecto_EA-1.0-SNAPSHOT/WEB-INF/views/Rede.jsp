<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: Universidade do Minho
License Type: Academic-->
<html>
<jsp:useBean id="RedeBean" scope="page" class="implementacao.RedeProcessor" />
<jsp:setProperty name="RedeBean" property="*" />
<% String result = RedeBean.process(); %>

<script language="javascript">
<!--
function perform(command)  {
		form1.action.value = command;
		form1.submit();
		return true;
	}
function listAll()  {
		window.location.href = 'RedeList.jsp';
		return true;
	}
// -->
</script>
<head><title>Rede</title>
</head>
<body>
<h1>Rede</h1>
<form method="POST" name="form1" action=Rede.jsp>
	<table>
		<tr>
			<td>*ID : </td>
			<td><input type=text name="ID" value="<jsp:getProperty name="RedeBean" property="ID"/>" /></td>
		</tr>
		<tr>
			<td>Descricao : </td>
			<td><input type=text name="Descricao" value="<jsp:getProperty name="RedeBean" property="descricao"/>" /></td>
		</tr>
		<tr>
			<td>Nome : </td>
			<td><input type=text name="Nome" value="<jsp:getProperty name="RedeBean" property="nome"/>" /></td>
		</tr>
		<tr>
			<td>_cliente_clienteID : </td>
			<td><input type=text name="_cliente_clienteID" value="<jsp:getProperty name="RedeBean" property="_cliente_clienteID"/>" /></td>
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
