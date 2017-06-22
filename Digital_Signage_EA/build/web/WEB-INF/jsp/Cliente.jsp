<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: Universidade do Minho
License Type: Academic-->
<html>
<jsp:useBean id="ClienteBean" scope="page" class="implementacao.ClienteProcessor" />
<jsp:setProperty name="ClienteBean" property="*" />
<% String result = ClienteBean.process(); %>

<script language="javascript">
<!--
function perform(command)  {
		form1.action.value = command;
		form1.submit();
		return true;
	}
function listAll()  {
		window.location.href = 'ClienteList.jsp';
		return true;
	}
// -->
</script>
<head><title>Cliente</title>
</head>
<body>
<h1>Cliente</h1>
<form method="POST" name="form1" action=Cliente.jsp>
	<table>
		<tr>
			<td>*ID : </td>
			<td><input type=text name="ID" value="<jsp:getProperty name="ClienteBean" property="ID"/>" /></td>
		</tr>
		<tr>
			<td>Nome : </td>
			<td><input type=text name="Nome" value="<jsp:getProperty name="ClienteBean" property="nome"/>" /></td>
		</tr>
		<tr>
			<td>NIF : </td>
			<td><input type=text name="NIF" value="<jsp:getProperty name="ClienteBean" property="NIF"/>" /></td>
		</tr>
		<tr>
			<td>Email : </td>
			<td><input type=text name="Email" value="<jsp:getProperty name="ClienteBean" property="email"/>" /></td>
		</tr>
		<tr>
			<td>Password : </td>
			<td><input type=text name="Password" value="<jsp:getProperty name="ClienteBean" property="password"/>" /></td>
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
