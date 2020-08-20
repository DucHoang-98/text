package lab2;
import java.util.Scanner;

public class Lab2Bai4 {

	public static void main(String[] args) {
		Scanner nhap = new Scanner(System.in);
		boolean ma = true;
		do {
		System.out.println("-------------Menu-------------");
		System.out.println("1. Giải phương trình bậc nhất.");
		System.out.println("2. Giải phương trình bậc hai.");
		System.out.println("3. Tính tiền điện.");
		System.out.println("4. Kết thúc");
		System.out.println("------------------------------");
		System.out.print("Mời nhập chức năng : ");
		int n = nhap.nextInt();
			switch(n) {
			case 1 : 		
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
				break;
			case 2 : 
				System.out.print("Nhập hệ số a1 = ");
				double a1 = nhap.nextDouble();
				System.out.print("Nhập hệ số b1 = ");
				double b1 = nhap.nextDouble();
				System.out.print("Nhập hệ số c = ");
				double c = nhap.nextDouble();
				if(a1==0) {
					if(b1==0) {
						if(c==0) {
							System.out.println("Phương trình có vô số nghiệm");
						}else {
							System.out.println("Phương trình vô nghiệm");
						}
					}else {
						double x = -c/b1;
						System.out.println("Phương trình trở thành phương trình bậc nhất một ẩn");
						System.out.println("Phương trình có nghiệm là : ");
						System.out.println("x = "+x);
					}
				}else {
					double del = b1*b1-4*a1*c;
					if(del<0) {
						System.out.println("Phương trình vô nghiệm");
					}else if(del==0) {
						double x12 = -b1/(2*a1);
						System.out.println("Phương trình có một nghiệm phân biệt");
						System.out.println("x1 = x2 = "+x12);
					}else {
						double x1 = (-b1-Math.sqrt(del))/(2*a1);
						double x2 = (-b1+Math.sqrt(del))/(2*a1);
						System.out.println("Phương trình có hai nghiệm phân biệt");
						System.out.println("x1 = "+x1);
						System.out.println("x2 = "+x2);
					}
				}
				break;
			case 3 : 
				System.out.print("Nhập số điện đã sử dụng : ");
				int sodien = nhap.nextInt();
				if(sodien<50) {
					int tiendien = sodien*1000;
					System.out.println("Tiền điện là : "+tiendien);
				}else {
					int tiendien = 50*1000+(sodien-50)*1200;
					System.out.println("Tiền điện là : "+tiendien);
				}
				break;
			case 4 : 
				System.out.println("Kết thúc.");
				ma = false;
				break;
			default : 
				System.out.println("Nhập sai. Vui lòng nhập lại!");
			}
		}
		while(ma);{
		
		}

	}

}
