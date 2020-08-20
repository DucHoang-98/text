import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World!!");	
		int a = 1 + 1;
		System.out.println("Kết quả là : "+a);
		int b = a + 1;
		System.out.println("Kết quả là : "+b);
		int c = b * 2;
		System.out.println("Kết quả là : "+c);
		int d = c / 2;
		System.out.println("Kết quả là : "+d);
		Scanner nhap = new Scanner(System.in);
		System.out.print("Mời bạn nhập tuổi : ");
		int age = nhap.nextInt();
		nhap.nextLine();
		System.out.print("Mời bạn nhập tên : ");
		String name = nhap.nextLine();
		System.out.println("Tuổi của bạn là : "+age);
		System.out.println("Tên của bạn là : "+name);
	}
}
