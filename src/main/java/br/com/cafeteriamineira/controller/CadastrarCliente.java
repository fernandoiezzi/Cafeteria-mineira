package br.com.cafeteriamineira.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import br.com.cafeteriamineira.model.dao.ClienteDao;
import br.com.cafeteriamineira.model.entidade.Cliente;

/**
 * Servlet implementation class CadastrarCliente
 */
public class CadastrarCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CadastrarCliente() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nome");
		String telefone = request.getParameter("telefone");
		String endereco = request.getParameter("endereco");
		String cidade = request.getParameter("cidade");
		String bairro = request.getParameter("bairro");
		String estado = request.getParameter("estado");
		
		Cliente c = new Cliente();
		c.setNome(nome);
		c.setTelefone(telefone);
		c.setEndereco(endereco);
		c.setCidade(cidade);
		c.setBairro(bairro);
		c.setEstado(estado);
		
		ClienteDao cdao = new ClienteDao();
		boolean retornocliente = cdao.incluir(c);
		response.sendRedirect("listarclientes.jsp");
	}

}
