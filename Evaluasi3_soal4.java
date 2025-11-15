import java.util.Scanner;

public class Day69_soal4evaluasi {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Masukkan ukuran N (persegi): ");
		int n = sc.nextInt();
		
		for(int i = 1 ; i <= n ; i++){
		    for(int j = 1 ; j <= n ; j++){
		        System.out.print("* ");
		    }
		    System.out.println();
		}
	}
}