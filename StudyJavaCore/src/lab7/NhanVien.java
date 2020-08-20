package lab7;

import java.util.Scanner;

public class NhanVien {
	private String hoTen;
	private String email;
	private String soDienThoai;
	private String soCMND;
	
	Scanner nhap = new Scanner(System.in);
	
	public NhanVien() {
		
	}
	
	public NhanVien(String hoTen, String email, String soDienThoai, String soCMND) {
		this.hoTen = hoTen;
		this.email = email;
		this.soDienThoai = soDienThoai;
		this.soCMND = soCMND;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	public String getSoCMND() {
		return soCMND;
	}

	public void setSoCMND(String soCMND) {
		this.soCMND = soCMND;
	}
	
	public void nhap() {
		boolean flag = false;
		for(int i = 0; i < 5; i++) {
			do {
				System.out.print("Nhập họ tên: ");
				hoTen = nhap.nextLine();
				try {
					if(!hoTen.matches("[A-Z][a-z]*( [A-Z][a-z]*)+")) {
						throw new Exception("Tên phải có chữ và khoảng trắng");
					}
				}catch(Exception e) {
					flag = true;
					System.out.println(e.getMessage());
				}
			}while(flag); {
				
			}
			
			do {
				System.out.print("Nhập email: ");
				email = nhap.nextLine();
				try {
					if(!email.matches("\\w+@\\w+\\.\\w)+")) {
						throw new Exception("Email phải đúng định dạng");
					}
				}catch(Exception e) {
					flag = true;
					System.out.println(e.getMessage());
				}
			}while(flag); {
				
			}
			
			do {
				System.out.print("Nhập số điện thoại: ");
				soDienThoai = nhap.nextLine();
				try {
					if(!soDienThoai.matches("[0-9]{0-9}")) {
						throw new Exception("Số điện thoại phải đúng định dạng");
					}
				}catch(Exception e) {
					flag = true;
					System.out.println(e.getMessage());
				}
			}while(flag); {
				
			}
			
			do {
				System.out.print("Nhập số điện thoại: ");
				soCMND = nhap.nextLine();
				try {
					if(!soCMND.matches("[0-9]{0-9}")) {
						throw new Exception("Số chứng minh phải đúng định dạng");
					}
				}catch(Exception e) {
					flag = true;
					System.out.println(e.getMessage());
				}
			}while(flag); {
				
			}
		}
		
	}
	
	public void xuat() {
		System.out.println("Họ Tên : " + hoTen);
		System.out.println("Email : " + email);
		System.out.println("Số điện thoại : " + soDienThoai);
		System.out.println("Số CMND : " + soCMND);
	}

}
