class Animal {
	public void comer() {
		System.out.println("Animal está comendo.");
	}
}

class Cachorro extends Animal {
	public void latir() {
		System.out.println("O cachorro late");
	}
}

public class TesteHeranca {
	public static void main(String[] args) {
		Cachorro dog = new Cachorro();
		dog.latir();
		dog.comer();
	}
}