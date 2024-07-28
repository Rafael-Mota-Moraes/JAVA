class SwitchCaseInitialization {
	public static void main(String[] args) {
		String dia = "Ter";

		String tipoDoDia = switch(dia){
			case "Seg", "Ter", "Qua", "Qui", "Sex" -> "Dia útil";
			case "Sabado", "Domingo" -> "Fim de semana";
			default -> "Desconhecido";
		};

		System.out.println(tipoDoDia);
	}
}