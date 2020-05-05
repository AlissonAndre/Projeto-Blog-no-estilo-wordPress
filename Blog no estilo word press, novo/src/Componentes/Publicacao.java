package Componentes;

import java.util.ArrayList;

public class Publicacao extends CadastroConta {

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//ATRIBUTOS
	private String tituloPost;
	private String data;
	private String caixaTexto;
	
	private ArrayList<String> Autor;
	private ArrayList<Categoria> categorias;
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	//construtor
	public Publicacao(CadastroConta conta, String tituloPost, String data, String caixaTexto, String Autor) {
		super(conta.getEmail(), conta.getSenha(), conta.getNomeBlog());
		this.tituloPost = tituloPost;
		this.data = data;
		this.caixaTexto = caixaTexto;
		this.categorias = new ArrayList<Categoria>();
		this.Autor = new ArrayList<String>();
		this.Autor.add(Autor);
	}
	
	public Publicacao(CadastroConta conta, String tituloPost, String data, String caixaTexto, String Autor, String Autor2) {
		super(conta.getEmail(), conta.getSenha(), conta.getNomeBlog());
		this.tituloPost = tituloPost;
		this.data = data;
		this.caixaTexto = caixaTexto;
		this.categorias = new ArrayList<Categoria>();
		this.Autor = new ArrayList<String>();
		this.Autor.add(0, Autor);
		this.Autor.add(1, Autor2);
	}
	
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public ArrayList<String> getAutor() {
		return Autor;
	}

	public void setAutor(ArrayList<String> autor) {
		Autor = autor;
	}

	public ArrayList<Categoria> getCategorias() {
		return categorias;
	}

	public void setCategorias(ArrayList<Categoria> categorias) {
		this.categorias = categorias;
	}

	public void adicionarCategoria(Categoria categoria) {
		// Se ja houver essa categoria nessa lista, a categoria não é adicionada
		for(int indice = 0; indice < categorias.size(); indice++)
			if(categorias.get(indice).getCategoria().contentEquals(categoria.getCategoria()))
				return;	
		categorias.add(categoria);	
	}
	
	public void removerCategoria(Categoria categoria) {
		// Se ja houver essa categoria nessa lista, ele remove a categoria do indice
		for(int indice = 0; indice < categorias.size(); indice++)
			if(categorias.get(indice).getCategoria().contentEquals(categoria.getCategoria()))
				categorias.remove(indice);
				return;
	}
	
	
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

}