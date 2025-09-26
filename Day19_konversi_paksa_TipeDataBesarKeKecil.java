import java.util.Scanner;
public class Day19_konversi_paksa_TipeDataBesarKeKecil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===Konversi Paksa Dari Tipe Data Besar Ke Kecil===");
        System.out.print("Masukkan nilai a (long) = ");
        long a = sc.nextLong();
        byte b = (byte) a; // paksa konversi dari int ke byte
        System.out.println("nilai a = " + a);
        System.out.println("nilai b = " + b);
        sc.close();
    }
    
}
