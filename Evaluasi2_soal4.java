import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Masukkan kecepatan kendaraab (km/jam): ");
		int cepat = sc.nextInt();
		System.out.print("Masukkan batas kecepatan jalan (km/jam): ");
		int batas = sc.nextInt();
		
		if(cepat<40){
		    System.out.println("Terlalu lambat,bisa mengganggu lalu lintas");
		}else if(cepat>=40 && cepat <= batas){
		    System.out.println("Kecepatan normal");
		}else if(cepat>batas && cepat <= batas + 20){
		    System.out.println("Hati-hati, anda melebihi batas!");
		}else if(cepat>batas + 20){
		    System.out.println("Bahaya! anda melaju terlalu cepat!");
		}
	}
}