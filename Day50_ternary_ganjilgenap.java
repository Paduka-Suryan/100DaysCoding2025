import java.util.Scanner;

public class Day50_ternary_ganjilgenap {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("masukkan angka: ");
        int angka1 = sc.nextInt();
        
        String hasil = (angka1 % 2 == 0) ? "Genap" : "Ganjil";
        System.out.println(angka1 + " adalah " + hasil);
        
    }
}