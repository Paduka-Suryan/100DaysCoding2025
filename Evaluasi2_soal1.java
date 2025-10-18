import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Masukkan nilai Asep: ");
		int asep = sc.nextInt();
		System.out.print("Masukkan nilai Budi: ");
		int budi = sc.nextInt();
		
		if ( asep > budi ){
		    System.out.println("Asep memiliki nilai yg lebih tinggi dari Budi");
		}else{
		    System.out.println("Budi memiliki nilai yg lebih tinggi dari Asep");
		}
	}
}