package Componentes;

import java.util.ArrayList;

public class Categoria {
	private String categoria;
	private ArrayList<String> genero;
	//Construtores
	public Categoria(String categoria) {
		this.categoria = categoria;
	}
	
	public Categoria(String categoria, String genero) {
		this.categoria = categoria;
		this.genero.add(genero);
	}

	//Metodos
	public void AdicionarGenero(String genero) {
		this.genero = new ArrayList<String>();
		this.genero.add(genero);
	}

	public String getCategoria() {
		return categoria;
	}
	
	public ArrayList<String> getGenero() {
		return genero;
	}

	public void imprimeGenero(ArrayList<String> genero) {
		for(int i = 0; i < genero.size(); i++) {
			System.out.println("Genero da categoria: " + genero.get(i));
		}
	}
	
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
}
