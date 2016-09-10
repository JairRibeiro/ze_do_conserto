package main.java.model;

public class Cliente {
	
	
	
	private String nome;
	private String cpf;
	private String telefone;
	private String celular;
	private String dataNascimento;
	
	private String endereco;
	private String complemento;
	private int numero;
	private String cep;
	private String bairro;
	private String cidade;
	private String estado;
	
	private String email;
	private int recebeEmail;
	
	
	
	
	public Cliente(String nome, String cpf, String telefone, String celular, String dataNascimento, String endereco,
			String complemento, int numero, String cep, String bairro, String cidade, String estado, String email,
			int recebeEmail) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.celular = celular;
		this.dataNascimento = dataNascimento;
		this.endereco = endereco;
		this.complemento = complemento;
		this.numero = numero;
		this.cep = cep;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.email = email;
		this.recebeEmail = recebeEmail;
	}
	
	public Cliente(){
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getRecebeEmail() {
		return recebeEmail;
	}
	public void setRecebeEmail(int recebeEmail) {
		this.recebeEmail = recebeEmail;
	}
	
	
	
}
