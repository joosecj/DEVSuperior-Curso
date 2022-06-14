package desafios;

import java.util.Locale;
import java.util.Scanner;

public class imposto {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double anualSalario, rendaMensal, anualServico, anualCapital, anualMedico, anualEducacao;
		double juros10, juros15, juros20, juros30;
		double impostoSalario, impostoCapital, impostoServico, impostoTotal;
		double gastoDeducao, abatimento, maximoDedutivel, impostoDevido;
		
		System.out.print("Renda anual com sal�rio:");
		anualSalario = sc.nextDouble();
		
		System.out.print("Renda anual com presta��o de servi�o:");
		anualServico = sc.nextDouble();
		
		System.out.print("Renda anual com ganho de capital:");
		anualCapital = sc.nextDouble();
		
		System.out.print("Gastos m�dicos:");
		anualMedico = sc.nextDouble();
		
		System.out.print("Gastos educacionais:");
		anualEducacao = sc.nextDouble();
		
		rendaMensal = anualSalario / 12;
		juros10 = 0.10;
		juros15 = 0.15;
		juros20 = 0.20;
		juros30 = 0.30;
		// CONDI��O PARA CALCULAR IMPOSTO SOBRE SAL�RIO
		if (rendaMensal < 3000.0) {
			impostoSalario = 0;
		}
		else if (rendaMensal < 5000.0) {
			impostoSalario = anualSalario * juros10;
		}
		else {
			impostoSalario = anualSalario * juros20;
		}
		// CALCULO DO IMPOSTO SOBRE PRESTA��O DE SERVI�O
		impostoServico = (anualServico > 0) ? anualServico * juros15 : anualServico;
		// CALCULO DO IMPOSTO SOBRE CAPITAL
		impostoCapital = (anualCapital > 0) ? anualCapital * juros20 : anualCapital;
			
		// CALCULO IMPOSTO BRUTO		
		impostoTotal = impostoSalario + impostoServico + impostoCapital;
		// CALCULO TOTAL DE DEDU��ES 
		gastoDeducao =  anualMedico + anualEducacao;
		// VALOR M�XIMO DE 30% DE ABATIMENTO SOBRE IMPOSTO
		maximoDedutivel = impostoTotal * juros30;
	    
	    // ESTRUTURA PARA VERIFICAR TOTAL DEDU��O DO IMPOSTO
		if (gastoDeducao > maximoDedutivel) {
			abatimento = maximoDedutivel;
		}
		else {
			abatimento = gastoDeducao;
		}
		// CALCULO DO IMPOSTO DEVIDO
		impostoDevido = impostoTotal - abatimento;
		
		System.out.println();
		System.out.println("RELAT�RIO DE IMPOSTO DE RENDA");
		System.out.println();
		System.out.println("CONSOLIDADO DE RENDA:");
		System.out.printf("Imposto sobre sal�rio: %.2f%n", impostoSalario);
		System.out.printf("Imposto sobre servi�os: %.2f%n", impostoServico);
		System.out.printf("Imposto sobre ganho de capital: %.2f%n", impostoCapital);
		System.out.println();
		System.out.println("DEDU��ES:");
		System.out.printf("M�ximo dedut�vel: %.2f%n", maximoDedutivel);
		System.out.printf("Gastos dedut�veis: %.2f%n", gastoDeducao);
		System.out.println();
		System.out.println("RESUMO:");
		System.out.printf("Imposto bruto total: %.2f%n", impostoTotal);
		System.out.printf("Abatimento: %.2f%n", abatimento);
		System.out.printf("Imposto devido: %.2f%n", impostoDevido);
		sc.close();
	}
}
