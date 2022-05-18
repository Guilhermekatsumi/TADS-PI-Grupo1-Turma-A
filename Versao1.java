package Versao1;

import java.util.Scanner;

public class Versao1 {
	
	public static void main(String[] arg) {
		
		Scanner input = new Scanner(System.in);
		
		String nome;
		
		System.out.println("Parabéns! Você escolheu a batalha com o Leão de Nemeia, deseja lutar com a criatura agora com qual nome?: ");
		nome = input.next();
		System.out.println("Ok! Você será conhecido e lembrando nessa nobre batalha pelo nome de " + nome + "!");
		
        
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
				+ " você teve um dano de 20 Hits de vida, escolha um novo caminho no menu: ");
		break;
		case 2:
		System.out.println("Na região Leste possui um Vale muito bonito com flores grandes e cheirosas, são venenosas,"
				+ " infelizmente você teve um dano de 20 Hits de vida, escolha um novo caminho no menu: ");
		break;
		case 3:
		System.out.println("Na região Sul possui um jardim com grama rasteira habitado por formigas carnivoras,"
				+ " infelizmente você teve um dano de 20 Hits de vida, escolha um novo caminho no menu: ");
		break;
		case 4:
		System.out.println("Na região Oeste possui uma Colina habitado por Morcegos cedentos de sangue,"
				+ " infelizmente você teve um dano de 20 Hits de vida, escolha um novo caminho no menu: ");
		break;
		case 5:
		System.out.println("Na região Sudoeste possui o Mar Morto habitado por sereias que encantam e "
				+ "afogam todos os marinheiros que se aventuram na travessia, infelizmente vocês perderá 20 Hits de vida, escolha um novo caminho no menu: ");
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
		break;
		default:
		System.out.println("Parabêns! Foi uma grante batalha! Você conseguiu acertar a cabeça do Leão com a Clava e depois que a fera estava desmaida estrangulou a criatura.");
		}
		
	}
	
}