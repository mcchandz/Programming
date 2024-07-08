package java_prgms;

import java.util.Scanner;

public class Area {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius: ");
		float rad = sc.nextFloat();
		System.out.println("Enter the side: ");
		float s = sc.nextFloat();
		System.out.println("Enter the length and breadth: ");
		float l = sc.nextFloat();
		float b = sc.nextFloat();
		System.out.println("Enter the base and height: ");
		float ba = sc.nextFloat();
		float h = sc.nextFloat();
		
		Area ar = new Area();
		ar.circle(rad);
		ar.square(s);
		ar.rectangle(l, b);
		ar.triangle(h, ba);
		
	}
	public void circle(float rad) {
		double a = 2*3.142*rad*rad;
		System.out.println("Area of circle: "+a);
	}
	public void square(float s) {
		double b = s*s;
		System.out.println("Area of square: "+b);
	}
	public void rectangle(float l, float b) {
		double c = l*b;
		System.out.println("Area of rectangle: "+c);
	}
	public void triangle(float h, float ba) {
		double t = 0.5*ba*h;
		System.out.println("Area of triangle: "+t);
	}
}
