package patterns;

public class BoxPattern {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			System.out.print("* ");
		}
		System.out.println(" ");
		for(int i=1;i<4;i++) {
			System.out.print("*");
			for(int j=1;j<=(5-1)*2-1;j++) {
				System.out.print(" ");
			}
			System.out.println("*");
		}
		for(int i=1;i<=5;i++) {
			System.out.print("* ");
		}
	}
}
