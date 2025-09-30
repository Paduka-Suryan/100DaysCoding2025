import java.util.Scanner;
public class Day23_luas_persegi_panjang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===Menghitung Luas Persegi Panjang===");
        System.out.print("Masukkan panjang : ");
        int panjang = sc.nextInt();
        System.out.print("Masukkan lebar : ");
        int lebar = sc.nextInt();
        int luas = panjang * lebar;
        System.out.println("Luas persegi panjang dengan panjang " + panjang + " dan lebar " + lebar + " adalah: " + luas);
        sc.close();
    }
    
}
