import java.util.Scanner;

public class Day49_ternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("masukkan angka: ");
        int angka1 = sc.nextInt();
        
        // Cek genap atau ganjil
        String hasil = (angka1 % 2 == 0) ? "Genap" : "Ganjil";
        System.out.println(angka1 + " adalah " + hasil);
        
        // Cek positif atau negatif
        System.out.print("\nMasukkan angka: ");
        int angka2 = sc.nextInt();
        String status = (angka2 >= 0) ? "Positif" : "Negatif";
        System.out.println(angka2 + " adalah " + status);
    }
}