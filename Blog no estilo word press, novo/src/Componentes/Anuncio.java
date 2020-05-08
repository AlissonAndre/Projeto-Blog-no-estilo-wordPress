package Componentes;
import java.util.Random;

public class Anuncio extends CadastroConta {
	int valorAleatorio;
	private String numeroDaConta;
	private int numeroDeAnuncios = 10;
	private double ganhos;
	

	public Anuncio(CadastroConta c, String numeroDaConta) {
		super(c.getEmail(), c.getSenha(), c.getNomeBlog());
		this.numeroDaConta = numeroDaConta;
	}
	
	public Anuncio(CadastroConta c, String numeroDaConta, int alterarNumeroAnuncios) {
		super(c.getEmail(), c.getSenha(), c.getNomeBlog());
		this.numeroDaConta = numeroDaConta;
		this.numeroDeAnuncios = alterarNumeroAnuncios;
		this.ganhos = 0;
	}
	
	public String getNumeroDaConta() {
		return numeroDaConta;
	}

	public void setNumeroDaConta(String numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}

	public double getGanhos() {
		return ganhos;
	}


	Random num = new Random();
	public void anuncio() {
		
		switch(valorAleatorio = num.nextInt(numeroDeAnuncios)) {
			
			case 0: 
				System.out.println("\n$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
				System.out.println("Supermecados Bruda: Comprem Conosco!!");
				System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n");
				ganhos = ganhos + 0.7;
				break;
			
			case 1: 
				System.out.println("\n$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
				System.out.println("Supermecados Haag: Comprem Conosco!!");
				System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n");
				ganhos = ganhos + 0.3;
				break;	
			
			case 2: 
				System.out.println("\n$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
				System.out.println("Oi, eu sou o Dollynho, seu amiguinho, vamos brincar??");
				System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n");
				ganhos = ganhos + 2;
				break;
			
			case 3: 
				System.out.println("\n$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
				System.out.println("A Casa dos Esportes é a loja de todas as torcidas. Grande promoção de camisetas do seu time do coração."
						+ " \nAlém disso, tudo para a pratica esportivas seja qual for à modalidade. Visite a Casa dos Esportes");
				System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n");
				ganhos = ganhos + 0.5;
				break;	
			
			case 4: 
				System.out.println("\n$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
				System.out.println("O Dia dos Pais está chegando. Procurando um presente para ele? Pois nós temos a dica certa: Casa dos Esportes.\n "
						+ "Lá você vai encontrar aquilo que procura para dizer através de um presente, o quanto ele é importante para você.");
				System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n");
				ganhos = ganhos + 0.10;
				break;
				
			case 5: 
				System.out.println("\n$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
				System.out.println("Espante o Streess. A Casa dos Esportes têm a melhor receita para você arejar a cabeça.\n "
						+ "Que tal uma pescaria, caçada ou acampamento? – \n"
						+ "Tudo em caça, pesca e camping você encontra na Casa dos Esportes de São Domingos.\n "
						+ "Barracas, fogareiros, anzóis, redes e tarrafas e demais apetrechos. Fique longe do Stress.\n"
						+ " Na hora de relaxar, relaxe com os melhores preços a vista, \n"
						+ "as melhores condições a prazo e o atendimento da Casa dos Esportes.");
				System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n");
				ganhos = ganhos + 0.30;
				break;
				
			case 6: 
				System.out.println("\n$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
				System.out.println("Mantenha-se com boa saúde. Afinal ela é o bem mais precioso que você possui.\n"
						+ " Sempre que ela inspirar cuidados, consulte o médico. Depois, traga sua receita até a farmácia Silva.");
				System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n");
				ganhos = ganhos + 0.1;
				break;	
				
			case 7: 
				System.out.println("\n$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
				System.out.println("Na hora de fazer sua carteira de motorista, você precisa ter ao seu lado a experiência\n "
						+ "do Centro de Formação de Condutores Malta. Aprenda a dirigir com as aulas práticas e teóricas ministradas\n "
						+ "por professores capacitados e sintonizados com as rígidas leis do transito.\n"
						+ " Bons motoristas saem do Centro de Formação de Condutores Malta.");
				System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n");
				ganhos = ganhos + 0.8;
				break;
				
			case 8: 
				System.out.println("\n$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
				System.out.println("Silva Moveis e Eletrodomésticos oferece opções em moveis, seja qual for o seu estilo. \n"
						+ "Visite nosso Show room e comprove. Primamos por fornecedores com nome sedimentado no mercado, \n"
						+ "o que garante aquilo que vendemos. Seja moveis ou eletrodomésticos nossa loja têm aquilo que você procura. \n"
						+ "Consulte nossas condições de pagamento ou apresente a sua proposta. Estamos prontos para negociar com você");
				System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n");
				ganhos = ganhos + 0.14;
				break;	
				
			case 9: 
				System.out.println("\n$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
				System.out.println("Você que visita nossa cidade, a trabalho ou a passeio, hospede-se no Silva Hotel. \n"
						+ "Atendimento de primeira. Quartos, apartamentos e suítes com o máximo de conforto, privacidade e tranqüilidade.\n"
						+ " Silva Hotel conta com amplo estacionamento e tudo o que você procura num bom hotel.");
				System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n");
				ganhos = ganhos + 0.20;
				break;			
		}
	}	
}
