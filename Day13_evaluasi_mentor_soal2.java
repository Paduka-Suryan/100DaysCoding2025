import java.util.Scanner;

public class Day13_evaluasi_mentor_soal2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nama: ");
        String nama = sc.nextLine();

        System.out.print("Umur: ");
        int umur = sc.nextInt();
        sc.nextLine();

        System.out.print("NIM: ");
        String nim = sc.nextLine();

        System.out.print("Tinggi: ");
        int tinggi = sc.nextInt();
        sc.nextLine();

        System.out.print("Status: ");
        boolean status = sc.nextBoolean();
        sc.nextLine();

        System.out.print("Alamat: ");
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