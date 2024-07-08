package java_prgms;

import java.util.Scanner;

public class Swap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("Values after swapping a="+a+" and b="+b);
	}

}
