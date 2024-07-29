public class Bolo {
	int quantidadeAcucar;
	
	public static void main(String[] args) {
		Bolo boloDeChocolate = new Bolo();
		boloDeChocolate.quantidadeAcucar = 10;

		Bolo boloDeBaunilha = new Bolo();
		boloDeBaunilha.quantidadeAcucar = 8;

		System.out.println(
			"Quantidade de açucar no bolo de chocolate "
			+ boloDeChocolate.quantidadeAcucar
		);
		System.out.println(
			"Quantidade de açucar no bolo de baunilha "
			+ boloDeBaunilha.quantidadeAcucar
		);
	}
}