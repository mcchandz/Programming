package imp_java;

import java.util.Scanner;

public class SpyNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int n = sc.nextInt();
		int tmp=n;
		int rem = 0, sum=0, mul=1;
		
		while(n > 0) {
			rem = n%10;
			sum += rem;
			n = n/10;
		}
		System.out.println("Sum = "+sum);
		while(tmp > 0) {
			rem = tmp%10;
			mul *= rem;
			tmp = tmp/10;
		}
		System.out.println("Product = "+mul);
		
		if(sum == mul) {
			System.out.println("It is Spy number");
		} else {
			System.out.println("It is not Spy number");
		}
	}
}
