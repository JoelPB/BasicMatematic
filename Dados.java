/*
 * Questões a serem utilizadas
 */

package questoes;

import java.util.Arrays;
import java.util.List;

public class Dados {
	
	//Nomes de pessoas a serem utilizados
	/*private String[] nomeFeminino = {"Ana", "Bia", "Carmen", "Diana", 
			"Edite", "Fabiana", "Glória","Helena", "Ingrede", "Jade", "Kátia", "Laís", "Magda", "Nair",
			"Olívia", "Perla", "Raíssa", "Sandra", "Taís", "Vânia", "Yasmin", "Zoe"};
	private String[] nomeMasculino = {"André", "Bruno", "Caio", "Daniel", "Edson", 
			"Fred", "Gabriel", "Heitor", "Ivo", "João", "Kevin", "Lucas", "Marcel", "Naruto", "Olavo", "Pedro",
			"Rui", "Salomão", "Tiago", "Valber", "Yago", "Zózimo"};
	*/
	private List<String> nomeF = Arrays.asList("Ana", "Bia", "Carmen", "Diana", 
			"Edite", "Fabiana", "Glória","Helena", "Ingrede", "Jade", "Kátia", "Laís", "Magda", "Nair",
			"Olívia", "Perla", "Raíssa", "Sandra", "Taís", "Vânia", "Yasmin", "Zoe");
	private List<String> nomeM = Arrays.asList("André", "Bruno", "Caio", "Daniel", "Edson", 
			"Fred", "Gabriel", "Heitor", "Ivo", "João", "Kevin", "Lucas", "Marcel", "Naruto", "Olavo", "Pedro",
			"Rui", "Salomão", "Tiago", "Valber", "Yago", "Zózimo");
	
	//Enunciado das questões 
	/*private String[] enunciadoLugar = {"foi a feira", "foi a fazenda", "foi ao mercado", "foi ao WalMart", 
			"foi a mercearia", "foi ao sacolão"};*/
	private List<String> enunciadoL = Arrays.asList("foi a feira", "foi a fazenda", "foi ao mercado", "foi ao WalMart", 
			"foi a mercearia", "foi ao sacolão");
		
	//Ação
	//private String[] olhaAlgo = {"obteve", "conseguiu", "adquiriu", "pegou", "comprou", "apalpou"};
	private List<String> olhaA = Arrays.asList("obteve", "conseguiu", "adquiriu", "pegou", "comprou", "apalpou");
	
	//Valores a serem usados nos cálculos
	//private Integer[] numeroVisto = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 
	//		22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
	private List<Integer> numeroV = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 
			22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97);
	
	//Frutas 
	/*private String[] frutas = {"abacate", "abacaxi", "azeitona", "açaí", "acerola", "ameixa", "amora", "abóbora",
			"bacuri", "banana", "cacau", "cereja", "cajá", "cupuaçu", "carambola", "coco", "caqui", 
			"damasco", "figo", "goiaba ", "graviola ", "guaraná ", "jabuticaba ", "jaca ", "jambo", "jamelão",
			"kiwi", "laranja", "limão ", "maçã ", "manga ", "mangaba ", "maracujá ", "mamão", "melancia", 
			"melão", "morango", "pêra", "pêssego", "pinha", "pitanga", "pitomba", "romã",
			"seriguela", "tâmara", "tamarindo", "tangerina", "tomate", "umbu", "uva"};*/
	private List<String> fruta = Arrays.asList("abacate", "abacaxi", "azeitona", "açaí", "acerola", "ameixa", "amora", "abóbora",
			"bacuri", "banana", "cacau", "cereja", "cajá", "cupuaçu", "carambola", "coco", "caqui", 
			"damasco", "figo", "goiaba ", "graviola ", "guaraná ", "jabuticaba ", "jaca ", "jambo", "jamelão",
			"kiwi", "laranja", "limão ", "maçã ", "manga ", "mangaba ", "maracujá ", "mamão", "melancia", 
			"melão", "morango", "pêra", "pêssego", "pinha", "pitanga", "pitomba", "romã",
			"seriguela", "tâmara", "tamarindo", "tangerina", "tomate", "umbu", "uva");	
	
	
	public List<String> getNomeF() {
		return nomeF;
	}
	public List<String> getNomeM() {
		return nomeM;
	}	
	public List<String> getEnunciadoL() {
		return enunciadoL;
	}
	public List<String> getOlhaA() {
		return olhaA;
	}
	public List<Integer> getNumeroV() {
		return numeroV;
	}
	public List<String> getFruta() {
		return fruta;
	}
	
	@Override
		public String toString() {			
			return super.toString();
		}	
}
