import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Apakah anda member? (true/false): ");
		boolean member = sc.nextBoolean();
		System.out.print("Masukkan total belanja (Rp): ");
		int belanja = sc.nextInt();
		
		if ( member == true && belanja>500000){
		    System.out.println("anda mendapat diskon 25%");
		}else if( member == true || belanja>500000){
		    System.out.println("anda mendapat diskon 10%");
		}else{
		    System.out.println("anda tidak mendapat diskon");
		}
	}
}