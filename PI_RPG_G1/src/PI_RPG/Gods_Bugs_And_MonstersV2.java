package PI_RPG;

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
		case 1:
			break;
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
	int s = 1, n = 2, opcao;
		System.out.println("Sua jornada inicia..... Matar o Javali de Erimanto");// escrever melhor a historia
		System.out.println("");

		System.out.println(
				"Utilizando seus conhecimentos de Algotismos e Programação desvente o enigma no codigo para que o grande Heroi "
						+ nomeHeroi + " um semiDeus filho de " + nomeDeus
						+ " possa abrir a Urna pegar sua espada para que consiga\n" + "derrotar o Javali de Erimanto");
		System.out.println("");

		System.out.println("Um programa gera uma série de números: 10, 20, 30, 40...90, 100. Utilizando o laço FOR."
				+ "\n complete com a informação que falta para que o codigo funcione:	"
				+ "for(int i=10; i<=100; i= i(????){ " + "System.out.println(i); ");
		System.out.println("");
		System.out.println("<a> +10 ");
		System.out.println("<b> ++");
		System.out.println("<c> +100");
		System.out.println("<d> 100");
		System.out.println("<e> 10");
		System.out.println("");

		int tentativaAtual = 1;
		int tentativaMax = 3;
		int tentativa = 1;

		do {

			String alternativa = input.next();

			switch (alternativa) {

			case "a":

				System.out.println("Resposta correta!");
				tentativaAtual = 4;
				break;

			default:

				if (tentativaAtual < 3) {

					System.out.println("Resposta incorreta! O javali joga " + nomeHeroi
							+ " para longe porém o heroi ainda tem forças para lutar! Tente novamente!");
					tentativa++;
					life = life -10;
					System.out.println(life);
					

				} else {

					System.out.println("Resposta incorreta, nas 3 tentativas!\n "
							+ "Você foi derrotado pelo Javali de Erimanto e perdeu 10 pontos de vida!!");// criar uma
																											// condição
																											// de vida
																											// aqui...
				}
				tentativaAtual++;
			}

		} while (tentativaAtual <= tentativaMax);}
	
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
				nomeDeus = input.next();

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
				}	
	}
}
