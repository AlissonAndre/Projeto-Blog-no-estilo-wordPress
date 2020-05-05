package Componentes;

public class Pagina extends Tema{
	private int numeroPagina = 1;
	//atributos que armazenado o numero dos posts em cada pagina
	private int post1;
	private int post2;
	

	public Pagina(int numeroPagina, int post1, int post2) {
		this.numeroPagina = numeroPagina;
		this.post1 = post1;
		this.post2 = post2;
	}
	
	public Pagina(int numeroPagina, int post1, int post2, Pagina tema) {
		this.numeroPagina = numeroPagina;
		this.post1 = post1;
		this.post2 = post2;
		this.setCorDaPagina(tema.getCorDaPagina());
		this.setCorDoTexto(tema.getCorDoTexto());
		this.setTextoMaisAdireita(tema.getTextoMaisAdireita());
		this.setTextoMaisAesquerda(tema.getTextoMaisAesquerda());
		this.setTextoNoMeio(tema.getTextoNoMeio());
	}

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

	@Override
	public void imprimeCores() {
		System.out.println("Cor de fundo: " + this.getCorDaPagina());
		System.out.println("Cor do texto: " + this.getCorDoTexto());
	}	
}
