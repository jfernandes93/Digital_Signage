<!-- "Visual Paradigm: DO NOT MODIFY THIS FILE!"

This is an automatic generated file. It will be regenerated every time 
you generate persistence class.

Modifying its content may cause the program not work, or your work may lost.-->

<!-- Licensee: Universidade do Minho
License Type: Academic-->
<html>
<jsp:useBean id="FeedRSSBean" scope="page" class="implementacao.FeedRSSProcessor" />
<jsp:setProperty name="FeedRSSBean" property="*" />
<% String result = FeedRSSBean.process(); %>

<script language="javascript">
<!--
function perform(command)  {
		form1.action.value = command;
		form1.submit();
		return true;
	}
function listAll()  {
		window.location.href = 'FeedRSSList.jsp';
		return true;
	}
// -->
</script>
<head><title>FeedRSS</title>
</head>
<body>
<h1>FeedRSS</h1>
<form method="POST" name="form1" action=FeedRSS.jsp>
	<table>
		<tr>
			<td>*ID : </td>
			<td><input type=text name="ID" value="<jsp:getProperty name="FeedRSSBean" property="ID"/>" /></td>
		</tr>
		<tr>
			<td>URL : </td>
			<td><input type=text name="URL" value="<jsp:getProperty name="FeedRSSBean" property="URL"/>" /></td>
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
