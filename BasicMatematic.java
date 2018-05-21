import java.util.Scanner;

import questoes.GeraQuestao;
import selecao.Estatistica;

public class BasicMatematic {

	public static void main(String[] args) {
		
		GeraQuestao quest = new GeraQuestao();
		Estatistica estatistica = new Estatistica();
		
		String entrada, usuario;
		int resposta, usuarioResposta;
		
		Scanner input = new Scanner(System.in);
		//Scanner inputUsuario = new Scanner(System.in);
		
		System.out.print("Digite \"s\" para sair e qualquer outra teclar para continuar: " );
		entrada = input.nextLine();
		
		//Corpo do software, enquanto o usuário não apertar "s" o programac continua a sua execução
		do{	
			
			//Confirma se o usuário deseja sair
			if(entrada.equalsIgnoreCase("s")) {
				System.out.println("Você realmente quer sair? S/N");
				entrada = input.nextLine();
			}
			
			if(!entrada.equalsIgnoreCase("s")){ //caso o usuário não queira sair continua a a execução
				
				estatistica.setNumeroQuestao(estatistica.getNumeroQuestao() + 1); //Incrementa a quantidade de questão
				resposta = quest.questao(estatistica.getNumeroQuestao()); //Mostra a questão e retorna o seu resultado
				System.out.println("quest nº " + estatistica.getNumeroQuestao());	//deletar
				
				do {
					
					usuario = input.next();					
					try{ //captura o erro caso o usuário não digite um inteiro
						usuarioResposta = Integer.parseInt(usuario);
					}catch (Exception e) {
						System.out.println("Você não digitou um número, digite sua resposta novamente: ");
						usuarioResposta = -999999999;
					} 
					
					//faz a verificação se realmente foi digitado um número
					if(usuarioResposta > -999999999) {
						if(usuarioResposta != resposta) {
							
							System.out.println("Resposta incorreta, tente novamente!");
							
							estatistica.setNumeroErro(estatistica.getNumeroErro() + 1);							
							System.out.println("Numero erro: " + estatistica.getNumeroErro());
							
							estatistica.setErrosSeq(estatistica.getErrosSeq() + 1);
							System.out.println("Numero erro em sequência: " + estatistica.getErrosSeq());
							estatistica.setAcertosSeq(0);
							if(estatistica.getErrosSeq() > estatistica.getErroMax())
								estatistica.setErroMax(estatistica.getErrosSeq());
							System.out.println("Máxima quantidade de erros em sequência: " + estatistica.getErroMax());
							
						}else {
							System.out.println("Resposta correta, continue exercitando sua mente!");
							
							estatistica.setNumeroAcerto(estatistica.getNumeroAcerto() + 1);
							System.out.println("Numero acerto: " + estatistica.getNumeroAcerto());
							
							estatistica.setAcertosSeq(estatistica.getAcertosSeq() + 1);
							System.out.println("Numero acertos em sequência: " + estatistica.getAcertosSeq());
							estatistica.setErrosSeq(0);
							if(estatistica.getAcertosSeq() > estatistica.getAcertoMax())
								estatistica.setAcertoMax(estatistica.getAcertosSeq());
							System.out.println("Máxima quantidade de acertos em sequência: " + estatistica.getAcertoMax());
						}
					}
					
				}while(usuarioResposta != resposta); //Enquanto o usuário não acertar continua perguntando
				
				System.out.println("\n\n");
				
				
				
				
				
				
				
			}			
			
			//Ao final verifica se o usuário deseja continuar resolvendo questões
			if(!entrada.equalsIgnoreCase("s")) {
				System.out.println("Digite \"s\" para sair e qualquer outra teclar para continuar: " );
				entrada = input.nextLine();
			}
			
		}while(!entrada.equalsIgnoreCase("s"));
		
		input.close();
		//inputUsuario.close();

	}
	
	public void iniciar() {
		
	}

}
