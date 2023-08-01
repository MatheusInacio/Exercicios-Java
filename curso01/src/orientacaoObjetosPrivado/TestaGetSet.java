package orientacaoObjetosPrivado;

public class TestaGetSet {

	public static void main(String[] args) {
		Conta conta = new Conta(224226, 1337);
		System.out.println(conta.getNumero());
		System.out.println("o total de contas é " + Conta.getTotal());

		Cliente cliente = new Cliente();
		cliente.setNome("Matheus");

		conta.setTitular(cliente);

		System.out.println(conta.getTitular().getNome());

		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("desenvolvedor");
		
		System.out.println(titularDaConta.getProfissao());
		
		Conta conta2 = new Conta(22413226, 3313);
		
		System.out.println("o total de contas é " + Conta.getTotal());


	}

}

