package pacotes;

public class Funcionario {
	private String nome;
	public double salario;
	static int numeroStatico = 10;

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

	public void aumentarSalario(int porcentagem) {
		salario += salario * porcentagem / 100;
	}


	public void alterarQualquerSalario(Funcionario func, double novoSalario) {
		func.salario = novoSalario;
	}

	public static void exibirValor(int valor) {
		System.out.println("O valor é: " + valor);
	}

}