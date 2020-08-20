package lab1;

import java.util.Scanner;

public class AssignmentTask2 {

	public static void main(String[] args) {
		int a,b;
		double c,d;
		Scanner nhap = new Scanner(System.in);
		
		System.out.print("Nhập số nguyên a = ");
		a = nhap.nextInt();
		System.out.print("Nhập số nguyên b = ");
		b = nhap.nextInt();
		System.out.print("Nhập số thực a = ");
		c = nhap.nextDouble();
		System.out.print("Nhập số thực b = ");
		d = nhap.nextDouble();
		//Trả về giá trị tuyệt đối của tham số
		int gt = Math.abs(a);
		//Lấy số nhỏ
		int min = Math.min(a, b);
		//Lấy số lớn
		int max = Math.max(a, b);
		//Tính lũy thừa c^d
		double lt = Math.pow(c, d);
		//tính căn bậc 2
		double cb = Math.sqrt(a);
		//Lấy số nguyên trên của c 
		int nt = (int) Math.ceil(c);
		//Lấy số nguyên dưới của c
		int nd = (int) Math.floor(c);
		//Làm tròn số c
		int lts = (int) Math.round(c);
		//hằng số PI
		double hs = Math.PI/a;
		//Sin của góc đơn vị radian
		double sin = Math.sin(a);
		//Cos của góc đơn vị radian
		double cos = Math.cos(a);
		// Sinh số ngẫu nhiên từ 0 đến 1
		double random = Math.random();
		//Đổi góc radian thành độ 
		double goc = Math.toDegrees(0.5);
		//Đổi góc đơn vị ra radian 
		double dv = Math.toRadians(90);
		//Phương thức này trả về sqrt (a 2 + b 2 ) mà không có tràn hoặc tràn trung gian.
		double hypot = Math.hypot(a, b);
		//Phương thức này trả về logarit cơ số 10 của một giá trị kép.
		double lg10 = Math.log10(a);
		//Phương thức này trả về logarit tự nhiên (base a) của một giá trị kép.
		double lg = Math.log(a);
		//Phương thức này trả về tang lượng giác của một góc.
		double tan = Math.tan(1);
		//Phương thức này trả về giá trị dấu chấm động liền kề với c theo hướng vô cùng dương.
		double nextUp = Math.nextUp(c);
		//Phương thức này trả về logarit tự nhiên của tổng của đối số và 1.
		double lg1 = Math.log1p(c);
		System.out.println("Giá trị tuyệt đối của tham số là : " +gt);
		System.out.println("Lấy số nhỏ là : " +min);
		System.out.println("Lấy số lớn là : " +max);
		System.out.println("Tính lũy thừa là : " +lt);
		System.out.println("Căn bậc 2 là : "+cb);
		System.out.println("Số nguyên trên là : "+nt);
		System.out.println("Số nguyên dưới là : "+nd);
		System.out.println("Làm tròn số là : "+lts);
		System.out.println("Hằng số Pi là : "+hs);
		System.out.println("Sin của góc đơn vị radian là : "+sin);
		System.out.println("Cos của góc đơn vị radian là : "+cos);
		System.out.println("Sinh số ngẫu nhiên từ 0 đến 1 là : "+random);
		System.out.println("Đổi gốc radian thành độ là : "+goc);
		System.out.println("Đổi gốc đơn vị ra radian là : "+dv);
		System.out.println("Trả về sqrt là : "+hypot);
		System.out.println("Trả về lg10 là : "+lg10);
		System.out.println("Trả về lg là : "+lg);
		System.out.println("Trả về tan là : "+tan);
		System.out.println("Trả về giá trị dấu chấm động là : "+nextUp);
		System.out.println("Trả về lg tự nhiên của tổng của đối số và 1 là : "+lg1);	
	}

}
