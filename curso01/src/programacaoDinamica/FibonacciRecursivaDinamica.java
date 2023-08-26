package programacaoDinamica;

import java.util.Scanner;

public class FibonacciRecursivaDinamica {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("digite on numero:");
		long number = reader.nextLong();
		// System.out.println(fib(number));

//		System.out.println("recursiva simples:");
//		for (int i = 0; i < number; i++) {
//			System.out.print(fib(i) + ",");
//		}
		
		System.out.println("");
		System.out.println("programaaoo dinamica:");
		for (int i = 0; i < number; i++) {
			System.out.print(bottomUpfib(i) + ",");
		}

	}

	static long fib(long nr) {
		if (nr == 0 || nr == 1)
			return 1;
		return fib(nr - 1) + fib(nr - 2);
	}

	static long bottomUpfib(int n) {
		long[] fib = new long[n + 2];
		fib[0] = 1;
		fib[1] = 1;
		for (int i = 2; i <= n; i++) {
			fib[i] = fib[i - 1] + fib[i - 2];
		}
		return fib[n];
	}

}
