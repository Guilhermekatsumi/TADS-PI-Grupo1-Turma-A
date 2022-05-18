package Versao1;

import java.util.Scanner;

public class Versao1 {
	
	public static void main(String[] arg) {
		
		Scanner input = new Scanner(System.in);
		
		String nome;
		
		System.out.println("Parab�ns! Voc� escolheu a batalha com o Le�o de Nemeia, deseja lutar com a criatura agora com qual nome?: ");
		nome = input.next();
		System.out.println("Ok! Voc� ser� conhecido e lembrando nessa nobre batalha pelo nome de " + nome + "!");
		
        
		Scanner a = new Scanner(System.in);
		System.out.println("Gostaria de conhecer o seu oponente? [s/n]");
		String aa= a.nextLine();
		
		if(aa.equals("s")) {
			System.out.println("Sim! O Le�o � uma criatura que habita a plan�cie de Nemeia, na Arg�lida, aterrorizando toda aquela regi�o.");
		}else if(aa.equals("n")) {
			System.out.println("N�o");
		}else {
			System.out.println("Op��o inv�lida");
		}
		
		Scanner b = new Scanner(System.in);
		System.out.println("Voc� deseja ter um mapa para conseguir encontr�-lo? [s/n]");
		String bb = b.nextLine();
		
		if(aa.equals("s")) {
			System.out.println("Sim! Como fa�o para t�-lo? ");
			System.out.println("Voc� precisar� responder a pergunta correta a seguir! Se acertar conseguir� o mapa,"
					+ " se errar voc� dever� prosseguir nessa jorgada buscando orienta��es com moradores de vilas pelo percurso! ");

		}else if(bb.equals("n")) {
			System.out.println("N�o! Ok, voc� dever� prosseguir nessa jorgada buscando orienta��es com moradores de "
					+ "vilas pelo percurso! Desconsidere a pergunta abaixo respondendo sair");
		}else {
			System.out.println("Op��o inv�lida");
		
	
	}
		Scanner entrada = new Scanner(System.in);
		System.out.println("Os fluxogramas s�o representa��es gr�ficas para an�lise administrativa de processos de "
				+ "trabalho, de produ��o ou de documenta��o. Com rela��o �s suas caracter�sticas e ao seu uso, "
				+ "assinale (V) para a afirmativa verdadeira e (F) para a falsa.");
		System.out.println("Um fluxograma permite verificar como realmente funcionam todos os componentes de um sistema.");
		System.out.println("Um fluxograma tem como desvantagem a complexidade de entendimento em rela��o a outros m�todos"
				+ " descritivos.");
		System.out.println("Um fluxograma pode ser aplicado a qualquer sistema por maior que seja a sua complexidade, "
				+ "assim como aos mais simples.");
		System.out.println("As afirmativas s�o, respectivamente");
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
		System.out.println("Resposta correta! Parab�ns! Conseguiu o Mapa, ele � muito valioso, sabendo a localiza��o exata"
				+ " da criatura voc� poder� surpreende-lo se porvetura se planejar corretamente para o Ataque!");
		break;
		case "b":
		case "B":
		case "c":
		case "C":
		case "d":
		case "D":
		case "e":
		case "E":
		System.out.println("Infelizmente voc� errou! Por�m o Le�o muito conhecido na regi�o e seu rugido aterrorizante � escutado a kilometros de dsitancia, siga os rugidos");
		break;
		default:
		System.out.println("Sair sem responder");
		}
		Scanner c = new Scanner(System.in);
		System.out.println("A terr�vel fera n�o pode ser morta por um homem normal por ter couro de material impenetr�vel para mortais e todos os que tentaram enfrent�-lo foram surpreendidos com os poderes e for�a do animal. Voc� deseja levar uma arma? [s/n]");
		String cc = b.nextLine();
		
		if(aa.equals("s")) {
			System.out.println("Sim! Escolha com sabedoria de um Semi Deus Imortal:");
			

		}else if(bb.equals("n")) {
			System.out.println("Segue o arsenal para escolha: ");
		}else {
			System.out.println("Op��o inv�lida");
		}
		
