package imp_java;

import java.util.Scanner;

public class BuzzNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int n = sc.nextInt();
		
		if((n%10 == 7) || (n%7 == 0)) {
			System.out.println(n+" is Buzz number");
		} else {
			System.out.println(n+" is not Buzz number");
		}
	}
}
