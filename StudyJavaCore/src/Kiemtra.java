
public class Kiemtra {
	
	public static void kiemTraChanLe(int so) {
		if(so % 2 == 0) {
			System.out.println("Số chẵn");
		}else {
			System.out.println("số lẻ");
		}
	}

	public static void main(String[] args) {
		int a = 3;
		System.out.print("a".compareTo("b"));
		System.out.print("b".compareTo("a"));
		System.out.print("a".compareTo("a"));
		kiemTraChanLe(a);

	}

}
