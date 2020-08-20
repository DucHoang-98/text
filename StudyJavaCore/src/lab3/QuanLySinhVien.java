package lab3;
import java.util.Scanner;

public class QuanLySinhVien {
	//khởi tạo đối tượng mảng sinh viên
	private SinhVien[] listSinhVien;
	//khởi tạo tổng sinh viên
	private int totalSinhVien;

	public QuanLySinhVien() {
		//gán mảng sv 100 đối tượng.
		listSinhVien = new SinhVien[100];
		//gán tổng sinh viên kích thước tổng sinh viên mặc định bằng 0
		totalSinhVien = 0;
	}
	//Mún add sinh viên vào thì ta phải có 1 đối tượng, ở đây đối tượng đó là sinh viên.
	public void addSinhVien(SinhVien sinhVien) {
		listSinhVien[totalSinhVien] = sinhVien;
		totalSinhVien += 1;
	}
	//Hàm cập nhật sinh viên
	public void editSinhVien(int id) {
		Scanner nhap = new Scanner(System.in);
		//Sử dụng vòng lặp for chạy từ 0 đến giá trị có trong mảng danh sách sinh viên. 
		for(int i=0; i<totalSinhVien; i++) {
			//Nếu id nhập vào = id có trong danh sách mảng ấy thì cho thay đổi tham số.
			if(listSinhVien[i].getId()==id) {
				System.out.print("Tên : ");
				String name = nhap.nextLine();
				listSinhVien[i].setName(name);
				System.out.print("Tuổi : ");
				int age = Integer.parseInt(nhap.nextLine());
				listSinhVien[i].setAge(age);
				System.out.print("Địa chỉ : ");
				String address = nhap.nextLine();
				listSinhVien[i].setAddress(address);
				System.out.print("Điểm trung bình : ");
				double gpa = nhap.nextDouble();
				listSinhVien[i].setGpa(gpa);
				System.out.println("Cập nhật thành công!");
			}else {
				System.out.println("Cập nhật thất bại");
				break;
			}
		}
	}
	//hàm xóa sinh viên
	public void deleteSinhVien(int id) {
		//Duyệt mảng từ 0 đến hết.
		for(int i=0; i<listSinhVien.length; i++) {
			//nếu id nhập vào bằng id trong mảng thì xóa
			if(listSinhVien[i].getId()==id) {
				//cập nhật lại vị trí trong mảng
				for(int j=i; j<listSinhVien.length-1; i++) {
					//gán sinh viên thứ i bằng sinh viên thứ j +1
					listSinhVien[i] = listSinhVien[j+1];
					totalSinhVien --;
					System.out.println("Xóa thành công!");
					return;
				}
			}else {
				System.out.println("ID không tồn tại.");
				break;
			}
		}
	}
	//hàm sắp xếp sinh viên
	public void sortAzByNameStudent() {
		//Cho i chạy từ 0 đến hết giá trị có trong mảng danh sách listSinhvien
		for(int i=0; i < totalSinhVien; i++) {
			//Tiếp tục cho j chạy từ 1 hết giá trị có trong mảng danh sách listSinhvien 
			for(int j=1; j < totalSinhVien; j++) {
				//So sánh 2 chuỗi, ở đây là so sánh tên của các sinh viên
				if(listSinhVien[i].getName().compareTo(listSinhVien[j].getName()) > 0) {
					//Sắp xếp theo từ a --> z
					SinhVien sinhvien = listSinhVien[i];
					listSinhVien[i] = listSinhVien[j];
					listSinhVien[j] = sinhvien;		
				}
				
			}
		}
		System.out.println("Sắp xếp thành công! Danh sách sau khi sắp xếp là : ");
		//Sử dụng vòng lặp for để đếm số phần tử có giá trị trong mảng danh sách rồi in ra các giá trị đó
		 for (int i = 0; i < totalSinhVien; i++) {
			 System.out.println((i + 1) + ". ID : " + listSinhVien[i].getId());
	         System.out.println((i + 2) + ". Tên : " + listSinhVien[i].getName());
	         System.out.println((i + 3) + ". Tuổi : " + listSinhVien[i].getAge());
	         System.out.println((i + 4) + ". Địa chỉ : " + listSinhVien[i].getAddress());
	         System.out.println((i + 5) + ". Điểm trung bình : " + listSinhVien[i].getGpa());
	        }
	}
	//Hàm hiển thị danh sách sinh viên
	public void viewListSinhVien() {
		//Sử dụng vòng lặp for để đếm số phần tử có giá trị trong mảng danh sách rồi in ra các giá trị đó
		for (int i = 0; i < totalSinhVien; i++) {
			System.out.println((i + 1) + ". ID : " + listSinhVien[i].getId());;
			System.out.println((i + 2) + ". Tên : " + listSinhVien[i].getName());
			System.out.println((i + 3) + ". Tuổi : " + listSinhVien[i].getAge());
			System.out.println((i + 4) + ". Địa chỉ : " + listSinhVien[i].getAddress());
			System.out.println((i + 5) + ". Điểm trung bình : " + listSinhVien[i].getGpa());
		}
	}
//Hàm menu chứa các chức năng cần chọn
	public void menu() {
		while(true) {
			Scanner nhap = new Scanner(System.in);
			System.out.println("1. Thêm sinh viên.");
			System.out.println("2. Cập nhật sinh viên theo ID.");
			System.out.println("3. Xóa sinh viên theo ID.");
			System.out.println("4. Sắp xếp sinh viên theo tên.");
			System.out.println("5. Hiển thị danh sách sinh viên");
			System.out.println("0. Kết thúc.");
			System.out.print("Chọn chức năng : ");
			int n = nhap.nextInt();
			switch (n) {
			case 1:
				SinhVien sinhvien = null;
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
					this.addSinhVien(sinhvien);
				}	
				break;
			case 2: System.out.println("Nhập mã sinh viên cần sửa : ");
				int id = Integer.parseInt(nhap.next());
				nhap.nextLine();
				this.editSinhVien(id);
				break;
			case 3:
				System.out.print("Nhập mã sinh viên cần xóa : ");
				id = nhap.nextInt();
				this.deleteSinhVien(id);
				break;
			case 4:
				this.sortAzByNameStudent();
				break;
			case 5:
				this.viewListSinhVien();
				break;
			case 0:
				return;
			}
		} 
	}

	public static void main(String[] args) {
		QuanLySinhVien quanLySinhVien = new QuanLySinhVien();
		quanLySinhVien.menu();

	}
}
