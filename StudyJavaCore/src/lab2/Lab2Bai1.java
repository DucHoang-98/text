package lab2;
import java.util.Scanner;

public class Lab2Bai1 {

	public static void main(String[] args) {
		Scanner nhap = new Scanner(System.in);
		System.out.print("Nhập hệ số a = ");
		double a = nhap.nextDouble();
		System.out.print("Nhập hệ số b = ");
		double b = nhap.nextDouble();
		if(a==0) {
			if(b==0) {
				System.out.println("Phương trình có vô số nghiệm");
			}else {
				System.out.println("Phương trình vô nghiệm");
			}
		}else {
			double x = -b/a;
			System.out.println("Phương trình có nghiệm là :");
			System.out.println("x = "+x);
		}
	}
	
}
