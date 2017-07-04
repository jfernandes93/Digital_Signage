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


		$('form').on('submit',function (e) {
    e.preventDefault();
    $.ajax({
        url: 'localhost:8080/dsignage/Cliente',
        cache: false,
        type: 'POST',
        data : $('form').serialize(),
        success: function(json) {
        alert('all done');
    }
    });
});
	

</script>
<head><title>Cliente</title>
</head>
<body>
<h1>Cliente</h1>
<form id="form" method="POST" name="form1" action="/rest/cliente" >
	<table>
		<tr>
			<td>Nome : </td>
			<td><input type=text name="Nome" /> </td>
		</tr>
		<tr>
			<td>NIF : </td>
			<td><input type=text name="NIF" /></td>
		</tr>
		<tr>
			<td>Email : </td>
			<td><input type=text name="Email"  /></td>
		</tr>
		<tr>
			<td>Password : </td>
			<td><input type=text name="Password"  /></td>
		</tr>
	</table>
	
	<input type="submit" value="Enviar" >
	
</form>
<hr>
<h3><b>Result :</b><%=result%></h3>
</body>
</html>
