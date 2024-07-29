class Funcionario {
	String nome;
	String cargo;
	int idade;

	public static void main(String[] args) {
		Funcionario func = new Funcionario();
		func.nome = "João";
		func.cargo = "Desenvolvedor";
		func.idade = 20;

		System.out.println("Nome: " + func.nome);
		System.out.println("Cargo: " + func.cargo);
		System.out.println("Idade: " + func.idade);


		Funcionario func2 = new Funcionario();
		func2.nome = "Maria";
		func2.cargo = "Desenvolvedora";
		func2.idade = 19;

		System.out.println("Nome: " + func2.nome);
		System.out.println("Cargo: " + func2.cargo);
		System.out.println("Idade: " + func2.idade);

	}
}