package lab2;
import java.util.Scanner;

public class Lab2Bai2 {

	public static void main(String[] args) {
		Scanner nhap = new Scanner(System.in);
		System.out.print("Nhập hệ số a = ");
		double a = nhap.nextDouble();
		System.out.print("Nhập hệ số b = ");
		double b = nhap.nextDouble();
		System.out.print("Nhập hệ số c = ");
		double c = nhap.nextDouble();
		if(a==0) {
			if(b==0) {
				if(c==0) {
					System.out.println("Phương trình có vô số nghiệm");
				}else {
					System.out.println("Phương trình vô nghiệm");
				}
			}else {
				double x = -c/b;
				System.out.println("Phương trình trở thành phương trình bậc nhất một ẩn");
				System.out.println("Phương trình có nghiệm là : ");
				System.out.println("x = "+x);
			}
		}else {
			double del = b*b-4*a*c;
			if(del<0) {
				System.out.println("Phương trình vô nghiệm");
			}else if(del==0) {
				double x12 = -b/(2*a);
				System.out.println("Phương trình có một nghiệm phân biệt");
				System.out.println("x1 = x2 = "+x12);
			}else {
				double x1 = (-b-Math.sqrt(del))/(2*a);
				double x2 = (-b+Math.sqrt(del))/(2*a);
				System.out.println("Phương trình có hai nghiệm phân biệt");
				System.out.println("x1 = "+x1);
				System.out.println("x2 = "+x2);
			}
		}

	}

}
