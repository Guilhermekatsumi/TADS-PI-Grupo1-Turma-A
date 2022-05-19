package PI_RPG;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Gods_Bugs_And_MonstersV2 {
	static int life = 100;
	static String nomeHeroi, nomeDeus, escolha;

	
// pontuação life global	
	
	static int menu() { // static INT ao inves de void para opcao Menu no final funcionar
		int opcao;
		Scanner input = new Scanner(System.in);

		do {
			System.out.println("1 - Jogar");
			System.out.println("2 - Sinopse");
			System.out.println("3 - Instruções");
			System.out.println("4 - Créditos");
			System.out.println("5 - Sair");

			System.out.println("Escolha uma opção:");
			opcao = input.nextInt();

			if (opcao < 1 || opcao > 5) {
				System.out.println("Opção Invalida!! Tente de 1 a 5.");
			}

		} while (opcao < 1 || opcao > 5);
			return opcao;
	}

	static void controladorMenu(int opcao) {
		switch (opcao) {
		
		case 2:
			sinopse();
			break;
		case 3:
			instrucoes();
			break;
		case 4:
			credito();
			break;
		case 5:
			sair();
			break;
		}
	}

	static void sair() {
		System.out.println("----SAINDO DO JOGO----");
		System.out.println("-------------------");
		System.out.println("OBRIGADO POR JOGAR O HEROI SEMIDEUS!");
		System.out.println("-------------------");
		System.exit(0);
	}

	static void credito() {
		System.out.println("----CRÉDITOS----");
		System.out.println("Agradecimentos aos professores Fernando....");
		System.out.println("");
		System.out.println("---Integrantes do grupo!---");
		System.out.println("Alexandre Ciocci");
		System.out.println("Alisson Campos dos Santos");
		System.out.println("Caio Cesar");
		System.out.println("Guilherme Katsumi");
		System.out.println("");
	}

	static void instrucoes() {
		System.out.println("----INSTRUÇÕES DO JOGO----");
		System.out.println("");
		System.out.println("Para jogar .....");
		System.out.println("");

	}

	static void sinopse() {
		System.out.println("----SINOPSE----");
		System.out.println("O jogo se passa nos dias atuais onde vc é um heroi semiDeus, Filho de um Deus com um Mortal........");
		System.out.println("");
	}
	
	static void DesafioJavali() {
		Scanner input = new Scanner(System.in);
		String opcao;
		boolean acerto = false;
		int tentativa = 0;
		int life = 100;
		
			System.out.println("Sua jornada inicia..... Matar o Javali de Erimanto");// escrever melhor a historia
			System.out.println("");

			System.out.println(
					"Utilizando seus conhecimentos de Algotismos e Programação desvente o enigma no codigo para que o grande Heroi "
							+  " um semiDeus filho de " 
							+ " possa abrir a Urna pegar sua espada para que consiga\n" + "derrotar o Javali de Erimanto");
			System.out.println("");

			System.out.println("Um programa gera uma série de números: 10, 20, 30, 40...90, 100. Utilizando o laço FOR."
					+ "\n complete com a informação que falta para que o codigo funcione:	"
					+ "\nfor(int i=10; i<=100; i= i(????)");
	
			List respostas = new ArrayList();
			
			respostas.add(" +10");
			respostas.add(" ++");
			respostas.add(" +100");
			respostas.add(" 100");
			respostas.add(" 10");
			
			do {
		
		Collections.shuffle(respostas);
		
			System.out.println("");
			System.out.println("<a> " + respostas.get(0));
			System.out.println("<b> " + respostas.get(1));
			System.out.println("<c> " + respostas.get(2));
			System.out.println("<d> " + respostas.get(3));
			System.out.println("<e> " + respostas.get(4));
			System.out.println("");
			System.out.println("Qual sua Resposta: ");
			opcao = input.next();
			
			
				switch (opcao) {
				case "a":
				case "A":	
					if (respostas.get(0).equals(" +10")){
						acerto = true;
					}else {
						System.out.println("Resposta incorreta! O javali joga "+nomeHeroi+" para longe porém o heroi ainda tem forças para continuar lutando! Tente novamente!");
						tentativa++;
						life = life -5;
						System.out.println(life);
						System.out.println(tentativa+"° Tentativa");
					}
					break;
				case "b":
				case "B":	
					if (respostas.get(1).equals(" +10")){
						acerto = true;
					}else {
						System.out.println("Resposta incorreta! O javali joga "+nomeHeroi+" para longe porém o heroi ainda tem forças para continuar lutando! Tente novamente!");
						tentativa++;
						life = life -5;
						System.out.println(life);
						System.out.println(tentativa+"° Tentativa");
					}
					break;	
				case "c":
				case "C":	
					if (respostas.get(2).equals(" +10")){
						acerto = true;
					}else {
						System.out.println("Resposta incorreta! O javali joga "+nomeHeroi+" para longe porém o heroi ainda tem forças para continuar lutando! Tente novamente!");
						tentativa++;
						life = life -5;
						System.out.println(life);
						System.out.println(tentativa+"° Tentativa");
					}
					break;
				case "d":
				case "D":	
					if (respostas.get(3).equals(" +10")){
						acerto = true;
					}else {
						System.out.println("Resposta incorreta! O javali joga "+nomeHeroi+" para longe porém o heroi ainda tem forças para continuar lutando! Tente novamente!");
						tentativa++;
						life = life -5;
						System.out.println(life);
						System.out.println(tentativa+"° Tentativa");
					}
					break;
				case "e":
				case "E":	
					if (respostas.get(4).equals(" +10")){
						acerto = true;
					}else {
						System.out.println("Resposta incorreta! O javali joga "+nomeHeroi+" para longe porém o heroi ainda tem forças para continuar lutando! Tente novamente!");
						tentativa++;
						life = life -5;
						System.out.println(life);
						System.out.println(tentativa+"° Tentativa");
						
					}
					break;
				default:
					System.out.println("Escolha Inválida");
				}
	}while(!acerto && life >= 1);
			if (acerto) {
				System.out.println("Você acertou na "+tentativa+"° Tentativa! e está com "+life+" de vida");
				}
			
		if(life <= 0) { 
			System.out.println("GAME OVER");
			menu();
			}
}

	static void DesafioHidra() {
		Scanner input = new Scanner(System.in);
		boolean acertou = false;
		boolean acertou2 = false;
		boolean acertou3 = false;
		String alternativa;
		
		System.out.println("Para Eliminar a Hidra, é necessario que você corte as cabeças e queime as feridas, para que assim não cresçam outras cabeça no lugar\n\n"
			+ "Para isso responda a questão referente a Algoritmos e Programação, onde : \n\n"
				
			+ " - X e Y equivalem a variáveis numéricas \n\n"
			+ " - Z e W equivalem a variáveis Literais \n\n"
			+ " - T e K equivalem a variáveis Lógicas \n\n"

			+ "E sendo que: \n\n" 
				
			+ "    X <- (9+6-11+8/4)\n\n" 
			+ "    Y <- (X^2 - (10 - 8 / 2) * 2)\n\n"
			+ "    Z <- (''verdadeiro'')\n\n" 
			+ "    W <- (''X = 6'' + Z)\n\n"
			+ "    T <- ((X = Y) e (não (Y > X)) = (X <= Y))\n\n"
			+ "    K <- (não T ou (X > Y))\n\n");

		System.out.println("Qual o valor da variavel ''X'': ");
		
		System.out.println("a) X = 16\n" 
			+ "b) X = 3\n"
			+ "c) X = 6\n"
			+ "d) X = -5,25\n");
		
		do {
			System.out.println("Digite aqui a alternativa correta: (a,b,c,d ou e)\n ");

			alternativa = input.next();
				switch (alternativa) {
					case "c":
					case "C":
						System.out.println("Resposta correta!");
						acertou = true;
					break;
					case "a":
					case "A":
					case "b":
					case "B":
					case "d":
					case "D":
					case "e":
					case "E":
						System.out.println("Resposta incorreta! seu dano foi de 10");
						life = life -10;
						System.out.println(life);
						System.out.println("tente novamente");
					break;
					default:
						System.out.println("Escolha inválida!");}
		}while (!acertou && life >= 1);
			if (acertou) {
			System.out.println("Parabens!!! você conseguiu eliminar a 1ª cabeça com Sucesso!!!");
			}
		
	if(life <= 0) { 
		System.out.println("GAME OVER");
	}else {
		System.out.println("\n  Agora responda: ");
		System.out.println("Qual o valor da variavel ''Y'': ");
		
		System.out.println("a) Y = -3\n" 
			+ "b) Y = 24\n"
			+ "c) Y = 18\n"
			+ "d) Y = -9\n");
				
		do {
			System.out.println("Digite aqui a alternativa correta: (a,b,c,d ou e)\n ");

			alternativa = input.next();
				switch (alternativa) {
					case "b":
					case "B":
						System.out.println("Resposta correta!");
						acertou2 = true;
					break;
					case "a":
					case "A":
					case "c":
					case "C":
					case "d":
					case "D":
					case "e":
					case "E":
						System.out.println("Resposta incorreta! seu dano foi de 10");
						life = life -10;
						System.out.println(life);
						System.out.println("tente novamente");
					break;
					default:
						System.out.println("Escolha inválida!");}
		} while (!acertou2 && life >= 1);
		if (acertou2) {
			System.out.println("Parabens!!! você conseguiu eliminar a 2ª cabeça com Sucesso!!!");
		}
		if(life <= 0) { 
			System.out.println("GAME OVER");
		}else {
			
		do {
		System.out.println("\n Agora para Eliminar a 3ª cabeça, informe a alternativa que está correta:\n"
				+ "lembrando que: \n\n"
							
				+ " - X e Y equivalem a variáveis numéricas \n\n"
				+ " - Z e W equivalem a variáveis Literais \n\n"
				+ " - T e K equivalem a variáveis Lógicas \n\n" 
				+ "    X <- (9+6-11+8/4)\n\n" 
				+ "    Y <- (X^2 - (10 - 8 / 2) * 2)\n\n"
				+ "    Z <- (''verdadeiro'')\n\n" 
				+ "    W <- (''X = 6'' + Z)\n\n"
				+ "    T <- ((X = Y) e (não (Y > X)) = (X <= Y))\n\n"
				+ "    K <- (não T ou (X > Y))\n\n");

		System.out.println(" a) X = 6, Y = 24, Z = ''verdadeiro'', W = true, T = false, K = True\n "
				+ "b) X = 6, Y = 24, Z = ''verdadeiro'', W = ''X = 6 verdadeiro'', T = false, K = True\n "
				+ "c) X = 6, Y = 34, Z = ''verdadeiro'', W = true, T = false, K = True\n "
				+ "d) X = 6, Y = 24, Z = ''verdadeiro'', W = ''X = 6 verdadeiro'', T = false, K = false\n "
				+ "e) X = 6, Y = 34, Z = ''verdadeiro'', W = ''X = 6 verdadeiro'', T = false, K = false\n");

		System.out.println("Digite aqui a alternativa correta: (a,b,c,d ou e)\n ");

		alternativa = input.next();

		switch (alternativa) {
		case "b":
		case "B":
			System.out.println("Resposta correta!");
			acertou3 = true;
			break;
		case "a":
		case "A":
		case "c":
		case "C":
		case "d":
		case "D":
		case "e":
		case "E":
			System.out.println("Resposta incorreta! seu dano foi de 10");
			life = life -10;
			System.out.println(life);
			System.out.println("tente novamente");
		default:
			System.out.println("Escolha inválida!");}
		} while (!acertou3 && life >= 1);
		if (acertou3) {
			System.out.println("Parabens!!! você conseguiu eliminar a ultima cabeça com Sucesso!!!");
		}
		if(life <= 0) { 
			System.out.println("GAME OVER");
		}else {
			System.out.println("Você conquistou um armamento");
			System.out.println("Seu Premio foi: Flechas com ponteiras envenenadas!!!");
		}
			}
		}
	}
	
	static void DesafioLeao() {
Scanner input = new Scanner(System.in);
		int life = 100;
		
		System.out.println("Parabéns! Você escolheu a batalha com o Leão de Nemeia, deseja lutar com a criatura agora com qual nome?: ");
		nomeHeroi = input.next();
		System.out.println("Ok! Você será conhecido e lembrando nessa nobre batalha pelo nome de " + nomeHeroi + "!");
		
        
		Scanner a = new Scanner(System.in);
		System.out.println("Gostaria de conhecer o seu oponente? [s/n]");
		String aa= a.nextLine();
		
		if(aa.equals("s")) {
			System.out.println("Sim! O Leão é uma criatura que habita a planície de Nemeia, na Argólida, aterrorizando toda aquela região.");
		}else if(aa.equals("n")) {
			System.out.println("Não");
		}else {
			System.out.println("Opção inválida");
		}
		
		Scanner b = new Scanner(System.in);
		System.out.println("Você deseja ter um mapa para conseguir encontrá-lo? [s/n]");
		String bb = b.nextLine();
		
		if(aa.equals("s")) {
			System.out.println("Sim! Como faço para tê-lo? ");
			System.out.println("Você precisará responder a pergunta correta a seguir! Se acertar conseguirá o mapa,"
					+ " se errar você deverá prosseguir nessa jorgada buscando orientações com moradores de vilas pelo percurso! ");

		}else if(bb.equals("n")) {
			System.out.println("Não! Ok, você deverá prosseguir nessa jorgada buscando orientações com moradores de "
					+ "vilas pelo percurso! Desconsidere a pergunta abaixo respondendo sair");
		}else {
			System.out.println("Opção inválida");
		
	
	}
		Scanner entrada = new Scanner(System.in);
		System.out.println("Os fluxogramas são representações gráficas para análise administrativa de processos de "
				+ "trabalho, de produção ou de documentação. Com relação às suas características e ao seu uso, "
				+ "assinale (V) para a afirmativa verdadeira e (F) para a falsa.");
		System.out.println("Um fluxograma permite verificar como realmente funcionam todos os componentes de um sistema.");
		System.out.println("Um fluxograma tem como desvantagem a complexidade de entendimento em relação a outros métodos"
				+ " descritivos.");
		System.out.println("Um fluxograma pode ser aplicado a qualquer sistema por maior que seja a sua complexidade, "
				+ "assim como aos mais simples.");
		System.out.println("As afirmativas são, respectivamente");
		System.out.println("a) ()V F V");
		System.out.println("b) ()V V V");
		System.out.println("c) ()V F F");
		System.out.println("d) ()F F F");
		System.out.println("e) ()F V V");
		System.out.print("Escolha uma alternativa: ");
		String alternativa = entrada.next();
		switch (alternativa) {
		case "a":
		case "A":
		System.out.println("Resposta correta! Parabéns! Conseguiu o Mapa, ele é muito valioso, sabendo a localização exata"
				+ " da criatura você poderá surpreende-lo se porvetura se planejar corretamente para o Ataque!");
		break;
		case "b":
		case "B":
		case "c":
		case "C":
		case "d":
		case "D":
		case "e":
		case "E":
		System.out.println("Infelizmente você errou! Porém o Leão muito conhecido na região e seu rugido aterrorizante é escutado a kilometros de dsitancia, siga os rugidos");
		life = life -5;
		System.out.println(life);
		break;
		default:
		System.out.println("Sair sem responder");
		}
		Scanner c = new Scanner(System.in);
		System.out.println("A terrível fera não pode ser morta por um homem normal por ter couro de material impenetrável para mortais e todos os que tentaram enfrentá-lo foram surpreendidos com os poderes e força do animal. Você deseja levar uma arma? [s/n]");
		String cc = b.nextLine();
		
		if(aa.equals("s")) {
			System.out.println("Sim! Escolha com sabedoria de um Semi Deus Imortal:");
			

		}else if(bb.equals("n")) {
			System.out.println("Segue o arsenal para escolha: ");
		}else {
			System.out.println("Opção inválida");
		}
		
		Scanner d= new Scanner(System.in);
		int opcao;
		do {
		System.out.println("1 - Espada de Fogo");
		System.out.println("2 - Escudo Brilhante");
		System.out.println("3 - Ardo e Flechas Diamantes");
		System.out.println("4- Lanças Meteoritos");
		System.out.println("5- Balestra Coração de Leão");
		System.out.println("6 Clava de Zeus");
		
		
		System.out.print("Escolha uma opção: ");
		opcao = entrada.nextInt();
		
		switch (opcao) {
		case 1:
		System.out.println("A Espada de fogo é sem duvida uma arma muito poderosa, mas não o suficiente para derrotar a criatura, você será facilmente derrotado!");
		break;
		case 2:
		System.out.println("O Escudo brilhante irá deixar a criatura somente mais feroz e aborrecida, o equipamento é pesado deixando-o mais cansado rapidamente!");
		break;
		case 3:
		System.out.println("O Arco com flechas de diamante talvez seria melhor em outro tipo de batalha com animais não mitologicos e sem poderes especiais!");
		break;
		case 4:
		System.out.println("As lanças de meteorito não são adequadas para o Leão de Nemeia devido a blindagem divina que possue, você será devorado rapidamente!");
		break;
		case 5:
		System.out.println("A besta é uma arma leve com diversas flechas com ponta de diamente, contudo de nada servira contra o Leão que tem seu couro impenetravel!");
		break;
		case 6:
		System.out.println("Clava de Zeus talvez se bem utilizada irá ajuda-lo a derrotar a criatura, Boa Sorte!!");
		break;
		default:
			System.out.println("Agora precisaremos ter bastante cuidado no"
					+ " caminho para encontrar o local aonde vive a Fera, digite o numero correspondente a região que deseja seguir:");

		}
		}while(opcao !=7);
		
		Scanner e= new Scanner(System.in);
		int opcoes;
		do {
		System.out.println("1 - Norte");
		System.out.println("2 - Leste");
		System.out.println("3 - Sul");
		System.out.println("4 - Oeste");
		System.out.println("5 - Sudoeste");
		System.out.println("6 - Noreste");
		
		
		System.out.print("Escolha o caminho que deseja seguir para encontrar o Leão de Nemeia: ");
		opcoes = entrada.nextInt();
		
		switch (opcoes) {
		case 1:
		System.out.println("Na região Norte possui um Vale habitado por comeias de abelhas assassinas, infelizmente"
				+ " você teve um dano de -5 Hits de vida, escolha um novo caminho no menu: ");
		break;
		case 2:
		System.out.println("Na região Leste possui um Vale muito bonito com flores grandes e cheirosas, são venenosas,"
				+ " infelizmente você teve um dano de -5 Hits de vida, escolha um novo caminho no menu: ");
		break;
		case 3:
		System.out.println("Na região Sul possui um jardim com grama rasteira habitado por formigas carnivoras,"
				+ " infelizmente você teve um dano de -5 Hits de vida, escolha um novo caminho no menu: ");
		break;
		case 4:
		System.out.println("Na região Oeste possui uma Colina habitado por Morcegos cedentos de sangue,"
				+ " infelizmente você teve um dano de -5 Hits de vida, escolha um novo caminho no menu: ");
		break;
		case 5:
		System.out.println("Na região Sudoeste possui o Mar Morto habitado por sereias que encantam e "
				+ "afogam todos os marinheiros que se aventuram na travessia, infelizmente vocês perderá -5 Hits de vida, escolha um novo caminho no menu: ");
		break;
		case 6:
		System.out.println("Na região Noroeste possui diversos vilarejos habitados por Anões Guerreiros que "
				+ "poderão axilia-lo na jorgada, acredito que esse caminho será o mais seguro e integilente para seguir! Parabéns pela escolha!");
		break;
		default:
			System.out.println("Chegamos a morada do terrivel animal, planeje o seu ataque sabiamente como um Guerreiro Semi Deus, Boa sorte no ataque! ");

		}
		}while(opcoes != 7);

		Scanner ent = new Scanner(System.in);
		System.out.println("Zeus orgulhoso da sua determinação e coragem até aqui irá testa-lo nesse momento, "
				+ "aplicará em você um teste de inteligencia e sabedoria. Se acertar Zeus indicará a melhor maneira de derrotar o Leão, acerte a questão!!. Se errar poderá custar a sua Vida");
		System.out.println("Qual a ordem correta das expressões operacionais executadas pelo computador restectivamente:");
		System.out.println("As afirmativas são, respectivamente");
		System.out.println("a) Aritmetricas, relacionais e logicas");
		System.out.println("b) Relacionais, aritmetricas e logicas");
		System.out.println("c) Logicas, aritmetricas, relacionais");
		System.out.println("d) Relacionais, logicas e arittmetricas");
		System.out.println("e) Aritmetricas, logicas e relacionais");
		System.out.print("Escolha uma alternativa: ");
		String alt = ent.next();
		switch (alt) {
		case "a":
		case "A":
		System.out.println("Resposta correta!! Agora com a arma correta e estrategia definida Zeus auxiliará você a destruir a criatura! Parabêns!!");
		break;
		case "b":
		case "B":
		case "c":
		case "C":
		case "d":
		case "D":
		case "e":
		case "E":
		System.out.println("Infelizmente você errou! O Leão foi mais agil e conseguiu atingi-lo com um só golpe, tente novamente em outra oportunidade após se recuperar dos ferimentos, você pedeu 2o Hits de vida");
		life = life -5;
		System.out.println(life);
	    break;
		default:
		System.out.println("Parabêns! Foi uma grante batalha! Você conseguiu acertar a cabeça do Leão com a Clava e depois que a fera estava desmaida estrangulou a criatura.");
		}
	}
	
	static void DesafioCaio() {
		
	}
	
	static void DesafioFinal() {
		
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int opcaoMenu;
		int opcao;

		System.out.println("Bem Vindo ao Jogo do Grupo 1");

		do {
			opcaoMenu = menu();

			controladorMenu(opcaoMenu);

		} while (opcaoMenu == 2 || opcaoMenu == 3 || opcaoMenu == 4);
	
		if (opcaoMenu == 1);{
		
			System.out.println("JOGAR");
				System.out.println("Escolha um nome para o Heroi ou Heroina de sua Jornada: ");
				nomeHeroi = input.next();
				System.out.println("");

				System.out.println(nomeHeroi + " é um SemiDeus filho de um Deus com um Mortal! Escolha que Deus é seu pai: ");// montar
																																// uma																								// escolha
				System.out.println("1 - Zeus Deus do Trovão");
				System.out.println("2 - Afrotide Deusa do Amor e Fertilidade");
				System.out.println("3 - Poseidon Deus dos Mares");
				System.out.println("4 - Ares Deus da Guerra");

				System.out.println("Faça uma escolha :");
				opcao = input.nextInt();
				

				switch (opcao) {

				case 1:
					nomeDeus = "Zeus";
					break;

				case 2:
					nomeDeus = "Afrodite";
					break;

				case 3:
					nomeDeus = "Poseidon";
					break;

				case 4:
					nomeDeus = "Ares";
					break;

				default:
					System.out.println("Opção Invalida!! Digite de 1 a 4");
					System.out.println("");
				}

				// nomeHeroi = input.next();

				System.out.println(
						"Olá " + nomeHeroi + "! Você esta preste a iniciar uma jornada com muita aventura e conhecimento!");
				System.out.println("");
				System.out.println("Você será testado e vai passar por 10 desafios mitologicos!! \n "
						+ "E para que consiga resolver terá que utilizar de seus conhecimentos em ALGORITMOS E LÓGICA DE PROGRAMAÇÃO!!");
				System.out.println("");}
				System.out.println("Sua Vida é de 100 pontos");
				
				while (life >= 0) {
					DesafioJavali();
				break;
				}while (life >= 0) {
					DesafioHidra();
				break;
				}while (life >= 0) {
					DesafioLeao();
				break;
				}while (life >= 0) {
					DesafioCaio();
				break;
				}while (life >= 0) {
					DesafioFinal();
				break;
				}	
	}
}
