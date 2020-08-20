package p2;

import p1.A;

public class C {
	A x = new A();
	void method() {
		x.a = 1;
//		x.b = 1;	Lỗi vì protected khác package mà không có kế thừa
//		x.c = 1;    Lỗi vì int c chỉ sử dụng trong cùng package
//		x.d = 1;	Lỗi vì private int d chỉ sử dụng trog class
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
