package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int escolaridade, experiencia, ptsEscolaridade, ptsExperiencia;
		char dispViajar, habilitacao;
		String msg, cargo;
		
		System.out.println("Qual sua escolaridade?");
		System.out.println("1) Ensino Fundamental");
		System.out.println("2) Ensino M�dio");
		System.out.println("3) Ensino Superior");
		System.out.println("4) P�s Gradua��o");
		System.out.println("Digite uma op��o: ");
		escolaridade = sc.nextInt();
		System.out.println();
		System.out.println("Voc� tem quantos anos de experi�ncia?");
		experiencia = sc.nextInt();
		System.out.println("Voc� tem disponibilidade para viajar (S/N)?");
		dispViajar = sc.next().charAt(0);
		System.out.println("Voc� tem habilita��o de motorista? (S/N)");
		habilitacao = sc.next().charAt(0);
		
		if (escolaridade == 1) {
			ptsEscolaridade = 10;
		} else if (escolaridade == 2) {
			ptsEscolaridade = 20;
		} else if (escolaridade == 3) {
			ptsEscolaridade = 30;
		} else {
			ptsEscolaridade = 40;
		}
		
		if (experiencia <= 0) {
			ptsExperiencia = 0;
		} else if (experiencia > 0 && experiencia <= 2) {
			ptsExperiencia = 10;
		} else if (experiencia > 2 && experiencia <= 5) {
			ptsExperiencia = 20;
		} else {
			ptsExperiencia = 40;
		} 
		
		if (experiencia > 5 && (dispViajar =='S' || dispViajar == 's') && escolaridade >= 3) {
			msg = "Voc� est� habilitado para o(s) seguinte(s) cargo(s): ";
			cargo = "GERENTE\nANALISTA";
		} else if (experiencia > 2 && escolaridade >= 3) {
			msg = "Voc� est� habilitado para o(s) seguinte(s) cargo(s): ";
			cargo = "GERENTE";
		} else if (escolaridade >= 2 && (habilitacao == 'S' || habilitacao == 's')) {
			msg = "Voc� est� habilitado para o(s) seguinte(s) cargo(s): ";
			cargo = "ASSISTENTE";
		} else {
			msg = "Infelizmente seu perfil n�o atende a empresa";
			cargo = "";
		}
		
		System.out.println("Pontos por escolaridade: " + ptsEscolaridade);
		System.out.println("Pontos por experi�ncia: " + ptsExperiencia);
		System.out.println();
		System.out.println(msg);
		System.out.println(cargo);

	}

}
