import java.util.Scanner;

public class test1 {
	public static void main(String[] args) {
		Scanner nhap = new Scanner(System.in);
		
		System.out.print("a = ");
		int a = nhap.nextInt();
		
		String b = String.valueOf(a);
		
		int c = b.charAt(1);

		if(a>999&&a<10000) {
			if( a%5==0 && c%2!=0 ) {
				System.out.println(a);
			}
		}
	}
}
