package lab4;

import java.util.Scanner;

public class QuanLiSinhVien {
	//Khởi tạo đối tượng mảng danh sách sinh viên
	private SinhVien[] list;
	//Khởi tạo số lượng, kích thước mảng trong danh sách sinh viên
	private int size;
	
	//Hàm khởi tạo không có tham số
	public QuanLiSinhVien() {
		//Khởi tạo số lượng sinh viên chứa trong mảng
		list = new SinhVien[100];
		//Gán số lượng sinh viên có trong mảng. MẶc định bằng 0 vì kiểu nguyên thủy số nguyên.
		//Nên viết ra cũng được mà không viết ra cũng được, ta ngầm hiểu nó.
		//Ở đây viết ra cho dễ nhớ
		size = 0;
	}
	
	//Hàm thêm sinh viên vào mảng
	public void add(SinhVien SinhVien) {
		//Khi thêm một đối tượng sinh viên vào danh sách. Gán luôn sinh viên vào size
		list[size] = SinhVien;
		//Lúc đó kích thước size tăng thêm 1.
		size += 1;
	}
	//Hàm xuất sinh viên. Gọi chung là hiển thị danh sách sinh viên đã lưu trong mảng.
	public void show() {
		//Chạy vòng lặp for từ 0 đến size. Kiểm tra số lượng sinh viên có trong size.
		//Có bao nhiêu đối tượng sinh viên thì hiện bấy nhiêu sinh viên. Không hiện đối tượng null.
		for(int i = 0; i<size; i++) {
			//In ra thông tin sinh viên trong danh sách.
			System.out.println("Id : " + list[i].getId());
			System.out.println("Tên : " + list[i].getName());
			System.out.println("Tuổi : " + list[i].getAge());
			System.out.println("Địa chỉ : " + list[i].getAddress());
			System.out.println("Điểm trung bình : " + list[i].getGpa());
		}
	}
	//Hàm xuất sinh viên có học lực giỏi. Hiển thị những sinh viên có học lực giỏi trong danh sách
	public void showHocLucGioi() {
		//Chạy vòng lặp for từ 0 đến size. Kiểm tra số lượng sinh viên có trong size.
		//Có bao nhiêu đối tượng sinh viên thì hiện bấy nhiêu sinh viên. Không hiện đối tượng null.
		for(int i =0; i<size; i++) {
			//Kiểm tra, nếu điểm GPa>=8 thì in ra danh sách thông tin liên quan đến sinh viên đó.
			if(list[i].getGpa()>=8) {
				//In ra thông tin sinh viên trong danh sách.
				System.out.println("Id : " + list[i].getId());
				System.out.println("Tên : " + list[i].getName());
				System.out.println("Tuổi : " + list[i].getAge());
				System.out.println("Địa chỉ : " + list[i].getAddress());
				System.out.println("Điểm trung bình : " + list[i].getGpa());
			}
		}
	}
	//Hàm sắp xếp sinh viên theo điểm. Giảm dần
	public void sort() {
		//Cho i chạy từ 0 đến hết giá trị có trong mảng danh sách list 
		for(int i=0; i<size; i++) {
			//Tiếp tục cho j chạy từ 1 hết giá trị có trong mảng danh sách list
			for(int j=1; j<size; j++) {
				//So sánh điểm của các đối tượng với nhau. Thuật toán nổi bọt
				if(list[i].getGpa()>list[j-1].getGpa()) {
					SinhVien sinhvien = list[i];
					list[i] = list[j-1];
					list[j-1] = sinhvien;				
				}
			}
		}
	}
	
	//Hàm tạo các chức năng trong 1 menu, chỉ việc gọi chức năng nào thì thực hiện chức năng đó.
	public void menu() {
		while(true) {
			Scanner nhap = new Scanner(System.in);
			
			System.out.println("1. Nhập danh sách sinh viên.");
			System.out.println("2. Xuất thông tin danh sách sinh viên.");
			System.out.println("3. Xuất danh sách sinh viên có học lực giỏi.");
			System.out.println("4. Sắp xếp danh sách sinh viên theo điểm.");
			System.out.println("5. Kết thúc.");
			System.out.print("Nhập chức năng : ");
			int n = Integer.parseInt(nhap.next());
			nhap.nextLine();
			
			switch(n) {
				case 1 : SinhVien sinhvien = null;
				
					System.out.print("Số lượng sinh viên cần nhập : ");
					int soLuong = nhap.nextInt();
					
					for(int i=1; i<=soLuong; i++) {
						
						sinhvien = new SinhVien();
						
						System.out.print("Nhập mã sinh viên : ");
						int id = Integer.parseInt(nhap.next());
						nhap.nextLine();
						sinhvien.setId(id);
						System.out.print("Nhập tên sinh viên : ");
						String name = nhap.nextLine();
						sinhvien.setName(name);
						System.out.print("Nhập tuổi sinh viên : ");
						int age = Integer.parseInt(nhap.nextLine());
						sinhvien.setAge(age);
						System.out.print("Nhập địa chỉ : ");
						String address = nhap.nextLine();
						sinhvien.setAddress(address);
						System.out.print("Nhập điểm trung bình : ");
						double gpa = nhap.nextDouble();
						sinhvien.setGpa(gpa);
						
						this.add(sinhvien);
					}
					break;
				case 2 : this.show();
					break;
				case 3 : this.showHocLucGioi();
					break;
				case 4 : this.sort();
					System.out.println("Sắp xếp thành công! Danh sách sinh viên sau khi sắp xếp là : ");
					//Chạy vòng lặp for từ 0 đến size. Kiểm tra số lượng sinh viên có trong size.
					//Có bao nhiêu đối tượng sinh viên thì hiện bấy nhiêu sinh viên. Không hiện đối tượng null.
					for(int i=0; i<size; i++) {
						//In ra thông tin sinh viên trong danh sách.
						System.out.println("Id : " + list[i].getId());
						System.out.println("Tên : " + list[i].getName());
						System.out.println("Tuổi : " + list[i].getAge());
						System.out.println("Địa chỉ : " + list[i].getAddress());
						System.out.println("Điểm trung bình : " + list[i].getGpa());
				}
					break;
				case 5 : System.out.println("Kết thúc");
					return ;
			}
		}
	}
}
