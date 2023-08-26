package programacaoDinamica;

import java.util.Scanner;

public class FibonacciRecursiva {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("digite on numero:");
		long number = reader.nextLong();
		System.out.println(fib(number));
	}

	static long fib(long nr) {
		if (nr == 0 || nr == 1)
			return nr;
		return fib(nr-1) + fib(nr-2); 
	}

}
