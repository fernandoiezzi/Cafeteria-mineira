<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import="br.com.cafeteriamineira.model.dao.ClienteDao" %>
 <%@ page import="br.com.cafeteriamineira.model.entidade.Cliente" %>
 <%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listagem de clientes</title>
</head>
<body>
<h1>Listagem de clientes</h1>
<%
String buscaCliente = "";

if(request.getParameter("buscaCliente") != null){
buscaCliente = request.getParameter("buscaCliente");
}
%>
<table>
<thead>
<tr>
<th>Nome</th>
<th>Telefone</th>
<th>Endereço</th>
<th>Cidade</th>
<th>Bairro</th>
<th>Estado</th>
<th>Gestão</th>
</tr>
</thead>

<tbody>
<% 
ClienteDao cdao = new ClienteDao();
List<Cliente> cliente = cdao.listar(buscaCliente);
for(Cliente c: cliente) { %>
<tr>
<td><%= c.getNome() %></td>
<td><%= c.getTelefone() %></td>
<td><%= c.getEndereco() %></td>
<td><%= c.getCidade() %></td>
<td><%= c.getEstado() %></td>
<td></td>
</tr>
<% } %>
</tbody>
</table>
</body>
</html>