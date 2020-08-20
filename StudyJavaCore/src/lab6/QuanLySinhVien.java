package lab6;

import java.util.Scanner;

public class QuanLySinhVien {

	private SinhVien[] list;
	private int size;

	Scanner nhap = new Scanner(System.in);

	public QuanLySinhVien() {
		//Khởi tạo mảng 100 sinh viên
		list = new SinhVien[100];
		//Mặc định size = 0 vì là kiểu nguyên thủy int = 0;
		size = 0;
	}

	public void themSinhVien(SinhVien sinhVien) {
		list[size++] = sinhVien;
	}

	public void capNhapSinhVienTheoId(String id) {
		SinhVien sinhVien = timSinhVienTheoId(id);
		if (sinhVien != null) {
			System.out.print("Nhập ID mới: ");
			String reID = nhap.nextLine();
			sinhVien.setId(reID);
			System.out.print("Nhập tên mới: ");
			String reName = nhap.nextLine();
			sinhVien.setName(reName);
			System.out.print("Nhập tuổi mới: ");
			int reAge = Integer.parseInt(nhap.nextLine());
			sinhVien.setAge(reAge);
			System.out.print("Nhập địa chỉ mới: ");
			String reAddress = nhap.nextLine();
			sinhVien.setAddress(reAddress);
			System.out.print("Nhập điểm trung bình mới: ");
			double reGpa = Double.parseDouble(nhap.nextLine());
			sinhVien.setGpa(reGpa);
		} else {
			System.out.println("~~~Khong ton tai sinh vien voi id la " + id + "~~~");
		}
	}

	public void xoaSinhVienTheoId(String id) {
		if (timSinhVienTheoId(id) != null) {
			//Tình huống sinh viên năm ở cuối mảng
			if (list[size - 1].getId().equals(id)) {
				list[size - 1] = null;
				size -= 1;
			} else {
				for (int i = 0; i < size - 1; i++) {
					if (list[i].getId().equals(id)) {
						for (int j = i; j < size - 1; j++) {
							list[j] = list[j + 1];
						}
						list[size--] = null;
					}
				}
			}
		} else {
			System.out.println("~~~Khong ton tai sinh vien voi id la " + id + "~~~");
		}
	}

	public void sapXepDanhSachSinhVien() {
		SinhVien sinhVien;
		for (int i = 0; i < size - 1; i++) {
			for (int j = 0; j < size - 1 - i; j++) {
				if (list[j].getName().compareTo(list[j + 1].getName()) > 0) {
					sinhVien = list[j];
					list[j] = list[j + 1];
					list[j + 1] = sinhVien;
				}
			}
		}
	}

	public SinhVien timSinhVienTheoId(String id) {
		for (int i = 0; i < size; i++) {
			if (list[i].getId().equals(id)) {
				return list[i];
			}
		}

		return null;
	}

	public void hienThiSinhVien(SinhVien sinhVien) {
		System.out.println("id : " + sinhVien.getId() + " - name : " + sinhVien.getName() + " -  age : "
				+ sinhVien.getAge() + " - address : " + sinhVien.getAddress() + " - gpa : " + sinhVien.getGpa());
	}

	public void hienThiDanhSachSinhVien() {
		if (size != 0) {
			for (int i = 0; i < size; i++) {
				hienThiSinhVien(list[i]);
			}
		} else {
			System.out.println("Danh sách rỗng");
		}
	}

	public void menu() {
		SinhVien sinhVien;
		String name;
		String id;
		String age;
		String address;
		String gpa;
		int reAge = 0;
		double reGpa = 0;
		boolean flgCheckTen = false;
		boolean flgCheckId = false;
		boolean flgCheckAge = false;
		boolean flgCheckGpa = false;
		while (true) {
			System.out.println("1. Thêm sinh viên.");
			System.out.println("2. Cập nhật sinh viên theo ID.");
			System.out.println("3. Xóa sinh viên theo ID.");
			System.out.println("4. Sắp xếp sinh viên theo tên.");
			System.out.println("5. Hiển thị danh sách sinh viên");
			System.out.println("0. Kết thúc.");
			System.out.print("Chọn chức năng : ");
			String n = nhap.nextLine();
			
			switch (n) {
			case "1" :
				sinhVien = new SinhVien();
				do {
					System.out.print("Nhập ID: ");
					id = nhap.nextLine();
					try {
						if (timSinhVienTheoId(id) != null) {
							throw new Exception("Nhập sai! Nhập lại");
						}
						break;
					} catch (Exception e) {
						flgCheckId = true;
						System.out.println(e.getMessage());
					}
				} while (flgCheckId);
				sinhVien.setId(id);

				do {
					System.out.print("Nhập tên sinh viên: ");
					name = nhap.nextLine();
					try {
						if ("".equals(name)) {
							throw new Exception("Tên không được rỗng");
						}
						if (!name.matches("[A-Z][a-z]*( [A-Z][a-z]*)+")) {
							throw new Exception("Tên phải có chữ và khoảng trắng");
						}
						break;
					} catch (Exception e) {
						flgCheckTen = true;
						System.out.println(e.getMessage());
					}
				} while (flgCheckTen);
				sinhVien.setName(name);

				do {
					System.out.print("Nhập tuổi: ");
					age = nhap.nextLine();
					try {
						if (!age.matches("\\d{1,3}")) {
							throw new Exception("Tuổi phải là một số");
						}
						reAge = Integer.parseInt(age);
						if (reAge < 0 || reAge >= 100) {
							throw new Exception("Tuổi phải từ 0->100;");
						}
						break;
					} catch (Exception e) {
						flgCheckAge = true;
						System.out.println(e.getMessage());
					}
				} while (flgCheckAge);
				sinhVien.setAge(reAge);

				System.out.print("Nhập địa chỉ: ");
				address = nhap.nextLine();
				sinhVien.setAddress(address);

				do {
					System.out.print("Nhập điểm trung bình: ");
					gpa = nhap.nextLine();
					try {
						if (!gpa.matches("\\d{1,2}(\\.\\d{1,2})?")) {
							throw new Exception("Điểm phải là một số");
						}
						reGpa = Double.parseDouble(gpa);
						if (reGpa <= 0 || reGpa >= 10) {
							throw new Exception("Điểm phải >=0 và <=10");
						}
						break;
					} catch (Exception e) {
						flgCheckGpa = true;
						System.out.println(e.getMessage());
					}
				} while (flgCheckGpa);
				sinhVien.setGpa(reGpa);

				themSinhVien(sinhVien);
				break;
			case "2":
				System.out.print("Nhập ID cần sửa: ");
				id = nhap.nextLine();
				capNhapSinhVienTheoId(id);
				break;
			case "3":
				System.out.print("Nhập ID sinh viên cần xóa: ");
				id = nhap.nextLine();
				xoaSinhVienTheoId(id);
				break;
			case "4":
				sapXepDanhSachSinhVien();
				System.out.println("Danh sách sinh viên sau khi sắp xếp là");
				hienThiDanhSachSinhVien();
				break;
			case "5":
				hienThiDanhSachSinhVien();
				break;
			case "0":
				System.out.println("Kết thúc");
				nhap.close();
				System.exit(0);
				break;
			default:
				System.out.println("Menu không tồn tại");
			}
		}
	}

}