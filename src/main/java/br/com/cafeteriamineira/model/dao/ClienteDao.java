package br.com.cafeteriamineira.model.dao;

import java.sql.PreparedStatement;

import br.com.cafeteriamineira.model.entidade.Cliente;

public class ClienteDao extends Conexao {

	public boolean incluir (Cliente cliente) {
		boolean ok = false;
		String sql = "insert into cliente(nome, telefone, endereco, cidade, bairro, estado) " + " values(?, ?, ? , ?, ?, ?)";
		
		try {
			PreparedStatement ps = criarConexao().prepareStatement(sql);
			ps.setString(1, cliente.getNome());
			ps.setString(2, cliente.getTelefone());
			ps.setString(3, cliente.getEndereco());
			ps.setString(4, cliente.getCidade());
			ps.setString(5, cliente.getBairro());
			ps.setString(6, cliente.getEstado());
			
			ok = ps.execute();
			}catch (Exception e) {
				e.printStackTrace();
				ok = false;
			} finally {
				fecharConexao();
			}
		return ok;
	}

}
