import java.util.Scanner;

public class Day12_bio_data {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== BIO DATA MAHASISWA ===");

        System.out.print("Masukkan Nama: ");
        final String nama = input.nextLine();

        System.out.print("Masukkan NIM: ");
        String nim = input.nextLine();

        System.out.print("Masukkan Umur: ");
        String umur = input.nextLine();

        System.out.print("Masukkan Gender: ");
        String gender = input.nextLine();

        System.out.print("Masukkan Alamat: ");
        String alamat = input.nextLine();

        System.out.print("Masukkan Hobi: ");
        String hobi = input.nextLine();

        System.out.println("\n=== BIODATA ANDA ===");
        System.out.printf("%s%s%n","Nama\t: ", nama);
        System.out.printf("%s%s%n","NIM\t: ", nim);
        System.out.printf("%s%s tahun%n","Umur\t: ", umur);
        System.out.printf("%s%s%n","Gender\t: ", gender);
        System.out.printf("%s%s%n","Alamat\t: ", alamat);
        System.out.printf("%s%s%n","Hobi\t: ", hobi);
        input.close();
        
    }

}

