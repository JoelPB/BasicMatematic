/*
 * A classe faz a seleção do número de erros e acertos para o tratamento das estatísticas do software
 */

package selecao;

public class Estatistica {
	
	private int numeroQuestao; //Número total de questões resolvidas
	private int numeroAcerto; //Número total de acertos
	private int acertosSeq; //Número atual de acertos em sequência
	private int acertoMax; //Quantidade máxima de acertos em sequência
	private int numeroErro; //Número total de erros
	private int errosSeq; //Número atual de erros em sequência
	private int erroMax; //Quantidade máxima de erros em sequência
	private double mediaAcerto; //Média de acertos
	private double mediaErro; //Média de Erros
	
	public Estatistica(int numeroQuestao, int numeroAcerto, int numeroErro) {		
		this.numeroQuestao = numeroQuestao;
		this.numeroAcerto = numeroAcerto;
		this.numeroErro = numeroErro;
	}
	
	public Estatistica() {
		
	}

	
	public int getAcertoMax() {
		return acertoMax;
	}

	public void setAcertoMax(int acertoMax) {
		this.acertoMax = acertoMax;
	}

	public int getErroMax() {
		return erroMax;
	}

	public void setErroMax(int erroMax) {
		this.erroMax = erroMax;
	}

	public int getNumeroQuestao() {
		return numeroQuestao;
	}

	public void setNumeroQuestao(int numeroQuestao) {
		this.numeroQuestao = numeroQuestao;
	}

	public int getNumeroAcerto() {
		return numeroAcerto;
	}

	public void setNumeroAcerto(int numeroAcerto) {
		this.numeroAcerto = numeroAcerto;
	}

	public int getNumeroErro() {
		return numeroErro;
	}

	public void setNumeroErro(int numeroErro) {
		this.numeroErro = numeroErro;
	}
	
	public int getAcertosSeq() {
		return acertosSeq;
	}

	public void setAcertosSeq(int acertosSeq) {
		this.acertosSeq = acertosSeq;
	}

	public int getErrosSeq() {
		return errosSeq;
	}

	public void setErrosSeq(int errosSeq) {
		this.errosSeq = errosSeq;
	}	
	
	public double getMediaAcerto() {
		return mediaAcerto;
	}

	public double getMediaErro() {
		return mediaErro;
	}
	
	//realiza os cáculos estatísticos que o usuário necessita
	public void calcularDados() {
		this.mediaAcerto = getNumeroAcerto()/getNumeroQuestao();
		this.mediaErro = getNumeroErro()/getNumeroQuestao();
	}
	
}
