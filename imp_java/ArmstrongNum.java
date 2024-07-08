package imp_java;

import java.util.Scanner;

public class ArmstrongNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int on = sc.nextInt();
		int tmp=on, n= on;
		int rem = 0, sum=0, cnt=0;
		
		while(n > 0) {
			n = n/10;
			cnt++;
		}
		while(tmp > 0) {
			rem = tmp%10;
			sum += Math.pow(rem, cnt);
			tmp = tmp/10;
		}
		if(on == sum) {
			System.out.println(on+" is Armstrong number");
		} else {
			System.out.println(on+" is not Armstrong number");
		}
	}
}
