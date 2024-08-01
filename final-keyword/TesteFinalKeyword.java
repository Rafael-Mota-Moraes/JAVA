// NÃO PODE SER EXTENDIDA!
final class ExemploFinal {
	// Definição de constante - use de final
	final int CODIGO_FIXO = 10;

	// Método final
	final void meuMetodo() {
		System.out.println("Método final");
	}
}


public class TesteFinalKeyword extends ExemploFinal {
	// Vai gerar erro de compilação!
	/* final void meuMetodo() {
		System.out.println("Método sobrescrito");
	} */

	public static void main(String[] args) {
		ExemploFinal testFinal = new ExemploFinal();
		System.out.println("Valor da constante: " + testFinal.CODIGO_FIXO);
		// Vai gerar erro, variavel com a final keyword não podem ter seu valor modificado
		// testFinal.CODIGO_FIXO = 555;
	}
}