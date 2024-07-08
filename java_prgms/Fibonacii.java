package java_prgms;

import java.util.Scanner;

public class Fibonacii {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit to generate fibamocii series: ");
		int n = sc.nextInt();
		
		System.out.println("Fibonical series till "+n+" is:\n");
		Fibonacii.series(n);
	}
	public static void series(int n) {
		int pt=0, ct=1, nt=0;
		
		for(int i=0;i<n;i++) {
			if(n<=1) {
				nt = ct;
				System.out.println(nt);
			} else {
				nt = pt+ct;
				pt = ct;
				ct = nt;
			}
			System.out.println(nt);
		}	
	}
  }

