import java.util.Scanner;
public class Day18_konversi_otomatis_DariTipeDataKecilKeBesar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===Konversi Otomatis Dari Tipe Data Kecil Ke Besar===");    
        System.out.print("Masukkan nilai a (byte) = ");
        byte a = sc.nextByte();
        short b = a; // otomatis konversi dari int ke double    
        System.out.println("nilai a = "+a);
        System.out.println("nilai b = "+b);
        sc.close();
    }
    
}
