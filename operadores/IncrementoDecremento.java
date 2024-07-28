class IncrementoDecremento {
	public static void main(String[] args) {
		int a = 10;
		a++; // equivalente a: a = a + 1 
		System.out.println("Valor de a = " + a);
		a--; // equivalente a: a = a - 1
		System.out.println("Valor de a = " + a);

		int b = --a; // Pré incremento
		System.out.println("Valor de b = " + b);
	}
}