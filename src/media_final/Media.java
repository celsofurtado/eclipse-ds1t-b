package media_final;

public class Media {

	public static void main(String[] args) {
		
		// Nome do aluno
		String nomeDoAluno = "Raíssa da Silva";
		
		// Notas do aluno
		double nota1Bim = 8.9;
		double nota2Bim = 7.6;
		double nota3Bim = 9.7;
		double nota4Bim = 6.7;
		
		// Cálculo da média
		// A média é a soma das notas do aluno dividido por 4
		double media = (nota1Bim + nota2Bim + nota3Bim + nota4Bim) / 4;
		
		// Exibir resultado
		System.out.println("O(a) aluno(a) " + nomeDoAluno + " ficou com média " + media + "!");

	}

}
