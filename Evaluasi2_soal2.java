import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Masukkan daya listrik (watt): ");
		int daya = sc.nextInt();
		
		if (!(daya <= 2200)){
		    System.out.println("Status : Daya Tidak Aman");
		}else{
		    System.out.println("Status : Daya Aman");
		}
	}
}