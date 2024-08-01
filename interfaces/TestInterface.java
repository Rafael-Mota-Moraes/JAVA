interface Animal {
	void fazerSom(); // Método abstrato
}

class Cachorro implements Animal {
	public void fazerSom() {
		System.out.println("Cachorro está latindo...");
	}
}

class Gato implements Animal {
	public void fazerSom() {
		System.out.println("Cachorro está miando...");
	}
}

public class TestInterface {
	public static void main(String[] args) {
		Cachorro c = new Cachorro();
		c.fazerSom();
		Gato g = new Gato();
		g.fazerSom();
	}
}
