class InformaRegras {
	@Deprecated
	public void mostrarRegrasParaAposentadoria() {
		System.out.println("Regras para aposentadoria.");
	}

	public void mostrarNovasRegrasParaAposentadoria() {
		System.out.println("NOVAS regras para aposentadoria.");
	}
}

public class Previdencia {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		InformaRegras regras = new InformaRegras();
		// Uso do método obsoleto
		regras.mostrarRegrasParaAposentadoria();
		// Uso do novo método
		regras.mostrarNovasRegrasParaAposentadoria();
	}
}