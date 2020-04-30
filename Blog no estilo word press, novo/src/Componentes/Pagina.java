package Componentes;

public class Pagina {
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//ATRIBUTOS, NÃO UTILIZADOS
	private int numeroPagina = 1;
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//ATRIBUTOS UTILIZADOS
	//atributos que armazenado o numero dos posts em cada pagina
	private int post1;
	private int post2;
	
	//GETTERS E SETTERS
	public int getNumeroPagina() {
		return numeroPagina;
	}

	public int getPost1() {
		return post1;
	}

	public int getPost2() {
		return post2;
	}

	public void setNumeroPagina(int nPagina) {
		this.numeroPagina = nPagina;
	}

	public void setPost1(int post1) {
		this.post1 = post1;
	}

	public void setPost2(int post2) {
		this.post2 = post2;
	}
	
}
