import java.util.Scanner;

public class kiemtratrinho {

	public static void main(String[] args) {
		Scanner nhap = new Scanner(System.in);
		
//		System.out.print("a = ");
//		int a = nhap.nextInt();
//		
//		int temp = a;
//		
//		int dao = 0;
//		
//		while(temp>0) {
//			dao = dao*10 + temp%10;
//			temp /= 10;
//		}
//		if(a==dao) {
//			System.out.println("doi xung");
//		}else {
//			System.out.println("khong doi xung");
//		}
		
		System.out.println("b = ");
		int b = nhap.nextInt();
		
		String c = String.valueOf(b);
		
		int d = c.charAt(1);
		if(b>999&&b<10000) {
			if(b%5==0&&d%2!=0) {
				System.out.println(b);
			}
		}
	}

}
