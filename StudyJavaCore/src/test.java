import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner nhap = new Scanner(System.in);
		
		System.out.print("a = ");
		int a = nhap.nextInt();
		
		int b = 0;
		int c =a;
		
		while(c>0) {
			b = b*10 + c%10;
			c = c/10;
		}
		if(b==a) {
			System.out.println("doi xung");
		}else {
			System.out.println("Khong doi xung");
		}
	}
}
