import pacotes.Funcionario;

public class FolhaDePagamento {
	public static void main(String[] args) {
		Funcionario func = new Funcionario("João", 6200);
		// Nome não é público, logo a linha abaixo não funciona
		// func.nome = "Carlos";
		System.out.println(func.nome);
	}
}