class Animal {
	public void comer() {
		System.out.println("Animal está comendo.");
	}

	public void fazerSom() {
		System.out.println("O animal faz um som.");
	}
}

class Cachorro extends Animal {
	public void latir() {
		System.out.println("O cachorro late");
	}


	public void fazerSom() {
		System.out.println("O animal faz um som de latido.");
	}
}

public class TesteHeranca {
	public static void main(String[] args) {
		Cachorro dog = new Cachorro();
		dog.latir();
		dog.comer();
		dog.fazerSom();
	}
}