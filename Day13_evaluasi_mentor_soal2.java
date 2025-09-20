import java.util.Scanner;

public class Day13_evaluasi_mentor_soal2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nama: ");
        String nama = sc.nextLine();

        System.out.print("\nUmur: ");
        int umur = sc.nextInt();


        System.out.print("\nNIM: ");
        String nim = sc.nextLine();

        System.out.print("\nTinggi: ");
        int tinggi = sc.nextInt();


        System.out.print("\nStatus: ");
        boolean status = sc.nextBoolean();

        System.out.print("\nMasukkan alamat");
        String alamat = sc.nextLine();


        System.out.print("\n==============BIODATA=============");
        System.out.print("\nNama\t\t: \t"+nama);
        System.out.print("\nUmur\t\t: \t"+umur);
        System.out.print("\nNIM\t\t: \t"+nim);
        System.out.print("\nTinggi\t\t: \t"+tinggi);
        System.out.print("\nStatus\t\t: \t"+status);
        System.out.print("\nAlamat\t\t: \t"+alamat);
        System.out.print("\n==================================");


        
    }
    
}