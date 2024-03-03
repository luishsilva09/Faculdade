package Variveis;

public class Teste {
	public static void main(String[] args) {
		System.out.println("Teste de variaveis");
		
		int idade = 22;
		
		double salario = 200.99;
		
		int salarioInteiro = (int) salario;
		
		String teste = "luis";
		
		if(idade >= 18) {
			System.out.println("voce é maior de idade");
		}else {
			System.out.println("voce nao é maior de idade");
		}
		
		
		System.out.println("A idade é " + idade + " teu salario é " + salario);
		System.out.println("salario inteiro " + salarioInteiro);
		
//		while(idade > 0 ) {
//			System.out.println(idade);
//			idade = idade - 1;
//		}
		for(int cont = 10; cont > 0 ; cont--) {
			System.out.println(cont);
		}
	}
}
 