package Componentes;

import java.util.ArrayList;

public class Publicacao {

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//ATRIBUTOS
	private String tituloPost;
	private String data;
	private String caixaTexto;
	private String sobreAutor;
	
	private ArrayList<Categoria> categorias;
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	//construtor
	public Publicacao(String tituloPost, String data, String caixaTexto) {
		this.tituloPost = tituloPost;
		this.data = data;
		this.caixaTexto = caixaTexto;
		this.categorias = new ArrayList<Categoria>();
	}
	
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
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

	public String getSobreAutor() {
		return sobreAutor;
	}
	
	public void setSobreAutor(String sobreAutor) {
		this.sobreAutor = sobreAutor;
	}
}