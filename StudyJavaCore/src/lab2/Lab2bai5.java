package lab2;

public class Lab2bai5 {

	public static void main(String[] args) {
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=10;j++) {
				System.out.printf("|%2d x %d = %-2d", i, j, i*j);
				//System.out.println();
			}
			System.out.println("");
		}
	}

}
