/*
 * A classe faz a sele��o do n�mero de erros e acertos para o tratamento das estat�sticas do software
 */

package selecao;

public class Estatistica {
	
	private int numeroQuestao; //N�mero total de quest�es resolvidas
	private int numeroAcerto; //N�mero total de acertos
	private int acertosSeq; //N�mero atual de acertos em sequ�ncia
	private int acertoMax; //Quantidade m�xima de acertos em sequ�ncia
	private int numeroErro; //N�mero total de erros
	private int errosSeq; //N�mero atual de erros em sequ�ncia
	private int erroMax; //Quantidade m�xima de erros em sequ�ncia
	private double mediaAcerto; //M�dia de acertos
	private double mediaErro; //M�dia de Erros
	
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
	
	//realiza os c�culos estat�sticos que o usu�rio necessita
	public void calcularDados() {
		this.mediaAcerto = getNumeroAcerto()/getNumeroQuestao();
		this.mediaErro = getNumeroErro()/getNumeroQuestao();
	}
	
}
