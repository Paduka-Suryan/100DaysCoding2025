import java.util.Scanner;

public class Day70_persegi_panjang {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Masukkan ukuran N (persegi): ");
		int a = sc.nextInt();
		
		for ( int i = 1 ; i <= a /2 ; i++){
		    for ( int j = 1 ; j <= a ; j++){
		        if ( i == 1 || i == a /2|| j == 1 || j == a ){
		            System.out.print("* ");
		        } else {
		            System.out.print("  ");
		        }
		    }
		    System.out.println();
		}
	}
}