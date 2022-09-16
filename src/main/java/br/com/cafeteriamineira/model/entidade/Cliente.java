package br.com.cafeteriamineira.model.entidade;

public class Cliente {
 private long id_cliente;;
 private String nome;
 private String endereco;
 private String telefone;
 private String cidade;
 private String bairro;
 private String estado;
 
 public Cliente() {
	 this.id_cliente = 0;
	 this.nome = "";
	 this.endereco = "";
	 this.telefone = "";
	 this.cidade = "";
	 this.bairro = "";
	 this.estado = "";
 }
 
 public Cliente(int id, String n, String end, String tel, String cid, String bairro, String est) {
	 this.id_cliente = id;
	 this.nome = n;
	 this.endereco = end;
	 this.telefone = tel;
	 this.cidade = cid;
	 this.bairro = bairro;
	 this.estado = est;
 }

public long getId_cliente() {
	return id_cliente;
}

public void setId_cliente(long id_cliente) {
	this.id_cliente = id_cliente;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getEndereco() {
	return endereco;
}

public void setEndereco(String endereco) {
	this.endereco = endereco;
}

public String getTelefone() {
	return telefone;
}

public void setTelefone(String telefone) {
	this.telefone = telefone;
}

public String getCidade() {
	return cidade;
}

public void setCidade(String cidade) {
	this.cidade = cidade;
}

public String getBairro() {
	return bairro;
}

public void setBairro(String bairro) {
	this.bairro = bairro;
}

public String getEstado() {
	return estado;
}

public void setEstado(String estado) {
	this.estado = estado;
}

 
 
}
