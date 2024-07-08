package imp_java;

import java.util.Scanner;

public class NeonNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int n = sc.nextInt();
		
		int sq = n*n;
		int d1=0, d2=0;
		while(sq > 0) {
		    d1 = sq%10;
			d2 = d2+d1;
			sq = sq/10;
		}
		
		if(n == d2) {
			System.out.println(n+" is a Neon number");
		} else {
			System.out.println(n+" is not a Neon number");
		}
	}
}
