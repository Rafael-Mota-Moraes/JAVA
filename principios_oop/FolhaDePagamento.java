import pacotes.Funcionario;

public class FolhaDePagamento {
	public static void main(String[] args) {
		// Construtor de funcionário agora é privado, logo não é possivel acessa-lo aqui.
		// Funcionario func = new Funcionario("João", 6200);
		// Nome não é público, logo a linha abaixo não funciona
		// func.nome = "Carlos";
		// Nome agora possui o modificador de acesso "private", logo só pode ser acessado de dentro de sua classe, e a linha abaixo não funciona
		// System.out.println("Nome da main: " + func.nome);

		// TestePackage tp = new TestePackage();

		Funcionario func = new Funcionario("João", 6200.00);
		func.aumentarSalario(800.00);
		System.out.println(func.obterInfo());
		func.alterarQualquerSalario(func, 10000.00);
		System.out.println(func.obterInfo());
		func.aumentarSalario(10);
		System.out.println(func.obterInfo());
		Funcionario.exibirValor(10);
		System.out.println(Funcionario.numero);
	}
}