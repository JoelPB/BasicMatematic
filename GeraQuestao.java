/*
 * Gera as questões do aplicativo
 */

package questoes;

import java.util.Random;

import selecao.Escolha;

public class GeraQuestao extends Bonus{

	private Escolha escolha; //Variável do tipo escolhe com as escolhas
	
	private Dados dado = new Dados(); //instancia uma variável do tipo dados
	private Random random = new Random(); //instancia uma variável randômica

	public GeraQuestao() {
		escolha = new Escolha();
	}

	public int questao(int questao) {		

		int totalOperacao = 0;		
		String nome, nome1, olha;

		escolha.escolher(escolha, questao); //Função que solicita do usuário operação e nível de dificuldade
						
		switch (escolha.getNivelDificuldade()) { //gera questões de acordo com o nível de dificuldade

		case 1:				
			nome = escolha.nome(random.nextInt(dado.getNomeF().size())); //Gera um nome masculino, ou feminino, para a questão				
			olha = escolha.enunciado(nome); //Gera o enunciado da questão 				
			System.out.println();

			return escolha.itensVistos(nome, olha); //Gera os itens vitos e retorna o total da operação

		case 2:
			nome = escolha.nome(random.nextInt(dado.getNomeF().size())); //Gera um nome masculino, ou feminino, para a questão
			olha = escolha.enunciado(nome); //Gera o enunciado da questão 
			System.out.println();

			return escolha.itensVistos(nome, olha); //Gera os itens vitos e retorna o total da operação

		case 3:
			nome = escolha.nome(random.nextInt(dado.getNomeF().size())); //Gera um nome masculino, ou feminino, para a questão
			olha = escolha.enunciado(nome); //Gera o enunciado da questão 
			System.out.println();				
			totalOperacao = escolha.itensVistos(nome, olha); //Gera os itens vitos e retorna o total da operação

			nome1 = escolha.nome(random.nextInt(dado.getNomeF().size())); //Gera um nome masculino, ou feminino, para a questão
			olha = escolha.enunciado(nome1); //Gera o enunciado da questão 
			System.out.println();				
			totalOperacao += escolha.itensVistos(nome1, olha); //Gera os itens vitos e retorna o total da operação
			
			if(escolha.getOperacao().equals("/")) {
				System.out.println("Quantas caixas " + nome + " e " + nome1 + " precisarão?");
			}else {
				System.out.println("Quantas frutas " + nome + " e " + nome1 + " ficaram?");
			}

			return totalOperacao;

		case 4:
			nome = escolha.nome(random.nextInt(dado.getNomeF().size())); //Gera um nome masculino, ou feminino, para a questão
			olha = escolha.enunciado(nome); //Gera o enunciado da questão 
			System.out.println();				
			totalOperacao = escolha.itensVistos(nome, olha); //Gera os itens vitos e retorna o total da operação

			nome1 = escolha.nome(random.nextInt(dado.getNomeF().size())); //Gera um nome masculino, ou feminino, para a questão
			olha = escolha.enunciado(nome1); //Gera o enunciado da questão 
			System.out.println();				
			totalOperacao += escolha.itensVistos(nome1, olha); //Gera os itens vitos e retorna o total da operação

			if(escolha.getOperacao().equals("/")) {
				System.out.println("Quantas caixas " + nome + " e " + nome1 + " precisarão?");
			}else {
				System.out.println("Quantas frutas " + nome + " e " + nome1 + " ficaram?");
			}

			return totalOperacao;

		case 5:
			nome = escolha.nome(random.nextInt(dado.getNomeF().size())); //Gera um nome masculino, ou feminino, para a questão
			olha = escolha.enunciado(nome); //Gera o enunciado da questão 
			System.out.println();				
			totalOperacao = escolha.itensVistos(nome, olha); //Gera os itens vitos e retorna o total da operação

			return totalOperacao;

		case 6:
			nome = escolha.nome(random.nextInt(dado.getNomeF().size())); //Gera um nome masculino, ou feminino, para a questão
			olha = escolha.enunciado(nome); //Gera o enunciado da questão 
			System.out.println();				
			totalOperacao = escolha.itensVistos(nome, olha); //Gera os itens vitos e retorna o total da operação

			nome1 = escolha.nome(random.nextInt(dado.getNomeF().size())); //Gera um nome masculino, ou feminino, para a questão
			olha = escolha.enunciado(nome1); //Gera o enunciado da questão 
			System.out.println();				
			totalOperacao += escolha.itensVistos(nome1, olha); //Gera os itens vitos e retorna o total da operação

			if(escolha.getOperacao().equals("/")) {
				System.out.println("Quantas caixas " + nome + " e " + nome1 + " precisarão?");
			}else {
				System.out.println("Quantas frutas " + nome + " e " + nome1 + " ficaram?");
			}

			return totalOperacao;

		case 7:
			nome = escolha.nome(random.nextInt(dado.getNomeF().size())); //Gera um nome masculino, ou feminino, para a questão
			olha = escolha.enunciado(nome); //Gera o enunciado da questão 
			System.out.println();				
			totalOperacao = escolha.itensVistos(nome, olha); //Gera os itens vitos e retorna o total da operação

			return totalOperacao;

		case 8:
			nome = escolha.nome(random.nextInt(dado.getNomeF().size())); //Gera um nome masculino, ou feminino, para a questão
			olha = escolha.enunciado(nome); //Gera o enunciado da questão 
			System.out.println();				
			totalOperacao = escolha.itensVistos(nome, olha); //Gera os itens vitos e retorna o total da operação

			nome1 = escolha.nome(random.nextInt(dado.getNomeF().size())); //Gera um nome masculino, ou feminino, para a questão
			olha = escolha.enunciado(nome1); //Gera o enunciado da questão 
			System.out.println();				
			totalOperacao += escolha.itensVistos(nome1, olha); //Gera os itens vitos e retorna o total da operação

			if(escolha.getOperacao().equals("/")) {
				System.out.println("Quantas caixas " + nome + " e " + nome1 + " precisarão?");
			}else {
				System.out.println("Quantas frutas " + nome + " e " + nome1 + " ficaram?");
			}

			return totalOperacao;

		case 9:
			nome = escolha.nome(random.nextInt(dado.getNomeF().size())); //Gera um nome masculino, ou feminino, para a questão
			olha = escolha.enunciado(nome); //Gera o enunciado da questão 
			System.out.println();				
			totalOperacao = escolha.itensVistos(nome, olha); //Gera os itens vitos e retorna o total da operação

			return totalOperacao;

		case 10:
			nome = escolha.nome(random.nextInt(dado.getNomeF().size())); //Gera um nome masculino, ou feminino, para a questão
			olha = escolha.enunciado(nome); //Gera o enunciado da questão 
			System.out.println();				
			totalOperacao = escolha.itensVistos(nome, olha); //Gera os itens vitos e retorna o total da operação

			nome1 = escolha.nome(random.nextInt(dado.getNomeF().size())); //Gera um nome masculino, ou feminino, para a questão
			olha = escolha.enunciado(nome1); //Gera o enunciado da questão 
			System.out.println();				
			totalOperacao += escolha.itensVistos(nome1, olha); //Gera os itens vitos e retorna o total da operação

			if(escolha.getOperacao().equals("/")) {
				System.out.println("Quantas caixas " + nome + " e " + nome1 + " precisarão?");
			}else {
				System.out.println("Quantas frutas " + nome + " e " + nome1 + " ficaram?");
			}

			return totalOperacao;
		}
		
		return 0;

	}
	
	//Para os erros e acertos retorna mensagens, caso tenha um certo número de acerto dará mensagem motivacional
	public String bonificar(int bonifica) {
		
		if(bonifica == 0) {
			return getMotivacional().get((random.nextInt(getMotivacional().size()))); //retornar uma mensagem potivacional
		}else if(bonifica == 1) {
			return getBonificacao().get((random.nextInt(getBonificacao().size()))); //retorna uma parabenização/bonificação
		}else if(bonifica == 2) {
			//return getBonus().get((random.nextInt(getBonus().size()))); //retorna uma "questão" BÔNUS
		}
		
		return "ERRO, não existe a bonificação -> 012";
		
	}

}
