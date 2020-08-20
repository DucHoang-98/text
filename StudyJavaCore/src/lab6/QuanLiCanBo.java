package lab6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class QuanLiCanBo {
	ArrayList<CanBo> list = new ArrayList<CanBo>(); 
	Scanner nhap = new Scanner(System.in);
	
	public void menu() {
		String hoTen = null;
		String trinhDo = null;
		int phuCap;
		int soTietDay;
		double heSoLuong;
		String phongBan;
		double soNgayCong;
		String chucVu;
		boolean flgCheckTen = false;
		boolean flgCheckTrinhDo = false;
		boolean flgCheckChucVu = false;
		while(true) {
			System.out.println("1. Nhập thông tin danh sách cán bộ trong trường.");
			System.out.println("2. Xuất danh sách cán bộ.");
			System.out.println("3. Tổng số lương trường phải trả cho cán bộ.");
			System.out.println("4. Sắp xếp cán bột theo lương, nếu lương bằng thì sắp xếp theo tên.");
			System.out.println("5. Kết thúc.");
			System.out.print("Chọn chức năng : ");
			String num = nhap.nextLine();
			
			switch(num) {
				case "1" : 
					System.out.println("1. Giảng viên. -- 2. Nhân viên.");
					System.out.print("Chọn : ");
					String number = nhap.nextLine();
					CanBo cb = null;
					if("1".equals(number)) {
						System.out.print("Số lượng giảng viên cần nhập : ");
						int n = Integer.parseInt(nhap.nextLine());
						for(int i = 0; i<n; i++) {
							do {
								System.out.print("Nhập họ tên: ");
								hoTen = nhap.nextLine();
								try {
									if ("".equals(hoTen)) {
										throw new Exception("Tên không được rỗng");
									}
									int name = hoTen.indexOf(hoTen);
									if (name > 40) {
										throw new Exception("Tên phải có chữ và khoảng trắng");
									}
									break;
								} catch (Exception e) {
									flgCheckTen = true;
									System.out.println(e.getMessage());
								}
							} while (flgCheckTen);
							
							do {
								System.out.print("Nhập trình độ: ");
								trinhDo = nhap.nextLine();
								try {
									if ("Tiến sĩ".compareTo(trinhDo) > 0 || "Thạc sĩ".compareTo(trinhDo) > 0 ||"Cử nhân".compareTo(trinhDo) > 0) {
										throw new Exception("Nhập trình độ phải chính xác!");
									}
									break;
								} catch (Exception e) {
									flgCheckTrinhDo = true;
									System.out.println(e.getMessage());
								}
							} while (flgCheckTrinhDo);
							
							System.out.print("Số tiết dạy : ");
							soTietDay = Integer.parseInt(nhap.nextLine());
							System.out.print("Hệ số lương : ");
							heSoLuong = Double.parseDouble(nhap.nextLine());
							
							cb = new GiangVien(hoTen,trinhDo,0,soTietDay,heSoLuong);
							list.add(cb);
						}
					}else if("2".equals(num)) {
						System.out.print("Số lượng nhân viên cần nhập : ");
						int n = Integer.parseInt(nhap.nextLine());
						for(int i = 0; i<n; i++) {
							do {
								System.out.print("Nhập họ tên: ");
								hoTen = nhap.nextLine();
								try {
									if ("".equals(hoTen)) {
										throw new Exception("Tên không được rỗng");
									}
									int name = hoTen.indexOf(hoTen);
									if (name > 40) {
										throw new Exception("Tên phải có chữ và khoảng trắng");
									}
									break;
								} catch (Exception e) {
									flgCheckTen = true;
									System.out.println(e.getMessage());
								}
							} while (flgCheckTen);
							
							System.out.print("Phòng ban : ");
							phongBan = nhap.nextLine();
							System.out.print("Số ngày công : ");
							soNgayCong = Integer.parseInt(nhap.nextLine());
							
							do {
								System.out.print("Nhập chức vụ: ");
								chucVu = nhap.nextLine();
								try {
									if ("Tiến sĩ".compareTo(chucVu) > 0 || "Thạc sĩ".compareTo(chucVu) > 0 ||"Cử nhân".compareTo(chucVu) > 0) {
										throw new Exception("Nhập chức vụ phải chính xác!");
									}
									break;
								} catch (Exception e) {
									flgCheckChucVu  = true;
									System.out.println(e.getMessage());
								}
							} while (flgCheckChucVu );
							
							System.out.print("Hệ số lương : ");
							heSoLuong = Double.parseDouble(nhap.nextLine());
							
							cb = new NhanVien(hoTen,phongBan,soNgayCong,heSoLuong,0,chucVu);
							list.add(cb);
						}
					}else {
						System.out.println("Nhập sai!");
					}
					break;
				case "2" : this.xuat();
					break;
				case "3" : this.tongTienLuong();
					break;
				case "4" : this.sort();
					break;
				case "5" : System.out.println("Kết thúc!");
					return;
			}
		}
	}
	
	public void xuat() {
		for(int i = 0; i < list.size() ;i++) {
			list.get(i).xuat();
		}
	}
	
	public void tongTienLuong() {
		double sum = 0;
			for(int i = 0; i < list.size(); i++) {
				sum = sum + list.get(i).tienLuong();
				System.out.println("Tổng tiền lương là : " + sum);
				
		}
	}
	public void sort() {
		Collections.sort(list, new Comparator<CanBo>() {
			@Override
			public int compare(CanBo cb1, CanBo cb2) {
				if(cb1.tienLuong()>cb2.tienLuong()) {
					return 1;
				}else {
					if(cb1.tienLuong()==cb2.tienLuong()) {
						if(cb1.getHoTen().compareToIgnoreCase(cb2.getHoTen()) > 0 ) {
							return 1;
						}else if(cb1.getHoTen().compareToIgnoreCase(cb2.getHoTen()) < 0){
							return -1;
						}
						return 0;
					}else {
						return -1;
					}
				}
			}
			
		});
		for(int i=0;i<list.size();i++) {
			list.get(i).xuat();
		}
	}
}
