package lab4;

public class SinhVien {
	//Khai báo các thuộc tính của sinh viên
	private int id;
	private String name;
	private int age;
	private String address;
	private double gpa;
	//Get và set các thuộc tính ấy
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	//Hàm khởi tạo không tham số
	public SinhVien() {
		
	}
	//Hàm khởi tạo có tham số
	public SinhVien(int id, String hoTen, int age, String address, double gpa) {
		this.id = id;
		this.name = hoTen;
		this.age = age;
		this.address = address;
		this.gpa = gpa;
	}
}
