package Classe1;

import java.util.Scanner;

public class Ex1003 {

	public static void main(String[] args) {
		
		int a = 0, b = 0, x = 0;
		
		Scanner n = new Scanner(System.in);
		
		a = n.nextInt();
		b = n.nextInt();

		x = a+b;
		
		System.out.printf("SOMA = %d\n",x);

	}

}
