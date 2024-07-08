package imp_java;

import java.util.Scanner;

public class SunnyNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int n = sc.nextInt();
		int tmp = n;
		int d1=0, sum=0;
		
		while(n > 0) {
			d1 = n%10;
			sum = sum+d1;
			n = n/10;
		}
		
		int sq = (int) Math.sqrt(sum);
		
		if(sum == sq*sq ) {
			System.out.println(tmp+" is Sunny number");
		} else {
			System.out.println(tmp+" is not Sunny number");
		}
	}
}
