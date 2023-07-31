package orientacaoObjetos;

public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.titular = new Cliente();
		contaDoPaulo.titular.nome = "Paulo";
		contaDoPaulo.saldo = 100;
		contaDoPaulo.deposita(50);

		System.out.println(contaDoPaulo.saldo);
		
		boolean sacou = contaDoPaulo.saca(20);
		System.out.println(contaDoPaulo.saldo);
		System.out.println(sacou);
		
		
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.titular = new Cliente();
		contaDaMarcela.titular.nome = "Marcela";
		contaDaMarcela.deposita(1500);
		
		if (contaDaMarcela.transfere(300, contaDoPaulo)) {
			System.out.println("Transferencia feita com sucesso");
		} else {
			System.out.println("Faltou dinheiro");
		}
		System.out.println(contaDoPaulo.saldo);
		System.out.println(contaDaMarcela.saldo);

	}

}
