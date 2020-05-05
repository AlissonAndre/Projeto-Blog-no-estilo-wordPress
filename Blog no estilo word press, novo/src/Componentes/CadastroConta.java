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
	
	public CadastroConta(String email, String senha, String nomeBlog, String numeroDaConta) {
		this.email = email;
		this.senha = senha;
		this.nomeBlog = nomeBlog;
		this.contaBancaria = numeroDaConta;
		this.tipoDaconta = "monetizada";
	}
	
	public String getTipoDaconta() {
		return tipoDaconta;
	}

	public void setTipoDaconta(String tipoDaconta) {
		this.tipoDaconta = tipoDaconta;
	}

	public String getContaBancaria() {
		return contaBancaria;
	}

	public String getEmail() {
		return email;
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
}