		Scanner d= new Scanner(System.in);
		int opcao;
		do {
		System.out.println("1 - Espada de Fogo");
		System.out.println("2 - Escudo Brilhante");
		System.out.println("3 - Ardo e Flechas Diamantes");
		System.out.println("4- Lan�as Meteoritos");
		System.out.println("5- Balestra Cora��o de Le�o");
		System.out.println("6 Clava de Zeus");
		
		
		System.out.print("Escolha uma op��o: ");
		opcao = entrada.nextInt();
		
		switch (opcao) {
		case 1:
		System.out.println("A Espada de fogo � sem duvida uma arma muito poderosa, mas n�o o suficiente para derrotar a criatura, voc� ser� facilmente derrotado!");
		break;
		case 2:
		System.out.println("O Escudo brilhante ir� deixar a criatura somente mais feroz e aborrecida, o equipamento � pesado deixando-o mais cansado rapidamente!");
		break;
		case 3:
		System.out.println("O Arco com flechas de diamante talvez seria melhor em outro tipo de batalha com animais n�o mitologicos e sem poderes especiais!");
		break;
		case 4:
		System.out.println("As lan�as de meteorito n�o s�o adequadas para o Le�o de Nemeia devido a blindagem divina que possue, voc� ser� devorado rapidamente!");
		break;
		case 5:
		System.out.println("A besta � uma arma leve com diversas flechas com ponta de diamente, contudo de nada servira contra o Le�o que tem seu couro impenetravel!");
		break;
		case 6:
		System.out.println("Clava de Zeus talvez se bem utilizada ir� ajuda-lo a derrotar a criatura, Boa Sorte!!");
		break;
		default:
			System.out.println("Agora precisaremos ter bastante cuidado no"
					+ " caminho para encontrar o local aonde vive a Fera, digite o numero correspondente a regi�o que deseja seguir:");

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
		
		
		System.out.print("Escolha o caminho que deseja seguir para encontrar o Le�o de Nemeia: ");
		opcoes = entrada.nextInt();
		
		switch (opcoes) {
		case 1:
		System.out.println("Na regi�o Norte possui um Vale habitado por comeias de abelhas assassinas, infelizmente"
				+ " voc� teve um dano de 20 Hits de vida, escolha um novo caminho no menu: ");
		break;
		case 2:
		System.out.println("Na regi�o Leste possui um Vale muito bonito com flores grandes e cheirosas, s�o venenosas,"
				+ " infelizmente voc� teve um dano de 20 Hits de vida, escolha um novo caminho no menu: ");
		break;
		case 3:
		System.out.println("Na regi�o Sul possui um jardim com grama rasteira habitado por formigas carnivoras,"
				+ " infelizmente voc� teve um dano de 20 Hits de vida, escolha um novo caminho no menu: ");
		break;
		case 4:
		System.out.println("Na regi�o Oeste possui uma Colina habitado por Morcegos cedentos de sangue,"
				+ " infelizmente voc� teve um dano de 20 Hits de vida, escolha um novo caminho no menu: ");
		break;
		case 5:
		System.out.println("Na regi�o Sudoeste possui o Mar Morto habitado por sereias que encantam e "
				+ "afogam todos os marinheiros que se aventuram na travessia, infelizmente voc�s perder� 20 Hits de vida, escolha um novo caminho no menu: ");
		break;
		case 6:
		System.out.println("Na regi�o Noroeste possui diversos vilarejos habitados por An�es Guerreiros que "
				+ "poder�o axilia-lo na jorgada, acredito que esse caminho ser� o mais seguro e integilente para seguir! Parab�ns pela escolha!");
		break;
		default:
			System.out.println("Chegamos a morada do terrivel animal, planeje o seu ataque sabiamente como um Guerreiro Semi Deus, Boa sorte no ataque! ");

		}
		}while(opcoes != 7);

		Scanner ent = new Scanner(System.in);
		System.out.println("Zeus orgulhoso da sua determina��o e coragem at� aqui ir� testa-lo nesse momento, "
				+ "aplicar� em voc� um teste de inteligencia e sabedoria. Se acertar Zeus indicar� a melhor maneira de derrotar o Le�o, acerte a quest�o!!. Se errar poder� custar a sua Vida");
		System.out.println("Qual a ordem correta das express�es operacionais executadas pelo computador restectivamente:");
		System.out.println("As afirmativas s�o, respectivamente");
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
		System.out.println("Resposta correta!! Agora com a arma correta e estrategia definida Zeus auxiliar� voc� a destruir a criatura! Parab�ns!!");
		break;
		case "b":
		case "B":
		case "c":
		case "C":
		case "d":
		case "D":
		case "e":
		case "E":
		System.out.println("Infelizmente voc� errou! O Le�o foi mais agil e conseguiu atingi-lo com um s� golpe, tente novamente em outra oportunidade ap�s se recuperar dos ferimentos, voc� pedeu 2o Hits de vida");
		break;
		default:
		System.out.println("Parab�ns! Foi uma grante batalha! Voc� conseguiu acertar a cabe�a do Le�o com a Clava e depois que a fera estava desmaida estrangulou a criatura.");
		}
		
	}
	
}