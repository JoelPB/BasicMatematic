/*
 * Gera as quest�es do aplicativo
 */

package questoes;

import java.util.Random;

import selecao.Escolha;

public class GeraQuestao extends Bonus{

	private Escolha escolha; //Vari�vel do tipo escolhe com as escolhas
	
	private Dados dado = new Dados(); //instancia uma vari�vel do tipo dados
	private Random random = new Random(); //instancia uma vari�vel rand�mica

	public GeraQuestao() {
		escolha = new Escolha();
	}

	public int questao(int questao) {		

		int totalOperacao = 0;		
		String nome, nome1, olha;

		escolha.escolher(escolha, questao); //Fun��o que solicita do usu�rio opera��o e n�vel de dificuldade
						
		switch (escolha.getNivelDificuldade()) { //gera quest�es de acordo com o n�vel de dificuldade

		case 1:				
			nome = escolha.nome(random.nextInt(dado.getNomeF().size())); //Gera um nome masculino, ou feminino, para a quest�o				
			olha = escolha.enunciado(nome); //Gera o enunciado da quest�o 				
			System.out.println();

			return escolha.itensVistos(nome, olha); //Gera os itens vitos e retorna o total da opera��o

		case 2:
			nome = escolha.nome(random.nextInt(dado.getNomeF().size())); //Gera um nome masculino, ou feminino, para a quest�o
			olha = escolha.enunciado(nome); //Gera o enunciado da quest�o 
			System.out.println();

			return escolha.itensVistos(nome, olha); //Gera os itens vitos e retorna o total da opera��o

		case 3:
			nome = escolha.nome(random.nextInt(dado.getNomeF().size())); //Gera um nome masculino, ou feminino, para a quest�o
			olha = escolha.enunciado(nome); //Gera o enunciado da quest�o 
			System.out.println();				
			totalOperacao = escolha.itensVistos(nome, olha); //Gera os itens vitos e retorna o total da opera��o

			nome1 = escolha.nome(random.nextInt(dado.getNomeF().size())); //Gera um nome masculino, ou feminino, para a quest�o
			olha = escolha.enunciado(nome1); //Gera o enunciado da quest�o 
			System.out.println();				
			totalOperacao += escolha.itensVistos(nome1, olha); //Gera os itens vitos e retorna o total da opera��o
			
			if(escolha.getOperacao().equals("/")) {
				System.out.println("Quantas caixas " + nome + " e " + nome1 + " precisar�o?");
			}else {
				System.out.println("Quantas frutas " + nome + " e " + nome1 + " ficaram?");
			}

			return totalOperacao;

		case 4:
			nome = escolha.nome(random.nextInt(dado.getNomeF().size())); //Gera um nome masculino, ou feminino, para a quest�o
			olha = escolha.enunciado(nome); //Gera o enunciado da quest�o 
			System.out.println();				
			totalOperacao = escolha.itensVistos(nome, olha); //Gera os itens vitos e retorna o total da opera��o

			nome1 = escolha.nome(random.nextInt(dado.getNomeF().size())); //Gera um nome masculino, ou feminino, para a quest�o
			olha = escolha.enunciado(nome1); //Gera o enunciado da quest�o 
			System.out.println();				
			totalOperacao += escolha.itensVistos(nome1, olha); //Gera os itens vitos e retorna o total da opera��o

			if(escolha.getOperacao().equals("/")) {
				System.out.println("Quantas caixas " + nome + " e " + nome1 + " precisar�o?");
			}else {
				System.out.println("Quantas frutas " + nome + " e " + nome1 + " ficaram?");
			}

			return totalOperacao;

		case 5:
			nome = escolha.nome(random.nextInt(dado.getNomeF().size())); //Gera um nome masculino, ou feminino, para a quest�o
			olha = escolha.enunciado(nome); //Gera o enunciado da quest�o 
			System.out.println();				
			totalOperacao = escolha.itensVistos(nome, olha); //Gera os itens vitos e retorna o total da opera��o

			return totalOperacao;

		case 6:
			nome = escolha.nome(random.nextInt(dado.getNomeF().size())); //Gera um nome masculino, ou feminino, para a quest�o
			olha = escolha.enunciado(nome); //Gera o enunciado da quest�o 
			System.out.println();				
			totalOperacao = escolha.itensVistos(nome, olha); //Gera os itens vitos e retorna o total da opera��o

			nome1 = escolha.nome(random.nextInt(dado.getNomeF().size())); //Gera um nome masculino, ou feminino, para a quest�o
			olha = escolha.enunciado(nome1); //Gera o enunciado da quest�o 
			System.out.println();				
			totalOperacao += escolha.itensVistos(nome1, olha); //Gera os itens vitos e retorna o total da opera��o

			if(escolha.getOperacao().equals("/")) {
				System.out.println("Quantas caixas " + nome + " e " + nome1 + " precisar�o?");
			}else {
				System.out.println("Quantas frutas " + nome + " e " + nome1 + " ficaram?");
			}

			return totalOperacao;

		case 7:
			nome = escolha.nome(random.nextInt(dado.getNomeF().size())); //Gera um nome masculino, ou feminino, para a quest�o
			olha = escolha.enunciado(nome); //Gera o enunciado da quest�o 
			System.out.println();				
			totalOperacao = escolha.itensVistos(nome, olha); //Gera os itens vitos e retorna o total da opera��o

			return totalOperacao;

		case 8:
			nome = escolha.nome(random.nextInt(dado.getNomeF().size())); //Gera um nome masculino, ou feminino, para a quest�o
			olha = escolha.enunciado(nome); //Gera o enunciado da quest�o 
			System.out.println();				
			totalOperacao = escolha.itensVistos(nome, olha); //Gera os itens vitos e retorna o total da opera��o

			nome1 = escolha.nome(random.nextInt(dado.getNomeF().size())); //Gera um nome masculino, ou feminino, para a quest�o
			olha = escolha.enunciado(nome1); //Gera o enunciado da quest�o 
			System.out.println();				
			totalOperacao += escolha.itensVistos(nome1, olha); //Gera os itens vitos e retorna o total da opera��o

			if(escolha.getOperacao().equals("/")) {
				System.out.println("Quantas caixas " + nome + " e " + nome1 + " precisar�o?");
			}else {
				System.out.println("Quantas frutas " + nome + " e " + nome1 + " ficaram?");
			}

			return totalOperacao;

		case 9:
			nome = escolha.nome(random.nextInt(dado.getNomeF().size())); //Gera um nome masculino, ou feminino, para a quest�o
			olha = escolha.enunciado(nome); //Gera o enunciado da quest�o 
			System.out.println();				
			totalOperacao = escolha.itensVistos(nome, olha); //Gera os itens vitos e retorna o total da opera��o

			return totalOperacao;

		case 10:
			nome = escolha.nome(random.nextInt(dado.getNomeF().size())); //Gera um nome masculino, ou feminino, para a quest�o
			olha = escolha.enunciado(nome); //Gera o enunciado da quest�o 
			System.out.println();				
			totalOperacao = escolha.itensVistos(nome, olha); //Gera os itens vitos e retorna o total da opera��o

			nome1 = escolha.nome(random.nextInt(dado.getNomeF().size())); //Gera um nome masculino, ou feminino, para a quest�o
			olha = escolha.enunciado(nome1); //Gera o enunciado da quest�o 
			System.out.println();				
			totalOperacao += escolha.itensVistos(nome1, olha); //Gera os itens vitos e retorna o total da opera��o

			if(escolha.getOperacao().equals("/")) {
				System.out.println("Quantas caixas " + nome + " e " + nome1 + " precisar�o?");
			}else {
				System.out.println("Quantas frutas " + nome + " e " + nome1 + " ficaram?");
			}

			return totalOperacao;
		}
		
		return 0;

	}
	
	//Para os erros e acertos retorna mensagens, caso tenha um certo n�mero de acerto dar� mensagem motivacional
	public String bonificar(int bonifica) {
		
		if(bonifica == 0) {
			return getMotivacional().get((random.nextInt(getMotivacional().size()))); //retornar uma mensagem potivacional
		}else if(bonifica == 1) {
			return getBonificacao().get((random.nextInt(getBonificacao().size()))); //retorna uma parabeniza��o/bonifica��o
		}else if(bonifica == 2) {
			//return getBonus().get((random.nextInt(getBonus().size()))); //retorna uma "quest�o" B�NUS
		}
		
		return "ERRO, n�o existe a bonifica��o -> 012";
		
	}

}
