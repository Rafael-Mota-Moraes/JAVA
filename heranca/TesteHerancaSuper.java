class Animal {
	String nome;

	Animal(String nome) {
		this.nome = nome;
	}
}

class Cachorro extends Animal {
	String raca;
	Cachorro(String nome, String raca) {
		super(nome);  // Chama o construtor da classe animal
		this.raca = raca;
	}
}

class TesteHerancaSuper {
	public static void main(String[] args) {
		Cachorro dog = new Cachorro("Rex", "Poddle");
		System.out.println(dog.raca);
		System.out.println(dog.nome);
	}
}