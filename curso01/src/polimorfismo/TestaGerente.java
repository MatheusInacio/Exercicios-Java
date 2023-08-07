package polimorfismo;

public class TestaGerente {

	public static void main(String[] args) {

		Autenticavel referencia = new Gerente();

//		Autenticavel referencia = new Cliente();

//		Autenticavel referencia = new Administrador();

		Gerente gerente = new Gerente();
		gerente.setNome("Matheus");
		gerente.setSalario(7900.00);

		gerente.setSenha(22222);

		boolean autenticou = gerente.autentica(22222);
		System.out.println(autenticou);
		System.out.println(gerente.getBonificacao());

	}

}
