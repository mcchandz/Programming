package java_prgms;

import java.util.Scanner;

public class StringRev {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String main = sc.next();
		String rev = "";
		char c ;
		int flag = 0;
		
		for(int i=main.length()-1;i>=0;i--) {
			c = main.charAt(i);
			rev +=c;			
		}
		System.out.println(rev);
		
		for(int i=0;i<main.length();i++) {
			if(main.charAt(i) != rev.charAt(i)) {
				flag = 1;
				break;
			}else {
				flag = 0;
			}
		}
		if(flag == 0) {
			System.out.println("Strings are palindrome");
		} else {
			System.out.println("Strings are not palindrome");
		}

	}
	
}
