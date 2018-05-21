/*
 * Classe para a escolha da dificuldade e opera��o
 * 
 * Olgar linha 260
 */

package selecao;

import java.util.Random;
import java.util.Scanner;

import questoes.Dados;

public class Escolha {

	private int nivelDificuldade;  //Vari�vel que armazena o n�vel de dificuldade da li��o
	private String operacao; //Vari�vel que armazena a opera��o a ser exercitada
	protected Dados dado;
	protected Random random;
	
	public Escolha() {
		dado = new Dados(); //instancia uma vari�vel do tipo Dados
		random = new Random(); //instancia uma vari�vel do tipo Random
	}

	public int getNivelDificuldade() {
		return nivelDificuldade;
	}

	public void setNivelDificuldade(int nivelDificuldade) {
		this.nivelDificuldade = nivelDificuldade;
	}

	public String getOperacao() {
		return operacao;
	}

	public void setOperacao(String operacao) {
		this.operacao = operacao;
	}

	public void escolher(Escolha escolha, int questao) {

		Scanner input = new Scanner(System.in);
		int nivelDificuldade = 0;		
		String operacao = "", string;
		
		if(questao <= 1) {
			do { //o usu�rio seleciona o n�vel de dificuldade e a opera��o

				//solicita um n�vel de dificuldade caso n�o exista
				if(!((nivelDificuldade > 0) && (nivelDificuldade < 11)) ) {
					System.out.println("Digite o n�vel de Dificuldade de 1 a 10: ");
					string = input.nextLine();	//recebe o n�vel de dificuldade	

					try{ //captura o erro caso o usu�rio n�o digite um inteiro
						nivelDificuldade = Integer.parseInt(string);
					}catch (Exception e) {
						nivelDificuldade = 0;
					}
				}			

				if((nivelDificuldade > 0) && (nivelDificuldade < 11)) {
					System.out.println("Digite a opera��o que deseja realizar\n(+) soma.\n(-) subtra��o.\n(*) multiplica��o.\n(/) divis�o.");
					operacao = input.nextLine(); //recebe a opera��o
				}


			}while(!(nivelDificuldade >=1 && nivelDificuldade <=10) || !(operacao.equals("+") || operacao.equals("-") || operacao.equals("*") || operacao.equals( "/"))); //Enquanto o usu�rio n�o entrar com n�veis e opera��es v�lidas continua o loop

			//input.close(); //Fecha a entrada do teclado


			//Armazena o nivel de dificuldade e a opera��o
			escolha.setNivelDificuldade(nivelDificuldade);
			escolha.setOperacao(operacao);
		}
	}

	public String nome(int numero) { //Gera nomes de pessoas para as quest�es

		String nome = null;

		if(numero % 2 == 0) {
			nome = dado.getNomeF().get(random.nextInt(dado.getNomeF().size())); //Gera um nome feminino
		}else {
			nome = dado.getNomeM().get(random.nextInt(dado.getNomeM().size())); //Gera um nome masculino
		}
		return nome;
	}

	public String enunciado(String nome) { //gera o enunciado da quest�o

		String olha = dado.getOlhaA().get(random.nextInt(dado.getOlhaA().size()));
		if(getOperacao().equals("+")) {
			System.out.println(nome + " " + dado.getEnunciadoL().get(random.nextInt(dado.getEnunciadoL().size()))
					+ " e " + olha + ":"); //Imprime o enunciado da quest�o de soma
		}else if(getOperacao().equals("-")) { 
			System.out.println(nome + " " + dado.getEnunciadoL().get(random.nextInt(dado.getEnunciadoL().size()))
					+ " e " + olha + ":"); //Imprime o enunciado da quest�o de subtra��o
		}		

		return olha;
	}

