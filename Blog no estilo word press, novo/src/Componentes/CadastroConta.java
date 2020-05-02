package Componentes;

public class CadastroConta {
	
	private String email;
	private String senha;
	private String contaBancaria;
	private String nomeBlog;
	private String tipoDaconta;
	
	public CadastroConta(String email, String senha, String nomeBlog) {
		this.email = email;
		this.senha = senha;
		this.nomeBlog = nomeBlog;
		this.tipoDaconta = "nao monetizada";
	}
	
	public String getTipoDaconta() {
		return tipoDaconta;
	}

	public void setTipoDaconta(String tipoDaconta) {
		this.tipoDaconta = tipoDaconta;
	}

	public CadastroConta(String email, String senha, String nomeBlog, String numeroDaConta) {
		this.email = email;
		this.senha = senha;
		this.nomeBlog = nomeBlog;
		this.contaBancaria = numeroDaConta;
		this.tipoDaconta = "monetizada";
	}
	
	public String getContaBancaria() {
		return contaBancaria;
	}

	public void setContaBancaria(String contaBancaria) {
		this.contaBancaria = contaBancaria;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public String getNomeBlog() {
		return nomeBlog;
	}

	public void setNomeBlog(String nomeBlog) {
		this.nomeBlog = nomeBlog;
	}
}
