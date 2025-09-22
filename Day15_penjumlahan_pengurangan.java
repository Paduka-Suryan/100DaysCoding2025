import java.util.Scanner;
public class Day15_penjumlahan_pengurangan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\n===PENJUMLAHAN DAN PENGURANGAN===\n");
        System.out.print("Masukkan Angka Pertama : ");
        int angka = sc.nextInt();
        System.out.print("Masukkan Angka Kedua : ");
        int angka2 = sc.nextInt();

        System.out.println("Hasil Penjumlahan : "+(angka+angka2));
        System.out.println("Hasil Pengurangan : "+(angka-angka2));

        sc.close();
    }
    
}
