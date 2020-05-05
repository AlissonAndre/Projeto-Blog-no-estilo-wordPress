package Componentes;

public abstract class Tema {

	private String corDaPagina;
	private String corDoTexto;
	private String textoNoMeio;
	private String textoMaisAesquerda;
	private String textoMaisAdireita;
	
	public String getCorDaPagina() {
		return corDaPagina;
	}
	public void setCorDaPagina(String corDaPagina) {
		this.corDaPagina = corDaPagina;
	}
	public String getCorDoTexto() {
		return corDoTexto;
	}
	public void setCorDoTexto(String corDoTexto) {
		this.corDoTexto = corDoTexto;
	}
	public String getTextoNoMeio() {
		return textoNoMeio;
	}
	public void setTextoNoMeio(String textoNoMeio) {
		this.textoNoMeio = textoNoMeio;
	}
	public String getTextoMaisAesquerda() {
		return textoMaisAesquerda;
	}
	public void setTextoMaisAesquerda(String textoMaisAesquerda) {
		this.textoMaisAesquerda = textoMaisAesquerda;
	}
	public String getTextoMaisAdireita() {
		return textoMaisAdireita;
	}
	public void setTextoMaisAdireita(String textoMaisAdireita) {
		this.textoMaisAdireita = textoMaisAdireita;
	}
	
	public abstract void imprimeCores();
	
}
	
	
