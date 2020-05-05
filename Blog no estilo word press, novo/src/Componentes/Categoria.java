package Componentes;

import java.util.ArrayList;

public class Categoria {
	private String categoria;
	private ArrayList<String> genero;
	
	/*public Categoria(String categoria) {
		this.categoria = categoria;
	}
	
	public Categoria(String categoria, String genero) {
		this.categoria = categoria;
		this.genero = genero;
	}*/

	

	public ArrayList<String> getGenero() {
		return genero;
	}

	public void setGenero(ArrayList<String> genero) {
		this.genero = genero;
	}

	public String getCategoria() {
		return categoria;
	}
	
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
}
