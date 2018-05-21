/*
 * A classe realiza a lógica de acordo com a operação
 */

package selecao;

import java.util.Random;

import questoes.Dados;

public class Operacao {	

	static Random random = new Random();
	static Dados dado = new Dados();

	public static int soma(int nivelDificuldade, String nome, String olha) {

		int acumulador = nivelDificuldade, valor = 0, totalOperacao = 0;

		while(acumulador >= 0) {

			valor = dado.getNumeroV().get(random.nextInt(dado.getNumeroV().size())); //retorna um valor de uma lista
			System.out.print(" [" + valor +"]" + dado.getFruta().get(random.nextInt(dado.getFruta().size()))); //apresenta na tela o intem e a quantidade
			totalOperacao += valor;
			acumulador--;

		}
		return totalOperacao;
	}

	public static int subtracao(int nivelDificuldade, String nome, String olha) {

		int acumulador = nivelDificuldade, valor = 0, totalOperacao = 0;

		while(acumulador >= 0) {
			valor = dado.getNumeroV().get(random.nextInt(dado.getNumeroV().size())); //retorna um valor de uma lista

			System.out.print(" [" + valor +"] " + dado.getFruta().get(random.nextInt(dado.getFruta().size()))); //apresenta na tela o intem e a quantidade
			totalOperacao -= valor;

			acumulador--;
		}

		return totalOperacao;
	}

	public static int multiplicacao(int nivelDificuldade, String nome, String olha) {
		
		int acumulador = nivelDificuldade, valor = 0, totalOperacao = 0;

		while(acumulador >= 0) {
			valor = dado.getNumeroV().get(random.nextInt(dado.getNumeroV().size())); //retorna um valor de uma lista

			System.out.print(" [" + valor +"] " + dado.getFruta().get(random.nextInt(dado.getFruta().size()))); //apresenta na tela o intem e a quantidade
			totalOperacao += valor;

			acumulador--;
		}

		return totalOperacao;

	}

	public static int divisao(int nivelDificuldade, String nome, String olha) {
		
		/*int acumulador = nivelDificuldade, valor = 0, totalOperacao = 0;

		while(acumulador >= 0) {
			valor = dado.getNumeroV().get(random.nextInt(dado.getNumeroV().size())); //retorna um valor de uma lista

			System.out.print(" [" + valor +"] " + dado.getFruta().get(random.nextInt(dado.getFruta().size()))); //apresenta na tela o intem e a quantidade
			totalOperacao += valor;

			acumulador--;
		}*/

		return multiplicacao(nivelDificuldade, nome, olha);

	}

}
