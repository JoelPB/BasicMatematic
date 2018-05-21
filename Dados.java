/*
 * Quest�es a serem utilizadas
 */

package questoes;

import java.util.Arrays;
import java.util.List;

public class Dados {
	
	//Nomes de pessoas a serem utilizados
	/*private String[] nomeFeminino = {"Ana", "Bia", "Carmen", "Diana", 
			"Edite", "Fabiana", "Gl�ria","Helena", "Ingrede", "Jade", "K�tia", "La�s", "Magda", "Nair",
			"Ol�via", "Perla", "Ra�ssa", "Sandra", "Ta�s", "V�nia", "Yasmin", "Zoe"};
	private String[] nomeMasculino = {"Andr�", "Bruno", "Caio", "Daniel", "Edson", 
			"Fred", "Gabriel", "Heitor", "Ivo", "Jo�o", "Kevin", "Lucas", "Marcel", "Naruto", "Olavo", "Pedro",
			"Rui", "Salom�o", "Tiago", "Valber", "Yago", "Z�zimo"};
	*/
	private List<String> nomeF = Arrays.asList("Ana", "Bia", "Carmen", "Diana", 
			"Edite", "Fabiana", "Gl�ria","Helena", "Ingrede", "Jade", "K�tia", "La�s", "Magda", "Nair",
			"Ol�via", "Perla", "Ra�ssa", "Sandra", "Ta�s", "V�nia", "Yasmin", "Zoe");
	private List<String> nomeM = Arrays.asList("Andr�", "Bruno", "Caio", "Daniel", "Edson", 
			"Fred", "Gabriel", "Heitor", "Ivo", "Jo�o", "Kevin", "Lucas", "Marcel", "Naruto", "Olavo", "Pedro",
			"Rui", "Salom�o", "Tiago", "Valber", "Yago", "Z�zimo");
	
	//Enunciado das quest�es 
	/*private String[] enunciadoLugar = {"foi a feira", "foi a fazenda", "foi ao mercado", "foi ao WalMart", 
			"foi a mercearia", "foi ao sacol�o"};*/
	private List<String> enunciadoL = Arrays.asList("foi a feira", "foi a fazenda", "foi ao mercado", "foi ao WalMart", 
			"foi a mercearia", "foi ao sacol�o");
		
	//A��o
	//private String[] olhaAlgo = {"obteve", "conseguiu", "adquiriu", "pegou", "comprou", "apalpou"};
	private List<String> olhaA = Arrays.asList("obteve", "conseguiu", "adquiriu", "pegou", "comprou", "apalpou");
	
	//Valores a serem usados nos c�lculos
	//private Integer[] numeroVisto = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 
	//		22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
	private List<Integer> numeroV = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 
			22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97);
	
	//Frutas 
	/*private String[] frutas = {"abacate", "abacaxi", "azeitona", "a�a�", "acerola", "ameixa", "amora", "ab�bora",
			"bacuri", "banana", "cacau", "cereja", "caj�", "cupua�u", "carambola", "coco", "caqui", 
			"damasco", "figo", "goiaba ", "graviola ", "guaran� ", "jabuticaba ", "jaca ", "jambo", "jamel�o",
			"kiwi", "laranja", "lim�o ", "ma�� ", "manga ", "mangaba ", "maracuj� ", "mam�o", "melancia", 
			"mel�o", "morango", "p�ra", "p�ssego", "pinha", "pitanga", "pitomba", "rom�",
			"seriguela", "t�mara", "tamarindo", "tangerina", "tomate", "umbu", "uva"};*/
	private List<String> fruta = Arrays.asList("abacate", "abacaxi", "azeitona", "a�a�", "acerola", "ameixa", "amora", "ab�bora",
			"bacuri", "banana", "cacau", "cereja", "caj�", "cupua�u", "carambola", "coco", "caqui", 
			"damasco", "figo", "goiaba ", "graviola ", "guaran� ", "jabuticaba ", "jaca ", "jambo", "jamel�o",
			"kiwi", "laranja", "lim�o ", "ma�� ", "manga ", "mangaba ", "maracuj� ", "mam�o", "melancia", 
			"mel�o", "morango", "p�ra", "p�ssego", "pinha", "pitanga", "pitomba", "rom�",
			"seriguela", "t�mara", "tamarindo", "tangerina", "tomate", "umbu", "uva");	
	
	
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
