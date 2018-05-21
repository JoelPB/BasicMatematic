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
		
		//Corpo do software, enquanto o usu�rio n�o apertar "s" o programac continua a sua execu��o
		do{	
			
			//Confirma se o usu�rio deseja sair
			if(entrada.equalsIgnoreCase("s")) {
				System.out.println("Voc� realmente quer sair? S/N");
				entrada = input.nextLine();
			}
			
			if(!entrada.equalsIgnoreCase("s")){ //caso o usu�rio n�o queira sair continua a a execu��o
				
				estatistica.setNumeroQuestao(estatistica.getNumeroQuestao() + 1); //Incrementa a quantidade de quest�o
				resposta = quest.questao(estatistica.getNumeroQuestao()); //Mostra a quest�o e retorna o seu resultado
				System.out.println("quest n� " + estatistica.getNumeroQuestao());	//deletar
				
				do {
					
					usuario = input.next();					
					try{ //captura o erro caso o usu�rio n�o digite um inteiro
						usuarioResposta = Integer.parseInt(usuario);
					}catch (Exception e) {
						System.out.println("Voc� n�o digitou um n�mero, digite sua resposta novamente: ");
						usuarioResposta = -999999999;
					} 
					
					//faz a verifica��o se realmente foi digitado um n�mero
					if(usuarioResposta > -999999999) {
						if(usuarioResposta != resposta) {
							
							System.out.println("Resposta incorreta, tente novamente!");
							
							estatistica.setNumeroErro(estatistica.getNumeroErro() + 1);							
							System.out.println("Numero erro: " + estatistica.getNumeroErro());
							
							estatistica.setErrosSeq(estatistica.getErrosSeq() + 1);
							System.out.println("Numero erro em sequ�ncia: " + estatistica.getErrosSeq());
							estatistica.setAcertosSeq(0);
							if(estatistica.getErrosSeq() > estatistica.getErroMax())
								estatistica.setErroMax(estatistica.getErrosSeq());
							System.out.println("M�xima quantidade de erros em sequ�ncia: " + estatistica.getErroMax());
							
						}else {
							System.out.println("Resposta correta, continue exercitando sua mente!");
							
							estatistica.setNumeroAcerto(estatistica.getNumeroAcerto() + 1);
							System.out.println("Numero acerto: " + estatistica.getNumeroAcerto());
							
							estatistica.setAcertosSeq(estatistica.getAcertosSeq() + 1);
							System.out.println("Numero acertos em sequ�ncia: " + estatistica.getAcertosSeq());
							estatistica.setErrosSeq(0);
							if(estatistica.getAcertosSeq() > estatistica.getAcertoMax())
								estatistica.setAcertoMax(estatistica.getAcertosSeq());
							System.out.println("M�xima quantidade de acertos em sequ�ncia: " + estatistica.getAcertoMax());
						}
					}
					
				}while(usuarioResposta != resposta); //Enquanto o usu�rio n�o acertar continua perguntando
				
				System.out.println("\n\n");
				
				
				
				
				
				
				
			}			
			
			//Ao final verifica se o usu�rio deseja continuar resolvendo quest�es
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
