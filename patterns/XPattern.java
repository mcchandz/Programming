package patterns;

public class XPattern {
	public static void main(String[] args) {
		for(int i=1;i<8;i++) {
			System.out.print("*");
			for(int j=1;j<=(8-1);i++) {
				System.out.print(" ");
			}
			System.out.println("*");
		}
	}

}
