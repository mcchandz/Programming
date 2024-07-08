package imp_java;

import java.util.Scanner;

public class TechNum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int temp,l,r,sum=0,d=0;
		temp=n;
		while(temp>0) {
			d++;
			temp=temp/10;
		}
		if(d%2==0) {
			r=n%100;
			l=n/100;
			sum=l+r;
			if(sum*sum==n) {
				System.out.println("It is tech number");
			}
			else {
				System.out.println("It is not tech number");
			}
		}
	}
}
