package java_prgms;

import java.util.Scanner;

public class SwapwithTemp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int temp = 0;
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("Values after swapping a="+a+" and b="+b);
	}

}
