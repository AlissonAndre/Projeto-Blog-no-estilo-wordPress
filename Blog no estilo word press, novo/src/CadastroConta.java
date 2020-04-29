
public class CadastroConta {
	
	private String email;
	private String senha;
	private String nomeBlog;
	
	public CadastroConta(String email, String senha, String nomeBlog) {
		this.email = email;
		this.senha = senha;
		this.nomeBlog = nomeBlog;
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
