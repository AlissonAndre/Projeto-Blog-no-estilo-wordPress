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
		Categoria categoria = new Categoria();
		int indicePost = 1;
		int numeroPostsVerificacao = 1;
		int indicePagina = 1;
		int i=0;
		int pagina = 0;
		ArrayList<Pagina> paginas = new ArrayList<Pagina>();
		Anuncio anuncio = new Anuncio();
		
		//Variaveis do sistema
		String tituloPublicacao;
		String data;
		String caixaTexto; 
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
		System.out.println("Conta criada com sucesso!\nDigite o título do seu blog: ");
		String nomeBlog = leitor.nextLine();	
		System.out.println("Conta criada com sucesso!");
		CadastroConta conta = new CadastroConta(email, senha, nomeBlog);
		
		
		do {
			System.out.println("\nPara fazer um novo post, digite 1: \n"
					+ "Para listar os posts, digite 2: \n"
					+ "Para encerrar o programa, digite 3:\n ");
			
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
					
					//Categoria
					System.out.println("Escolha uma categoria uma categoria, por favor");
					categoria = new Categoria(); 
					categoria.setCategoria(leitor.nextLine());
					//print de teste
					System.out.println("Categoria: " + categoria.getCategoria());
				
					//Assunto do post
					System.out.println("Digite seu texto aqui: ");
					caixaTexto = leitor.nextLine();
					System.out.println("Post: " + caixaTexto);
					
					//Construtor classe publicacao
					Publicacao nova = new Publicacao(tituloPublicacao, data, caixaTexto);
					nova.adicionarCategoria(categoria);
					
					
					
					while(true) {
						System.out.println("Digite 1 para salvar e publicar o post, ou digite 2 para apaga-lo: ");
						int opcao;
						opcao = leitor.nextInt();
						if(opcao == 1) {
							System.out.println("Deu certo!");
							posts.add(nova); 
							//Controle de paginas, nao esta funcionando
							//Indice post representa o numero do post atual
							System.out.println("Post: " + indicePost);
							//vetorPost[indicePost].setNumeroPagina(indicePost);
							//Quando existir apenas o primeiro post, esse if armazenara o numero dos posts na pagina, 
							//isso servirá para a listagem de posts por pagina
							int nPost = indicePost;
							Pagina pag = new Pagina();
							if(indicePost == 1) {
								pag.setPost1(nPost);
								pag.setPost2(nPost++);
								indicePagina = 1;
								pag.setNumeroPagina(indicePagina);
								paginas.add(pag);
								
							}else if( numeroPostsVerificacao + 1 <  indicePost){
									numeroPostsVerificacao = indicePost;
									pag = new Pagina();
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
								i=1;
								while(i < posts.size()){
									System.out.println("Indice" + indicePost + 
											"\n========================================================\n" + "Valor de i " + i);
									System.out.println("Titulo: " + posts.get(i).getTituloPost()); 
									System.out.println("Data: " + posts.get(i).getData());
									//System.out.println("Categoria: " + posts.get(i).getCategoria());
									System.out.println("Texto do post: " + posts.get(i).getCaixaTexto());
									System.out.println("Email autor: " + conta.getEmail());
									i++;
									System.out.println("\n$$$$ ANUNCIO $$$");
									anuncio.anuncio();
								}
								
								System.out.println("========================================================");
								break;
								
							//Listagem por nome do post	
							case 2: 
								System.out.println("Digite o titulo do post: ");
								nome = leitor.nextLine();
								for(i=1; i < posts.size(); i++) {
									if(nome.equals(posts.get(i).getTituloPost())) {
										System.out.println("========================================================");
										System.out.println("Titulo: " + posts.get(i).getTituloPost()); 
										System.out.println("Data: " + posts.get(i).getData());
										//System.out.println("Categoria: " + categoria[i].getCategoria());
										System.out.println("Texto do post: " + posts.get(i).getCaixaTexto());
										System.out.println("Email autor: " + conta.getEmail());
										System.out.println("\n$$$$ ANUNCIO $$$");
										anuncio.anuncio();
									}
								}
								System.out.println("========================================================");
								break;
								
							//Listar por pagina
							case 3: 
								System.out.println("Digite o numero da pagina desejada: ");
								pagina = leitor.nextInt();
								leitor.nextLine();
										
								int post1 = paginas.get(pagina).getPost1();
								if(paginas.get(post1) != null) {
									System.out.println("========================================================");
									System.out.println("Titulo: " + posts.get(post1).getTituloPost()); 
									System.out.println("Data: " + posts.get(post1).getData());
									//System.out.println("Categoria: " + categoria[post1].getCategoria());
									System.out.println("Texto do post: " + posts.get(post1).getCaixaTexto());
									System.out.println("Email autor: " + conta.getEmail());	
								}
									
										
								int post2 = paginas.get(pagina).getPost2();
								post2++;
								if(paginas.get(post2) != null) {
									System.out.println("========================================================");
									System.out.println("Titulo: " + posts.get(post2).getTituloPost()); 
									System.out.println("Data: " + posts.get(post2).getData());
									//System.out.println("Categoria: " + categoria[post2].getCategoria());
									System.out.println("Texto do post: " + posts.get(post2).getCaixaTexto());
									System.out.println("Email autor: " + conta.getEmail());	
								}
								if(indicePost>1) {
									System.out.println("\n$$$$ ANUNCIO $$$");
									anuncio.anuncio();
								}
								System.out.println("========================================================");
								break;
								
							//Listar por categoria
							case 4:
								System.out.println("Digite a categoria: ");
								nome = leitor.nextLine();
								i=1;
								if(i == indicePost) {
									System.out.println("Erro! Não há nenhuma publicação desta categoria!");
									
								}
								for(i=1; i < posts.size(); i++) {
									for(int j = 0; j < posts.get(i).getCategorias().size(); j++) {
										if(nome.equals(posts.get(i).getCategorias().get(j).getCategoria())) {
											System.out.println("========================================================");
											System.out.println("Titulo: " + posts.get(i).getTituloPost()); 
											System.out.println("Data: " + posts.get(i).getData());
											//System.out.println("Categoria: " + posts.get(i).getCategorias().);
											System.out.println("Texto do post: " + posts.get(i).getCaixaTexto());
										}
									}
								}
								if(indicePost>1) {
									System.out.println("\n$$$$ ANUNCIO $$$");
									anuncio.anuncio();
								}
								System.out.println("========================================================");
								break;
								
							default: 
								System.out.println("\nOpção invalida! Tente novamente!\n");
								break;
					
					}
					break;
					
				//Sair do lista	
				case 3:
					saida = 3;
					System.out.println("Sistema encerrado!");
					break;
				
				default: 
					System.out.println("\nOpção invalida tente novamente!\n");
					break;
				}
			
			}while(saida != 3);
		}
	}
