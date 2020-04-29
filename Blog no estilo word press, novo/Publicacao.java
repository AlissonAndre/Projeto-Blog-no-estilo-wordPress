
public class Publicacao {
	
	private String tituloPost;
	private String data;
	private String caixaTexto;
	private boolean salvar;
	private boolean apagar;
	private boolean editar;
	private int numeroPost = 0;
	
	
	public Categoria categoriaPost;
	//public Autor infosAutor = new Autor();
	public Cadastro emailAutor = new Cadastro();
	private Pagina numeroPagina;
	private Pagina pagina;
	
	
	public Publicacao(String tituloPost, String data, String caixaTexto) {
		this.tituloPost = tituloPost;
		this.data = data;
		//this.categoriaPost = categoriaPost;
		this.caixaTexto = caixaTexto;
		//this.infosAutor = infosAutor;
		numeroPost++;
	}

	public String getTituloPost() {
		return tituloPost;
	}

	public void setTituloPost(String tituloPost) {
		this.tituloPost = tituloPost;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getCaixaTexto() {
		return caixaTexto;
	}

	public void setCaixaTexto(String caixaTexto) {
		this.caixaTexto = caixaTexto;
	}

	
	public boolean getSalvar() {
		return true;
	}

	public void setSalvar() {
		this.salvar = true;
	}

	public boolean getApagar() {
		return true;
	}

	public void setApagar() {
		this.apagar = true;
	}

	public boolean getEditar() {
		return editar;
	}

	public void setEditar(boolean editar) {
		this.editar = editar;
	}

	public int getNumeroPost() {
		return this.numeroPost;
	}
	
	public void NumeroPost(){
		this.numeroPost++;
	}
	
	public int getVerPagina(int numeroPost) {
		this.numeroPagina = new Pagina(numeroPost);
		return System.out.println(numeroPagina.getNumeroPagina()); 
	}
}