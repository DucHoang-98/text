package lab1;
import java.util.Scanner;

public class Lab1Bai2 {

	public static void main(String[] args) {
		
		Scanner nhap = new Scanner(System.in);
		
		System.out.print("Nhập cạnh thứ nhất : ");
		double canh1 = nhap.nextDouble();
		System.out.print("Nhập cạnh thứ hai : ");
		double canh2 = nhap.nextDouble();
		
		double chuvi = (canh1+canh2)*2;
		double dientich = canh1*canh2;
		double canhMin = Math.min(canh1, canh2);
		
		System.out.println("Chu vi hình chữ nhật là : "+chuvi);
		System.out.println("Diện tích hình chữ nhật là : "+dientich);
		System.out.println("Cạnh nhỏ nhất là : "+canhMin);

	}

}
