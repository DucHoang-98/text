package lab6;

public class SinhVien {
	// Khai báo các thuộc tính của sinh viên
	private String id;
	private String name;
	private int age;
	private String address;
	private double gpa;

	public SinhVien() {
		
	}

	public SinhVien(String id, String name, int age, String address, double gpa) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
		this.gpa = gpa;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
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
	
	
	public void xuat() {
		System.out.println("Mã sinh viên : " + id);
		System.out.println("Họ và tên : " + name);
		System.out.println("Tuổi : " + age);
		System.out.println("Địa chỉ : " + address);
		System.out.println("Điểm trung bình : " + gpa);
	}
}

