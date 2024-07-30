package pacotes;

public class Funcionario {
	private String nome;
	public double salario;

	public Funcionario(String nomeInit, double salarioInit) {
		nome = nomeInit;
		salario = salarioInit;
	}

	// Funcionario() {} // modificador de acesso padrão, só pode ser acessado por classes no mesmo pacote.


	public String obterInfo() {
		return "Nome: " + nome + ", Salário: " + salario;
	}


	public void aumentarSalario(double aumento) {
		salario += aumento;
	}

	public void alterarQualquerSalario(Funcionario func, double novoSalario) {
		func.salario = novoSalario;
	}

}