package polimorfismo;

public class SistemaInterno {

	private int senha = 2222;

	public void autentica(Gerente g) {

		if (g.autentica(this.senha))
			System.out.println("autorizado");
		else
			System.out.println("não autorizado");
	}
}
