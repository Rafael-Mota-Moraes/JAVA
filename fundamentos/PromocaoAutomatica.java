public class PromocaoAutomatica {
	public static void main(String[] args) {
		byte a = 10;
		int b = a + 5; // a é promovido para int antes do cálculo
		System.out.println("b = " + b);

		int c = 10;
		float d = 1.5f + a; // d é promovido para int antes do cálculo
		System.out.println("d = " + d);
	}
}