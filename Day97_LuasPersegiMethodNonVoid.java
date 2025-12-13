import java.util.Scanner;

public class Main {
	
	static int a (int b){
	    return b * b;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("masukkan sisi persegi: ");
		int sisi = sc.nextInt();
		
		System.out.println("Luas persegi :"+a(sisi));
	}
}