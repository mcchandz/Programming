package imp_java;

import java.util.Scanner;

public class KrishnamurtyPetersonNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int n = sc.nextInt();
		int tmp = n;
		int rem = 0, sum=0;
		
		while(n > 0) {
			rem = n%10;
			sum += fact(rem);
			n = n/10;
		}
		if(sum == tmp) {
			System.out.println(tmp+" is Krishnamurty number");
		} else {
			System.out.println(tmp+" is not Krishnamurty number");
		}
	}
	public static int fact(int n) {
		int f=1;
		for(int i=1;i<=n;i++) {
			f=f*i;
		}
		return f;
	}
}
