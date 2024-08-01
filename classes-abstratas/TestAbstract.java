abstract class Carro {
	abstract void acelerar();
	
	void frear() {
		System.out.println("Carro está freando...");
	}
}

class CarroF1 extends Carro {
	void acelerar() {
		System.out.println("Acelerando rapidamente");
	}
}

class Caminhao extends Carro {
	void acelerar() {
		System.out.println("Acelerando lentamente");
	}
}

public class TestAbstract {
	public static void main(String[] args) {
		CarroF1 c1 = new CarroF1();
		Caminhao c2 = new Caminhao();
		c1.acelerar();
		c2.acelerar();
	}
}
