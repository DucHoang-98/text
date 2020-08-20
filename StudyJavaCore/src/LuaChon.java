import java.util.Scanner;

public class LuaChon {
	
	public static void main(String[] args) {
		
		//Khai báo mã nhập đúng
		boolean maNhap = true;
		
		do {
			//Menu của chương trình
			System.out.println("----------Menu----------");
			System.out.println("|                      |");
			System.out.println("| 1. Cộng              |");
			System.out.println("| 2. Trừ               |");
			System.out.println("| 3. Kết thúc          |");
			System.out.println("|                      |");
			System.out.println("------------------------");
			
			Scanner nhap = new Scanner(System.in);
			
			System.out.print(" Mời bạn nhập : ");
			int n = nhap.nextInt();
			
			//Kiểm tra số nhập vào, nếu đúng thì thực hiện chương trình. Sai thì thông báo
			switch(n) {
				case 1 : PhepCong();
					break;
				case 2 : PhepTru();
					break;
				case 3 : System.out.println("Kết thúc");
					System.exit(0);
					break;
				default : System.out.println("Nhập sai, vui lòng nhập lại!");
					break;
			}
			
		}while(maNhap); {
			
		}

	}
	
	//hàm thực hiện phép cộng
	public static void PhepCong() {
		
		Scanner nhap = new Scanner(System.in);
		
		System.out.print("Nhập a = ");
		double a = nhap.nextDouble();
		System.out.print("Nhập b = ");
		double b = nhap.nextDouble();
		
		double c = a + b;
		
		System.out.println("Kết quả a + b = " + c);
	}
	
	//hàm thực hiện phép trừ
	public static void PhepTru() {
		
		Scanner nhap = new Scanner(System.in);
		
		System.out.print("Nhập a = ");
		double a = nhap.nextDouble();
		System.out.print("Nhập b = ");
		double b = nhap.nextDouble();
		
		double c = a - b;
		
		System.out.println("Kết quả a - b = " + c);
	}

}
