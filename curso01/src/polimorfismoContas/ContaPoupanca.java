package polimorfismoContas;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;	
	}

	@Override
	public String toString() {
		return "ContaPoupanca [saldo=" + saldo + ", getSaldo()=" + getSaldo() + ", getNumero()=" + getNumero()
				+ ", getAgencia()=" + getAgencia() + ", getTitular()=" + getTitular() + "]";
	}
	
	
	
}
