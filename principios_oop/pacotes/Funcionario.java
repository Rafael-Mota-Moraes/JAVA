package pacotes;

public class Funcionario {
	private String nome;
	double salario;

	protected Funcionario(String nomeInit, double salarioInit) {
		nome = nomeInit;
		salario = salarioInit;

		System.out.println("Nome:  " + nome);
		System.out.println("Salário: " + salario);
	}

	Funcionario() {} // modificador de acesso padrão, só pode ser acessado por classes no mesmo pacote.
}