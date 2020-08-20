package lab2;
//import java.util.Scanner;
//
//public class Lab2Bai6 {
//
//	static int size = 3;
//	public static void main(String[] args) {
//		
//		String[] HoTen ;
//		double[] Diem ;
//		Scanner nhap = new Scanner(System.in);
//		System.out.println("Nhập số lượng sinh viên : ");
//		int n = Integer.parseInt(nhap.nextLine());
//		for(int i=0;i<n;i++) {
//			System.out.print("Nhập họ tên sinh viên : ");
//			HoTen[i] = nhap.nextLine();
//			System.out.print("Nhập điểm của sinh viên : ");
//			Diem[i] = nhap.nextDouble();
//			if(Diem[i]<5) {
//				System.out.println("Sinh viên : " + HoTen);
//				System.out.println("Đạt học sinh Yếu.");
//			}else if(Diem[i]>=5&&Diem[i]<6.5) {
//				System.out.println("Sinh viên : " + HoTen);
//				System.out.println("Đạt học sinh Trung bình.");
//			}else if(Diem[i]>=6.5&&Diem[i]<7.5) {
//				System.out.println("Sinh viên : " + HoTen);
//				System.out.println("Đạt học sinh Khá.");
//			}else if(Diem[i]>=7.5&&Diem[i]<9) {
//				System.out.println("Sinh viên : " + HoTen);
//				System.out.println("Đạt học sinh Giỏi.");
//			}else {
//				System.out.println("Sinh viên : " + HoTen);
//				System.out.println("Đạt học sinh Xuất sắc.");		
//			}
//		}
////		//Sắp xếp tăng dần
////		for(int i = 0; i < 3; i ++){
////            for(int j = i + 1; j < 3 ; j ++){
////                if(HoTen[i] > HoTen[j]){
////                    SinhVien temp = new SinhVien();
////                    temp = HoTen[i];
////                    HoTen[i] = HoTen[j];
////                    HoTen[j] = temp;
////                }
////            }
////        }
////        System.out.println("Thông tin sinh viên sau khi sắp xếp là : ");
////        for(int i = 0; i < 3; i ++){
////        	System.out.println("Mã số sinh viên là : " + HoTen[i].getId());
////            System.out.println("Họ tên của sinh viên là : " + HoTen[i].getHoTen());
////            System.out.println("Điểm của sinh viên là : " + HoTen[i].getDiem());
////        }
//	}
//
//}