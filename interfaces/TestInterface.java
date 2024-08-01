interface Animal {
	/* 
	Regras das interfaces
	- Não pode ser instanciada.
	- Todos os atributos dentro de uma interface são obrigatoriamente public final e static.
	- Todos os métodos devem ser o mais acessível possível, ou seja, devem ser public.
	- A palavra abstract no método é opcional
	- Uma interface pode estender outras interfaces
	*/ 
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
