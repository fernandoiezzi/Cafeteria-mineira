<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro de cliente</title>
</head>
<body>
<h1>Cadastro de clientes</h1>
<form method="post" action="CadastrarCliente">
<label>Digite o seu nome:</label>
<input type="text" name="nome" required><br>
<label>Digite o seu telefone:</label>
<input type="text" name="telefone" required><br>
<label>Digite o seu endereço:</label>
<input type="text" name="endereco" required><br>
<label>Digite a sua cidade:</label>
<input type="text" name="cidade" required><br>
<label>Digite o seu bairro:</label>
<input type="text" name="bairro" required><br>
<label>Digite o seu estado</label>
<input type="text" name="estado" required><br>
<input type="submit" value="Cadastrar">
<input type="reset" value="Limpar">
</form>
</body>
</html>