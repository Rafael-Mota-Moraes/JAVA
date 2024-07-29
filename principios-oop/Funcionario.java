class Funcionario {
	String nome;
	String cargo;
	int idade;

	// Este é o construtor

	Funcionario(String nome, String cargo, int idade) {
		this.nome = nome;
		this.cargo = cargo;
		this.idade = idade;
	}

	public static void main(String[] args) {
		Funcionario func = new Funcionario("João", "Desenvolvedor", 20);
		System.out.println("Nome: " + func.nome);
		System.out.println("Cargo: " + func.cargo);
		System.out.println("Idade: " + func.idade);

		System.out.println();

		Funcionario func2 = new Funcionario("Maria", "Desenvolvedora", 19);
		System.out.println("Nome: " + func2.nome);
		System.out.println("Cargo: " + func2.cargo);
		System.out.println("Idade: " + func2.idade);

	}
}