package lab1;
import java.util.Scanner;

public class Lab1Bai4 {

	public static void main(String[] args) {
		
		Scanner nhap = new Scanner(System.in);
		
		System.out.print("Nhập hệ số a = ");
		double a = nhap.nextDouble();
		System.out.print("Nhập hệ số b = ");
		double b = nhap.nextDouble();
		System.out.print("Nhập hệ số c = ");
		double c = nhap.nextDouble();
		
		double delta = Math.pow(b, 2)-4*a*c;
		
		System.out.println("Phương trình bậc hai có nghiệm là : ");
		
		double x1 = (-b-Math.sqrt(delta)) / (2*a);
		double x2 = (-b+Math.sqrt(delta)) / (2*a);
		
		System.out.println("x1 = "+x1);
		System.out.println("x2 = "+x2);
	}

}
