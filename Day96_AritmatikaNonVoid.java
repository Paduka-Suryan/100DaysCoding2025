import java.util.Scanner;

public class Main {
	
	static int tambah ( int a, int b ){
	    return a + b;
	}	
	static int kurang ( int a, int b ){
	    return a - b;
	}	
	static int kali ( int a, int b ){
	    return a * b;
	}	
	static double bagi ( int a, int b ){
	    return (double) a / b;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.print("Masukkan angka pertama: ");
		int x = sc.nextInt();
		System.out.print("Masukkan angka kedua: ");
		int y = sc.nextInt();
		
		int tambahan = tambah (x,y);
		int kurangan = kurang (x,y);
		int kalian = kali (x,y);
		double bagian = bagi (x,y);
		
		System.out.println("===================================");
		System.out.println("Hasil penjumlahan: "+tambahan);
		System.out.println("Hasil pengurangan: "+kurangan);
		System.out.println("Hasil perkalian: "+kalian);
		System.out.println("Hasil pembagian: "+bagian);
		
	}
}