	public int itensVistos(String nome, String olha) { //Mostra os itens que foram visualizados

		int acumulador, valor, totalOperacao = 0;

		acumulador = getNivelDificuldade(); 

		if(getOperacao().equals("+")) {//Gera os itens e armazena o total dos itens da soma		

			totalOperacao = Operacao.soma(getNivelDificuldade(), nome, olha);	

			//O que se segue cria algumasvaria��es devido ao n�vel de dificuldade
			if(getNivelDificuldade() < 3) {
				System.out.println("\nQuantas frutas " + nome + " " + olha + "?");
			}else if((getNivelDificuldade() > 4) && (getNivelDificuldade() < 7)) {

				valor = dado.getNumeroV().get(random.nextInt(dado.getNumeroV().size()));
				System.out.println();
				System.out.print(nome + " J� tinha [" + valor + "] frutas");

				if(!(getNivelDificuldade()%2 == 0)) {
					System.out.println(", com quantas frutas "
							+ nome + " ficou?");
				}else {
					System.out.println(".");
				}
				totalOperacao += valor;

			}else if((getNivelDificuldade() > 6) && (getNivelDificuldade() < 9)) {

				valor = dado.getNumeroV().get(random.nextInt(dado.getNumeroV().size()));
				System.out.println("\nSabendo que " + nome + " havia ganho [" + valor + "] frutas.");
				totalOperacao += valor;

				valor = dado.getNumeroV().get(random.nextInt(dado.getNumeroV().size()));
				System.out.println();
				System.out.print("Levando em conta que " + nome + 
						" colheu no seu quintal [" + valor + "] frutas");
				if(!(getNivelDificuldade()%2 == 0)) {
					System.out.println(", com quantas frutas "
							+ nome + " ficou?");
				}else {
					System.out.println(".");
				}
				totalOperacao += valor;

			}else if(getNivelDificuldade() > 8) {

				valor = dado.getNumeroV().get(random.nextInt(dado.getNumeroV().size()));
				System.out.println("\nSabendo que " + nome + " havia ganho [" + valor + "] frutas.");
				totalOperacao += valor;
				System.out.println("Os amigos de " + nome + " resolveram lhe presentear com:");

				//Gera mais alguns valores para os c�lculos
				/*while(acumulador <= getNivelDificuldade() / 2) {
					valor = dado.getNumeroV().get(random.nextInt(dado.getNumeroV().size())); //retorna um valor de uma lista
					System.out.print(" [" + valor +"]" + dado.getFruta().get(random.nextInt(dado.getFruta().size()))); //apresenta na tela o intem e a quantidade
					totalOperacao += valor;
					acumulador++;
				}*/
				totalOperacao += Operacao.soma(getNivelDificuldade()/2, nome, olha);

				valor = dado.getNumeroV().get(random.nextInt(dado.getNumeroV().size()));
				System.out.println();
				System.out.print("\nLevando em conta que " + nome + 
						" colheu no seu quintal [" + valor + "] frutas");

				if(!(getNivelDificuldade()%2 == 0)) {
					System.out.println(", com quantas frutas "
							+ nome + " ficou?");
				}else {
					System.out.println(".");
				}

				totalOperacao += valor;

			}			

			System.out.println();

		}else if(getOperacao().equals("-")) {//Gera os itens e armazena o total dos itens da subtra��o		

			totalOperacao = dado.getNumeroV().get(random.nextInt(dado.getNumeroV().size())) * acumulador * 5; //retorna um valor de uma lista
			System.out.println(nome + " " + olha + " [" + totalOperacao +"] frutas, ele resolveu d� a seus amigos as frutas: ");

			totalOperacao += Operacao.subtracao(getNivelDificuldade(), nome, olha);

			//O que se segue cria algumasvaria��es devido ao n�vel de dificuldade
			if(getNivelDificuldade() < 3) {
				System.out.println("\nCom quantas frutas " + nome + " ficou?");

			}else if((getNivelDificuldade() > 4) && (getNivelDificuldade() < 7)) {

				valor = dado.getNumeroV().get(random.nextInt(dado.getNumeroV().size()));
				System.out.println();
				System.out.print(nome + " J� tinha dado [" + valor + "] frutas");

				if(!(getNivelDificuldade()%2 == 0)) {
					System.out.println(", com quantas frutas "
							+ nome + " ficou?");
				}else {
					System.out.println(".");
				}

				totalOperacao -= valor;
			}else if((getNivelDificuldade() > 6) && (getNivelDificuldade() < 9)) {

				valor = dado.getNumeroV().get(random.nextInt(dado.getNumeroV().size()));
				System.out.println("\nSabendo que " + nome + " havia doado [" + valor + "] frutas.");
				totalOperacao -= valor;

				valor = dado.getNumeroV().get(random.nextInt(dado.getNumeroV().size()));
				System.out.print("Levando em conta que " + nome + 
						" deixou [" + valor + "] apodrecer");

				if(!(getNivelDificuldade()%2 == 0)) {
					System.out.print(", com quantas frutas "
							+ nome + " ficou?");
				}else {
					System.out.println(".");
				}

				totalOperacao -= valor;

			}else if(getNivelDificuldade() > 8) {
				valor = dado.getNumeroV().get(random.nextInt(dado.getNumeroV().size()));
				if(totalOperacao - valor >= 0) {
					System.out.println("\nSabendo que " + nome + " havia doado [" + valor + "] frutas.");
					totalOperacao -= valor;
				}
				System.out.println("Os amigos de " + nome + " lhe pediram:");
				//Gera mais alguns valores para os c�lculos
				/*while(acumulador <= getNivelDificuldade() / 2) {
					valor = dado.getNumeroV().get(random.nextInt(dado.getNumeroV().size())); //retorna um valor de uma lista
					System.out.print(" [" + valor +"]" + dado.getFruta().get(random.nextInt(dado.getFruta().size()))); //apresenta na tela o intem e a quantidade
					totalOperacao -= valor;
					acumulador++;
				}*/
				totalOperacao += Operacao.subtracao(getNivelDificuldade()/2, nome, olha);

				valor = dado.getNumeroV().get(random.nextInt(dado.getNumeroV().size()));

				if(totalOperacao - valor >= 0) {

					System.out.println();
					System.out.print("\nLevando em conta que " + nome + 
							" deixou [" + valor + "] apodrecer");
					if(!(getNivelDificuldade()%2 == 0)) {
						System.out.println(", com quantas frutas "
								+ nome + " ficou?");
					}else {
						System.out.println(".");
					}
					totalOperacao -= valor;
				}				
			}
		}else if(getOperacao().equals("*")) {//Gera os itens e armazena o total dos itens da multiplica��o	

			int multiplica = dado.getNumeroV().get(random.nextInt(dado.getNumeroV().size())); //retorna um valor de uma lista
			totalOperacao = dado.getNumeroV().get(random.nextInt(dado.getNumeroV().size())); //retorna um valor de uma lista

			System.out.println(nome + " " + olha + " [" + totalOperacao +"] caixas de frutas.\nSabendo que cada tem [" + multiplica +"] " + "frutas.");

			totalOperacao = totalOperacao * multiplica; //realiza a primeira opera��o

			multiplica = dado.getNumeroV().get(random.nextInt(dado.getNumeroV().size())); //retorna um valor de uma lista
			if(multiplica>10)
				multiplica = multiplica / 10;
			System.out.println("Como " + nome + " ainda tinha " + multiplica + " caixas com as seguintes frutas em cada caixa:");
			totalOperacao += Operacao.multiplicacao(getNivelDificuldade(), nome, olha) * multiplica;

			//O que se segue cria algumas varia��es devido ao n�vel de dificuldade
			if(getNivelDificuldade() < 3) {
				System.out.println("\nCom quantas frutas " + nome + " ficou?");

			}else if((getNivelDificuldade() > 4) && (getNivelDificuldade() < 7)) {

				valor = dado.getNumeroV().get(random.nextInt(dado.getNumeroV().size())); //retorna um valor de uma lista
				if(valor > 10)
					valor = valor / 10;

				System.out.println();
				System.out.print(nome + " j� tinha em sua casa [" + valor + "] caixas de frutas");

				if(!(getNivelDificuldade()%2 == 0)) {
					System.out.println(" e cada caixa com [" + multiplica + "] frutas, com quantas frutas "
							+ nome + " ficou?");
				}else {
					System.out.println(". Como cada caixa possui [" + multiplica + "] frutas.");
				}

				totalOperacao += valor * multiplica;

			}else if((getNivelDificuldade() > 6) && (getNivelDificuldade() < 9)) {

				valor = dado.getNumeroV().get(random.nextInt(dado.getNumeroV().size()));
				if(valor > 10)
					valor = valor / 10;
				multiplica = valor + (valor % 9);

				System.out.println();
				System.out.print(nome + " havia colhido em seu quintal [" + valor + "] caixas de frutas, "
						+ "com [" + multiplica + "] frutas em cada caixa.");

				totalOperacao += valor * multiplica;

				valor = dado.getNumeroV().get(random.nextInt(dado.getNumeroV().size()));
				if(valor > 10)
					valor = valor / 10;
				multiplica = valor + (valor % 9);

				System.out.print("\nLevando em conta que " + nome + 
						" havia armazenado em seu galp�o [" + valor + "] caixas, com [" 
						+ multiplica + "] frutas em cada caixa");

				if(!(getNivelDificuldade()%2 == 0)) {
					System.out.print(", com quantas frutas "
							+ nome + " ficou?");
				}else {
					System.out.println(".");
				}

				totalOperacao += valor * multiplica;

			}else if(getNivelDificuldade() > 8) {

				valor = dado.getNumeroV().get(random.nextInt(dado.getNumeroV().size()));
				if(valor > 10)
					valor = valor / 10;
				multiplica = valor + (valor % 9);

				System.out.println("\nSabendo que " + nome + " guanhou [" + valor + "] caixas, com [" 
						+ multiplica + "] frutas em cada caixa.");
				totalOperacao += valor * multiplica;

				valor = dado.getNumeroV().get(random.nextInt(dado.getNumeroV().size()));
				if(valor > 10)
					valor = valor / 10;
				System.out.println("Os amigos de " + nome + " lhe deram [" + valor 
						+ "] caixas de frutas, cada caixa com:");

				totalOperacao += valor * Operacao.multiplicacao(getNivelDificuldade()/2, nome, olha);

				valor = dado.getNumeroV().get(random.nextInt(dado.getNumeroV().size()));
				if(valor > 10)
					valor = valor / 10;
				multiplica = valor + (valor % 5);

				System.out.println();
				System.out.print("\nLevando em conta que o vizinho de " + nome + 
						" lhe deu [" + valor + "] sacolas de frutas, com ["  
						+ multiplica + "] frutas em cada sacola");
				if(!(getNivelDificuldade()%2 == 0)) {
					System.out.println(", com quantas frutas "
							+ nome + " ficou?");
				}else {
					System.out.println(".");
				}

				totalOperacao += valor * multiplica;

			}
			
		}else if(getOperacao().equals("/")) {//Gera os itens e armazena o total dos itens da divis�o	

			int divide = dado.getNumeroV().get(random.nextInt(dado.getNumeroV().size())) % 50; //retorna um valor de uma lista
			totalOperacao = dado.getNumeroV().get(random.nextInt(dado.getNumeroV().size())); //retorna um valor de uma lista
			
			if (divide < 5)
				divide = 5;
			
			System.out.println(nome + " " + olha + " [" + totalOperacao +"] frutas.\nSabendo que cada caixa de frutas que " 
					+ nome + " possui cabe [" + divide +"] " + "frutas.");

			//totalOperacao = totalOperacao / divide; //realiza a primeira opera��o, a divis�o ir� ser no final

			System.out.println("Como " + nome + " ainda tinha as seguintes frutas em seu freezer:");
			totalOperacao += Operacao.divisao(getNivelDificuldade(), nome, olha);
								
			if(totalOperacao % divide > 0) { //Deixa a divis�o exata
				System.out.println("\n" + nome + " recebeu [" + (divide - (totalOperacao % divide)) + "] frutas de sua professora.");
				totalOperacao += divide - (totalOperacao % divide);
			}
			
			if(getNivelDificuldade() < 3) {
				
				System.out.println("\nQuantas caixas " + nome + " precisar�?");
				
			}else if((getNivelDificuldade() > 4) && (getNivelDificuldade() < 7)) {

				valor = dado.getNumeroV().get(random.nextInt(dado.getNumeroV().size())); //retorna um valor de uma lista
				if(valor > 50)
					valor = valor / 40;

				System.out.println();
				System.out.print(nome + " j� tinha em sua fruteira [" + valor + "] frutas");
				totalOperacao += valor;
				
				valor = dado.getNumeroV().get(random.nextInt(dado.getNumeroV().size())); //retorna um valor de uma lista
				
				if(!(getNivelDificuldade()%2 == 0)) {
					System.out.println(" e ainda colheu no seu quintal [" + valor + "] frutas.");
				}else {
					System.out.println(". Sabendo que eu entregador ainda trar� [" + valor + "] frutas.");
				}

				totalOperacao += valor;

			}else if((getNivelDificuldade() > 6) && (getNivelDificuldade() < 9)) {

				valor = dado.getNumeroV().get(random.nextInt(dado.getNumeroV().size()));
				if(valor > 50)
					valor = valor / 40;
				
				System.out.print("\n" + nome + " havia colhido em seu quintal [" + valor + "] frutas. ");

				totalOperacao += valor;

				valor = dado.getNumeroV().get(random.nextInt(dado.getNumeroV().size()));
				if(valor > 50)
					valor = valor / 30;
				
				System.out.print("\nLevando em conta que " + nome + 
						" havia armazenado em seu galp�o [" + valor + "] frutas");

				if(!(getNivelDificuldade()%2 == 0)) {
					System.out.print(" e ainda colheu na mata pr�xima [" + valor + "] frutas.");
				}else {
					System.out.println(".");
				}

				totalOperacao += valor;

			}else if(getNivelDificuldade() > 8) {

				valor = dado.getNumeroV().get(random.nextInt(dado.getNumeroV().size()));
				if(valor > 50)
					valor = valor / 20;
				
				System.out.println("\nSabendo que " + nome + " guanhou [" + valor + "] frutas.");
				totalOperacao += valor;

				valor = dado.getNumeroV().get(random.nextInt(dado.getNumeroV().size()));
				if(valor > 80)
					valor = valor / 10;
				
				System.out.println("Os amigos de " + nome + " lhe deram [" + valor 
						+ "] as seguintes frutas:");

				totalOperacao += valor * Operacao.divisao(getNivelDificuldade()/2, nome, olha);

				valor = dado.getNumeroV().get(random.nextInt(dado.getNumeroV().size()));
				if(valor > 100)
					valor = valor / 15;
				
				System.out.println();
				System.out.print("\nLevando em conta que o vizinho de " + nome + 
						" lhe deu [" + valor + "] frutas");
				if(!(getNivelDificuldade()%2 == 0)) {
					System.out.println(", assim ter� que armazenar essas frutas. ");					
				}else {
					System.out.println(".");
				}

			}			
			
			if(totalOperacao % divide > 0) { //Deixa a divis�o exata
				System.out.println("\nQuantas caixas ser�o necess�rias? N�o esque�a que " 
			+ nome + " recebeu [" + (divide - (totalOperacao % divide)) 
						+ "] frutas do seu av�.");
				totalOperacao += divide - (totalOperacao % divide);
			}
			
			totalOperacao /= divide;
			
		}

		System.out.println();


		return totalOperacao;	
	}


}
