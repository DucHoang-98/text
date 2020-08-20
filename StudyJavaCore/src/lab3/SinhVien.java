package lab3;
import java.util.Scanner;

public class SinhVien {
	// Khai báo các thuộc tính của sinh viên
	private int Id;
	private String Name;
	private int Age;
	private String Address;
	private double Gpa;

	public SinhVien() {
	}

	public SinhVien(int id, String name, int age, String address, double gpa) {
		Id = id;
		Name = name;
		Age = age;
		Address = address;
		Gpa = gpa;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public double getGpa() {
		return Gpa;
	}

	public void setGpa(double gpa) {
		Gpa = gpa;
	}

}
