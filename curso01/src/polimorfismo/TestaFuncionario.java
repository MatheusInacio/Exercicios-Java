package polimorfismo;

public class TestaFuncionario {
	
	public static void main(String[] args) {
		
		Funcionario matheus =  new Gerente();
		matheus.setNome("Matheus");
		matheus.setSalario(7900.00);
		
		System.out.println(matheus.getBonificacao());
		
	}

}
