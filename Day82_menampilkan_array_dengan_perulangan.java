import java.util.Scanner;
public class Day82_menampilkan_array_dengan_perulangan {
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	int angka[] = new int[3];
	for(int data = 0; data < angka.length; data++ ){
	    System.out.print("masukkan nilai: ");
	    angka[data] = in.nextInt();
	}
	System.out.println("Nilai Array: ");
	for(int i = 0; i < angka.length; i++){
	    System.out.print(angka[i]+" ");
	    }
	}
}