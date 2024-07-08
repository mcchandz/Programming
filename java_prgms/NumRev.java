package java_prgms;

import java.util.Scanner;

public class NumRev {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int tmp = num, rev=0, rem=0;
		
		while(num>0) {
			rem = num%10;
			rev = rev*10+rem;
			num = num/10;
		}
		System.out.println("Reverse of "+tmp+" is "+rev);
		
		if(tmp == rev) {
			System.out.println("Number is palindrome");
		} else {
			System.out.println("Number is not palindrome");
		}
	}
}
