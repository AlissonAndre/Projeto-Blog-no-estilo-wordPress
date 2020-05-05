package Blog;
import java.util.ArrayList;
import java.util.Scanner;
import Componentes.Anuncio;
import Componentes.CadastroConta;
import Componentes.Categoria;
import Componentes.Pagina;
import Componentes.Publicacao;

public class Main {

	public static void main(String[] args) {
		//Criação dos vetores de objeto
		ArrayList<Publicacao> posts = new ArrayList<Publicacao>();
		Categoria categoria = new Categoria("");
		CadastroConta conta;
		ArrayList<Pagina> paginas = new ArrayList<Pagina>();
		Anuncio anuncio;
		Publicacao novaPublicacao;
		
		int indicePost = 0;
		int numeroPostsVerificacao = 1;
		int indicePagina = 1;
		int i=0;
		int k=0;
		int l=0;
		int pagina = 0;
		int valor1;
		int valor2;
		int variavelDeControleCategoria = 0;
		int variavelControleDeGenero = 0;
		int verificadorQtdDeAutores = 0;
		int variavelDeControleDoTipoDeConta;
		int valorDeAnuncios;
		int verificadorDeMonetizacao  = 1;
		int indiceAserAtualizado;
		int verificadorDeTema;
		String atualizarDados;
	
		
		//Variaveis do sistema
		String tituloPublicacao;
		String data;
		String caixaTexto;
		String Autor1;
		String Autor2;
		// Variaveis do tema de paginas
		Pagina tema = new Pagina(0,0,0);
		String corPagina = "branco" ;
		String corTexto = "preta"; 
		String textoMeio;
		String textoMaisAdireita;
		String textoMaisAesquerda;
		String genero;
		
		int saida = 0;
		String nome;
		int opt;
		Scanner leitor = new Scanner(System.in);
		//Cadastro de dados da conta
		System.out.println("Bem vindo! \nCadastre sua conta agora: ");
		System.out.println("Primeiro digite seu email: ");
		String email = leitor.nextLine();
		System.out.println("Muito bem! \nAgora escolha uma senha por favor: ");
		String senha = leitor.nextLine(); 
		
		//Nome do blog
		System.out.println("Digite o título do seu blog: ");
		String nomeBlog = leitor.nextLine();	
		System.out.println("Deseja que os posts da sua conta sejam monetizados? \nSe sim digite 1, se não digite 2:");
		variavelDeControleDoTipoDeConta = leitor.nextInt();
		leitor.nextLine();
		if(variavelDeControleDoTipoDeConta == 1) {
			System.out.println("Digite o numero da sua conta bancaria a seguir: ");
			String numeroConta = leitor.nextLine();
			conta = new CadastroConta(email, senha, nomeBlog, numeroConta);
			verificadorDeMonetizacao = 2;
			System.out.println("Conta Monetizada!\nPossuimos um leque padrão de 10 anuncios!\nDeseja diminuir esse leque?"
					+ "\nSe optar por diminuir, as chances de um anuncio em especifico aparecer no acesso de algum de seus posts\n"
					+ "será maior. Digite 1 para manter o tamanho padrão, ou digite 2 para diminui-lo: ");
			valorDeAnuncios = leitor.nextInt();
			if(valorDeAnuncios == 2) {
				System.out.println("Digite um valor menor do que 10: ");
				valorDeAnuncios = leitor.nextInt();
				anuncio = new Anuncio(conta, numeroConta, valorDeAnuncios);
			}else
				anuncio = new Anuncio(conta, numeroConta);
		}else {
			conta = new CadastroConta(email, senha, nomeBlog);
			String semNumero = " ";
			anuncio = new Anuncio(conta, semNumero);
		}
		
		System.out.println("Conta criada com sucesso!");
		
		System.out.println("Possuimos um conjunto de atributos visuais prontinhas para iniciar o seu blog!"
				+ "\nDeseja alterar estes atributos? Se sim digite 2, se não digite 1: ");
		verificadorDeTema = leitor.nextInt();
		leitor.nextLine();
		if(verificadorDeTema == 2) {
			System.out.println("Digite a seguir a cor de fundo de pagina desejada: ");
			corPagina = leitor.nextLine();
			tema.setCorDaPagina(corPagina);
			
			System.out.println("Digite a seguir a cor do texto desejada: ");
			corTexto = leitor.nextLine();
			tema.setCorDoTexto(corTexto);
			
			System.out.println("Escolha a seguir a localização do texto: ");
			System.out.println("1: Texto no meio da pagina: \n"
					+ "2: Texto Mais a esquerda da Página: \n3: Texto Mais a direita da Página:"
					+ "\nDigite o valor numerico de uma dessas opções, por favor : ");
			 switch (opt = leitor.nextInt()) {
			 		case 1:
			 			textoMeio = "ok";
			 			tema.setTextoNoMeio(textoMeio);
			 			break;
			 		case 2:
			 			textoMaisAesquerda = "ok";
			 			tema.setTextoMaisAesquerda(textoMaisAesquerda);
			 			break;
			 		case 3:
			 			textoMaisAdireita = "ok";
			 			tema.setTextoMaisAdireita(textoMaisAdireita);
			 			break;
			 }
			
			System.out.println("Modificação de padrão concluida!");
			
		}else{
			tema.setCorDaPagina(corPagina);
			tema.setCorDoTexto(corTexto);
			textoMeio = "ok";
			tema.setTextoNoMeio(textoMeio);
		}
		
		do {
			System.out.println("\nPara fazer um novo post, digite 1: \n"
					+ "Para listar os posts, digite 2: \n"
					+ "Para editar ou remover um Post, digite 3: \n"
					+ "Para encerrar o programa, digite 4: \n ");
			
			switch(opt = leitor.nextInt()) {
				
				//Fazer publicação
				case 1:
					
					//Titulo da publicação
					System.out.println("Título da publicação: ");
					tituloPublicacao = leitor.nextLine();
					tituloPublicacao = leitor.nextLine();
					//Print de teste
					System.out.println("titulo: " + tituloPublicacao);
					
					//Data
					System.out.println("Digite a data do post: ");
					data = leitor.nextLine();
					//Print de teste
					System.out.println("Data: " + data);
						
					//Assunto do post
					System.out.println("Digite seu texto aqui: ");
					caixaTexto = leitor.nextLine();
					System.out.println("Post: " + caixaTexto);
					
					//Construtor da classe publicacao
					System.out.println("Digite 1 a seguir para informar o Autor desta publicação. \n"
							+ "Ou digite 2 se estiver fazendo uma publicação em conjunto com outro autor!");
					System.out.println("Nosso sistema é limitado a no máximo dois autores por post! ");
					System.out.println("Faça sua escolha: ");
					verificadorQtdDeAutores = leitor.nextInt();
					leitor.nextLine();
					
					if(verificadorQtdDeAutores == 1) {
						System.out.println("Digite o nome do Autor: ");
						Autor1 = leitor.nextLine();
						novaPublicacao = new Publicacao(conta, tituloPublicacao, data, caixaTexto, Autor1);
					}else {
						System.out.println("Digite o nome do primeiro Autor: ");
						Autor1 = leitor.nextLine();
						System.out.println("Digite o nome do segundo Autor: ");
						Autor2 = leitor.nextLine();
						novaPublicacao = new Publicacao(conta, tituloPublicacao, data, caixaTexto, Autor1, Autor2);	
					}
					
					//Categoria
					variavelDeControleCategoria = 0;
					while(variavelDeControleCategoria == 0) {
						System.out.println("Escolha uma categoria uma categoria para o seu post: ");
						categoria = new Categoria(""); 
						categoria.setCategoria(leitor.nextLine());
						novaPublicacao.adicionarCategoria(categoria);
						
						variavelControleDeGenero = 1;
						while(variavelControleDeGenero == 1) {
							System.out.println("Deseja adicionar algum genero a esta categoria?\nSe sim digite 1, se não 2: ");
							variavelControleDeGenero = leitor.nextInt();
							leitor.nextLine();
							if(variavelControleDeGenero == 1) {
								System.out.println("Digite o genero desejado: ");
								genero = leitor.nextLine();
								categoria.AdicionarGenero(genero);
							}else if(variavelControleDeGenero == 2) 
								break;
						}
						
						System.out.println("Digite 0 para adicionar mais uma categoria a esse post, ou 1 para continuar: ");
						variavelDeControleCategoria = leitor.nextInt();
						leitor.nextLine();
						if(variavelDeControleCategoria == 1)
							break;
					}
					
					
					
					while(true) {
						System.out.println("Digite 1 para salvar e publicar o post, ou digite 2 para apaga-lo: ");
						int opcao;
						opcao = leitor.nextInt();
						if(opcao == 1) {
							System.out.println("Deu certo!");
							posts.add(novaPublicacao); 
							//Controle de paginas, nao esta funcionando
							//Indice post representa o numero do post atual
							System.out.println("Post: " + indicePost);

							//Quando existir apenas o primeiro post, esse if armazenara o numero dos posts na pagina, 
							//isso servirá para a listagem de posts por pagina
							int nPost = indicePost;
							Pagina pag = new Pagina(0, 0, 0);
							
							if(indicePost == 0) {
								pag = new Pagina(0, 0, 0, tema);
								pag.setPost1(nPost);
								pag.setPost2(nPost++);
								indicePagina = 1;
								pag.setNumeroPagina(indicePagina);
								
								paginas.add(pag);
								
							}else if( numeroPostsVerificacao <  indicePost){
									numeroPostsVerificacao = indicePost;
									nPost = indicePost;
									pag = new Pagina(0,0,0, tema);
									pag.setPost1(nPost); 
									pag.setPost2(nPost++);
									indicePagina++;
									pag.setNumeroPagina(indicePagina);
									paginas.add(pag);
							}
							indicePost++;
							System.out.println("Publicação concluida com sucesso! ");
							break;
							
						}else if(opcao == 2){
							System.out.println("Publicação apagada com sucesso! ");
							break;
						}else {
							System.out.println("Opção invalida! Tente novamente por favor!");
						}
					}
					break;
					
				//Listagem de publicações
				case 2:
					//todos os posts
					//listagem por nome
					//listagem por pagina
					//listagem por categoria
					System.out.println("\nEscolha uma maneira de listagem no menu a seguir!\nDigite 1 para listar todos os posts: "
							+ "\nDigite 2 para pesquisar um post pelo nome: \n"
							+ "Digite 3 para listar os posts por pagina: \n"
							+ "Digite 4 para listar posts por categoria: \n");
					opt = leitor.nextInt();
					leitor.nextLine();
					System.out.println("Blog " + conta.getNomeBlog());
					switch(opt) {
							
							//listar todos os posts
							case 1: 
								i=0;
								while(i < posts.size()){
									System.out.println("\nTitulo: " + posts.get(i).getTituloPost()); 
									System.out.println("Data: " + posts.get(i).getData());
									for(k = 0; k < posts.get(i).getCategorias().size(); k++) {
										System.out.println("Categoria: " + posts.get(i).getCategorias().get(k).getCategoria());
										posts.get(i).getCategorias().get(k).imprimeGenero(posts.get(i).getCategorias().get(k).getGenero());
									}	
									System.out.println("Texto do post: " + posts.get(i).getCaixaTexto());
									
									for(k = 0; k < posts.get(i).getAutor().size(); k++) {
										System.out.println("Nome do autor: " + posts.get(i).getAutor().get(k));
									}
									System.out.println("Email do Blog: " + conta.getEmail());
									i++;
									if(verificadorDeMonetizacao  == 2) {
										System.out.println("\n$$$$ ANUNCIO $$$");
										anuncio.anuncio();
									}		
									paginas.get(0).imprimeCores();
								}
								
								System.out.println("========================================================");
								break;
								
							//Listagem por nome do post	
							case 2: 
								System.out.println("Digite o titulo do post: ");
								nome = leitor.nextLine();
								for(i=0; i < posts.size(); i++) {
									if(nome.equals(posts.get(i).getTituloPost())) {
										System.out.println("========================================================");
										System.out.println("Titulo: " + posts.get(i).getTituloPost()); 
										System.out.println("Data: " + posts.get(i).getData());
										for(k = 0; k < posts.get(i).getCategorias().size(); k++) {
											System.out.println("Categoria: " + posts.get(i).getCategorias().get(k).getCategoria());
											posts.get(i).getCategorias().get(k).imprimeGenero(posts.get(i).getCategorias().get(k).getGenero());
										}
										System.out.println("Texto do post: " + posts.get(i).getCaixaTexto());
										for(k = 0; k < posts.get(i).getAutor().size(); k++) {
											System.out.println("Nome do autor: " + posts.get(i).getAutor().get(k));
										}
										System.out.println("Email do Blog: " + conta.getEmail());
										System.out.println("Email autor: " + conta.getEmail());
										if(verificadorDeMonetizacao  == 2) {
											System.out.println("\n$$$$ ANUNCIO $$$");
											anuncio.anuncio();
										}
									}
								}
								paginas.get(0).imprimeCores();
								System.out.println("========================================================");
								break;
								
							//Listar por pagina
							case 3: 
								System.out.println("Digite o numero da pagina desejada: ");
								pagina = leitor.nextInt();
								leitor.nextLine();
										
								if(paginas.size() > pagina) {
									valor1 = paginas.get(pagina).getPost1();
									if(posts.size() >= valor1) {
										System.out.println("========================================================");
										System.out.println("Titulo: " + posts.get(valor1).getTituloPost()); 
										System.out.println("Data: " + posts.get(valor1).getData());
										for(k = 0; k < posts.get(valor1).getCategorias().size(); k++) {
											System.out.println("Categoria: " + posts.get(valor1).getCategorias().get(k).getCategoria());
											posts.get(i).getCategorias().get(k).imprimeGenero(posts.get(i).getCategorias().get(k).getGenero());
										}
										System.out.println("Texto do post: " + posts.get(valor1).getCaixaTexto());
										for(k = 0; k < posts.get(valor1).getAutor().size(); k++) {
											System.out.println("Nome do autor: " + posts.get(valor1).getAutor().get(k));
										}
										System.out.println("Email do Blog: " + conta.getEmail());
										System.out.println("Email autor: " + conta.getEmail());	
										valor2 = paginas.get(pagina).getPost2();
										valor2++;
										if(posts.size()> valor2) {
											System.out.println("========================================================");
											System.out.println("Titulo: " + posts.get(valor2).getTituloPost()); 
											System.out.println("Data: " + posts.get(valor2).getData());
											for(k = 0; k < posts.get(valor2).getCategorias().size(); k++) {
												System.out.println("Categoria: " + posts.get(valor2).getCategorias().get(k).getCategoria());
											}
											System.out.println("Texto do post: " + posts.get(valor2).getCaixaTexto());
											for(k = 0; k < posts.get(valor2).getAutor().size(); k++) {
												System.out.println("Nome do autor: " + posts.get(valor2).getAutor().get(k));
											}
											System.out.println("Email do Blog: " + conta.getEmail());
											System.out.println("Email autor: " + conta.getEmail());	
										}
									}	
								}else
									System.out.println("Pagina não existe!");
								
								if(verificadorDeMonetizacao  == 2) {
									System.out.println("\n$$$$ ANUNCIO $$$");
									anuncio.anuncio();
								}
								paginas.get(0).imprimeCores();
								System.out.println("========================================================");
								break;
								
							//Listar por categoria
							case 4:
								System.out.println("Digite a categoria: ");
								nome = leitor.nextLine();
								for(i=0; i < posts.size(); i++) {
									for(int j = 0; j < posts.get(i).getCategorias().size(); j++) {
										if(nome.equals(posts.get(i).getCategorias().get(j).getCategoria())) {
											System.out.println("========================================================");
											System.out.println("Titulo: " + posts.get(i).getTituloPost()); 
											System.out.println("Data: " + posts.get(i).getData());
											for(k = 0; k < posts.get(i).getCategorias().size(); k++) {
												System.out.println("Categoria: " + posts.get(i).getCategorias().get(k).getCategoria());
												posts.get(i).getCategorias().get(k).imprimeGenero(posts.get(i).getCategorias().get(k).getGenero());
											}
											System.out.println("Texto do post: " + posts.get(i).getCaixaTexto());
											for(k = 0; k < posts.get(i).getAutor().size(); k++) {
												System.out.println("Nome do autor: " + posts.get(i).getAutor().get(k));
											}
											System.out.println("Email do Blog: " + conta.getEmail());
										}
									}
								}
								if(indicePost>1) {
									if(verificadorDeMonetizacao  == 2) {
										System.out.println("\n$$$$ ANUNCIO $$$");
										anuncio.anuncio();
									}
								}
								paginas.get(0).imprimeCores();
								System.out.println("========================================================");
								break;
								
							default: 
								System.out.println("\nOpção invalida! Tente novamente!\n");
								break;
					}
					break;
										
				case 3:
					//Editar Post por indice
					System.out.println("Digite 1 para editar um post pelo indice, \nou digite 2 para remover um post por indice: ");
					indiceAserAtualizado = leitor.nextInt();
					leitor.nextLine();
					if(indiceAserAtualizado == 1) {
						System.out.println("Digite o indice do post a ser atualizado: ");
						indiceAserAtualizado = leitor.nextInt();
						leitor.nextLine();
						System.out.println("Digite 1 se deseja atualizar o titulo, data e texto da publicação: "
								+ "\nDigite 2 se deseja editar uma categoria ou mais categorias do post: ");
						i = leitor.nextInt();
						leitor.nextLine();
						if(i == 1) {
							System.out.println("Digite o novo titulo: ");
							atualizarDados = leitor.nextLine();
							posts.get(indiceAserAtualizado).setTituloPost(atualizarDados);
							System.out.println("Digite a nova data: ");
							atualizarDados = leitor.nextLine();
							posts.get(indiceAserAtualizado).setData(atualizarDados);
							System.out.println("Digite o novo texto: ");
							atualizarDados = leitor.nextLine();
							posts.get(indiceAserAtualizado).setCaixaTexto(atualizarDados);
							System.out.println("Edição concluida!");
						}else if(i == 2) {
							System.out.println("Escolha uma categoria entre as castegorias a seguir para alterar! ");
							for(i = 0; i < posts.get(indiceAserAtualizado).getCategorias().size(); i ++) {
								System.out.println(" Categoria: "  
								+ posts.get(indiceAserAtualizado).getCategorias().get(i).getCategoria());
							}
							System.out.println("Digite a categoria escolhida para alterar : ");
							Categoria cat = new Categoria("");
						    cat.setCategoria(leitor.nextLine());
						    posts.get(indiceAserAtualizado).removerCategoria(cat);
						    
						    System.out.println("Digite o novo nome da categoria: ");
						    cat.setCategoria(leitor.nextLine());
						    posts.get(indiceAserAtualizado).adicionarCategoria(cat);
		
							System.out.println("Edição concluida!");
						}else {
							System.out.println("Escolha invalida! Volte ao menu!");
						}
						
					}else if(indiceAserAtualizado == 2) {
						System.out.println("Digite o indice do post a ser removido: ");
						indiceAserAtualizado = leitor.nextInt();
						leitor.nextLine();
						posts.remove(indiceAserAtualizado);
					}else {
						System.out.println("Indice invalido!");
					}
					
					break;
				//Sair do lista	
				case 4:
					saida = 4;
					System.out.println("Sistema encerrado!");
					break;
				
				default: 
					System.out.println("\nOpção invalida tente novamente!\n");
					break;
				}
			}while(saida != 4);
		}
	}
