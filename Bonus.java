/*
 * Gera o a bonifica��o e as mensagens de motiva��o, ou para mudar de n�vel
 */

package questoes;

import java.util.Arrays;
import java.util.List;

public class Bonus {
	
	/*private String[] mMotivacional = {"mesmo quando erramos aprendemos", "continue tentado, o  maior erro que um homem pode cometer � ter medo de errar",
			"continue tentado, o �nico homem que nunca comete erros � aquele que nunca faz coisa alguma", "continue tentado, pois um homem nunca deve envergonhar-se por reconhecer que se enganou, pois isso equivale a dizer que hoje � mais s�bio do que era ontem",
			"errar tem a mesma import�ncia que acertar, pois um � conseq��ncia do outro", "infelizmente n�o foi dessa vez, continue tentando, mesmo os pequenos erros edificam o seu aprendizado"};
	private String[] mBonificacao = {"parab�ns, seu esfor�o tem dado resultado", "que bom que o seu conhecimento tem aumentado, parab�ns",
			"�timo, de passo em passo voc� tem seguido no infinito caminho do conhecimento"};
	private String[] questaoBonus = {}; 
	private int[] respostaQuest�oBonus = {};*/
	
	private int questaoBonus; //para armazenas a posi��o da respsota da quest�o de bonus
			
	private List<String> motivacional = Arrays.asList("mesmo quando erramos aprendemos", "continue tentado, o  maior erro que um homem pode cometer � ter medo de errar",
			"continue tentado, o �nico homem que nunca comete erros � aquele que nunca faz coisa alguma", "continue tentado, pois um homem nunca deve envergonhar-se por reconhecer que se enganou, pois isso equivale a dizer que hoje � mais s�bio do que era ontem",
			"errar tem a mesma import�ncia que acertar, pois um � conseq��ncia do outro", "infelizmente n�o foi dessa vez, continue tentando, mesmo os pequenos erros edificam o seu aprendizado");
	private List<String> bonificacao = Arrays.asList("parab�ns, seu esfor�o tem dado resultado", "que bom que o seu conhecimento tem aumentado, parab�ns",
			"�timo, de passo em passo voc� tem seguido no infinito caminho do conhecimento");
	private List<String> bonusSoma = Arrays.asList("");
	private List<Integer> respostaSoma = Arrays.asList(1,2);
	
	private List<String> bonusSub = Arrays.asList("");
	private List<Integer> respostaSub = Arrays.asList(1,2);
	
	private List<String> bonusMult = Arrays.asList("");
	private List<Integer> respostaMult = Arrays.asList(1,2);
	
	private List<String> bonusDiv = Arrays.asList("");
	private List<Integer> respostaDiv = Arrays.asList(1,2);
	
	
	public int getQuestaoBonus() {
		return questaoBonus;
	}
	public void setQuestaoBonus(int questaoBonus) {
		this.questaoBonus = questaoBonus;
	}
	public List<String> getMotivacional() {
		return motivacional;
	}
	public List<String> getBonificacao() {
		return bonificacao;
	}
	public List<String> getBonusSoma() {
		return bonusSoma;
	}
	public List<Integer> getRespostaSoma() {
		return respostaSoma;
	}
	public List<String> getBonusSub() {
		return bonusSub;
	}
	public List<Integer> getRespostaSub() {
		return respostaSub;
	}
	public List<String> getBonusMult() {
		return bonusMult;
	}
	public List<Integer> getRespostaMult() {
		return respostaMult;
	}
	public List<String> getBonusDiv() {
		return bonusDiv;
	}
	public List<Integer> getRespostaDiv() {
		return respostaDiv;
	}
		
	/*
	 * Falta fazer a l�gica para as quest�es b�nus e as suas respostas
	 */
		
	
	
	
}
