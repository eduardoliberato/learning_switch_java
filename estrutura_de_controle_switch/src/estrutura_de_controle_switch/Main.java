package estrutura_de_controle_switch;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int x ;
		String dia;
		
			
		System.out.println("Escolha um dia da semana\n"
				+ "1 - Domingo\n"
				+ "2 - Segunda\n"
				+ "3 - Terça\n"
				+ "4 - Quarta\n"
				+ "5 - Quinta\n"
				+ "6 - Sexta\n"
				+ "7 - sabado\n"
				+ ":");
		
		x = sc.nextInt();
		
		switch (x) {
		case 1:
			dia = "o Domingo";
			break;
		case 2:
			dia = "a Segunda";
			break;
		case 3:
			dia = "a Terça";
			break;
		case 4:
			dia = "a Quarta";
			break;
		case 5:
			dia = "a Quinta";
			break;
		case 6:
			dia = "a Sexta";
			break;
		case 7:
			dia = "o Sabado";
			break;
		default:
			dia = "Valor invalido";
			break;
		}
		
		System.out.printf("O dia da semana escolhido foi %s", dia);
		
	}

}
