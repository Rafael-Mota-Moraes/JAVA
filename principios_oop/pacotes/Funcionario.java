package pacotes;

public class Funcionario {
	public String nome;
	double salario;

	public Funcionario(String nomeInit, double salarioInit) {
		nome = nomeInit;
		salario = salarioInit;

		System.out.println("Nome:  " + nome);
		System.out.println("Salário: " + salario);
	}
}