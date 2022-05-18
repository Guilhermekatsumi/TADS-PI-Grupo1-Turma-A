package PI_RPG;

import java.util.Scanner;

public class Gods_Bugs_And_Monsters {
	static int life = 100;
	
	
	
	
// pontuação life global	

	static int menu() { // static INT ao inves de void para opcaoMenu no final funcionar
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
			jogar();
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
		System.out.println("OBRIGADO POR JOGAR O A AVENTURA DO HEROI SEMIDEUS!");
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

	static void jogar() {
		Scanner input = new Scanner(System.in);
		String nomeHeroi, nomeDeus, escolha;
		int s = 1, n = 2, opcao;

		System.out.println("Escolha um nome para o Heroi ou Heroina de sua Jornada: ");
		nomeHeroi = input.next();
		System.out.println("");

		System.out.println(nomeHeroi + " é um SemiDeus filho de um Deus com um Mortal! Escolha que Deus é seu pai: ");// montar
																														// uma
																														// escolha
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
				+ "E para que consiga resolver terá que utilizar de seus conhecimentos em ALGORITMOS E PROGRAMAÇÃO!!");
		System.out.println("");

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

		} while (tentativaAtual <= tentativaMax);

		

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int opcaoMenu;
		int life = 100;

		System.out.println("Bem Vindo ao Jogo do Grupo 1");

		do {
			opcaoMenu = menu();

			controladorMenu(opcaoMenu);

		} while (opcaoMenu == 1 || opcaoMenu == 2 || opcaoMenu == 3 || opcaoMenu == 4);

	}
}
