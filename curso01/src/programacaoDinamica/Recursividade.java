package programacaoDinamica;

public class Recursividade {

	public static void main(String[] args) {

		System.out.println(multiplica(5L, 40L));

	}

	private static long multiplica(long num1, long num2) {

		if (num1 == 0 || num2 == 0) {
			return 0;
		} else if (num2 == 1) {
			return num1;
		} else {
			return (num1 + multiplica(num1, num2 - 1));
		}

	}

}
