package lab1;
import java.util.Scanner;

public class Lab1Bai3 {

	public static void main(String[] args) {
		
		Scanner nhap = new Scanner(System.in);
		System.out.print("Nhập cạnh của khối lập phương : ");
		double canh = nhap.nextDouble();
		
		double thetich = canh*canh*canh;
		
		System.out.println("Thể tích khối lập phương là : "+thetich);

	}

}
