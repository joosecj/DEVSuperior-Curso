package desafios;

import java.util.Locale;
import java.util.Scanner;

public class atletas {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String name = null, maisAlto = " ", resultAlturaMulher;
		int n, contM, contH;
		char sexo;
		double altura, peso, soma;
		double testeAltura, pesoMedio, contAlturaMulher, alturaMediaMulher, porcentagemHomens; 
		
		soma = 0;
		altura = 0;
		contM = 0;
		contH = 0;
		testeAltura = 0;
		contAlturaMulher = 0;
		alturaMediaMulher = 0;

		System.out.print("Qual a quantidade de atletas? ");
		n = sc.nextInt();
		while (n <= 0) {
			System.out.print("Numero invalido, digite novamente: ");
			n = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			System.out.printf("Digite os dados do %dº atleta : %n", i+1);
			System.out.print("Nome: ");
			sc.nextLine();
			name = sc.nextLine();
			System.out.print("Sexo [M/F]: ");
			sexo = sc.next().charAt(0);
			while (sexo != 'F' && sexo != 'M') {
				System.out.print("Opção invalida, tente novamente [M/F]: ");
				sexo = sc.next().charAt(0);
			}
			System.out.print("Altura: ");
			altura = sc.nextDouble();
			while (altura <= 0 || altura >= 3.0) {
				System.out.print("Altura invalida, tente novamente: ");
				altura = sc.nextDouble();	
			}
			System.out.print("Peso: ");
			peso = sc.nextDouble();
			soma += peso;
			while (peso <= 30.0 || peso >= 300.0) {
				System.out.println("Peso invalida, tente novamente: ");
				peso = sc.nextDouble();
			}
			
			if (altura > testeAltura) {
				maisAlto = name;
				testeAltura = altura;
			}
			if (sexo == 'F') {
				contAlturaMulher += altura;
				contM++;
			} else {
				contH++;
			}
		}

		pesoMedio = mediaGeral(soma, n); 
		porcentagemHomens = contH * 100 / n;
		
		alturaMediaMulher = mediaGeral(contAlturaMulher, contM);
		
		resultAlturaMulher = VerificarAltura(alturaMediaMulher);
	
		relatorio(pesoMedio, maisAlto, porcentagemHomens,resultAlturaMulher);
	
		
		sc.close();
	}
	
	public static double mediaGeral (double numeroGeral, int qtsAtleta) {
		double media = 0;
		if (numeroGeral == 0 ) {
			return media;
		}else {
			media = numeroGeral / qtsAtleta;
			return media;
		}
	}
	
	public static String VerificarAltura (double verificarMulheres) {
		String msgMulheres;
		if (verificarMulheres == 0 ) {
			msgMulheres = "Não há mulheres cadastradas";
			return msgMulheres;
		}else {
			msgMulheres = "Altura média das mulheres: " + verificarMulheres;
			return msgMulheres;
		}
	}
	public static void relatorio (double pMedio, String mAlto, double porcHomens, String resultAltM) {
		System.out.println("------ RELATORIO ------");
		System.out.printf(" %n Peso mÃ©dio dos atletas: %.2f%n%n Atleta mais alto: %s%n%n Porcentagem de homens: %.2f%n%n %s%n ", pMedio, mAlto, porcHomens, resultAltM);
		
	}
}
