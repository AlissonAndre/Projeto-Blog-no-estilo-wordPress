package Componentes;

public class Publicacao {

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//ATRIBUTOS
	private String tituloPost;
	private String data;
	private String caixaTexto;
	private String sobreAutor;
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	//construtor
	public Publicacao(String tituloPost, String data, String caixaTexto) {
		this.tituloPost = tituloPost;
		this.data = data;
		this.caixaTexto = caixaTexto;
	}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//getter e setters
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

	public String getSobreAutor() {
		return sobreAutor;
	}
	
	public void setSobreAutor(String sobreAutor) {
		this.sobreAutor = sobreAutor;
	}
}