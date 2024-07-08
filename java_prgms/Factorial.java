package java_prgms;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number to find the factorial: ");
		int n = sc.nextInt();
		System.out.println("Factorial of "+n+" = "+factorial(n));
	}
	public static int factorial(int n) {
		int f=1;
		for(int i=1;i<=n;i++) {
			f=f*i;
		}
		return f;
	}

}
