import java.util.Scanner;
public class Day22_luas_persegi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===Menghitung Luas Persegi===");
        System.out.print("Masukkan panjang sisi persegi: ");
        int sisi = sc.nextInt();
        int luas = sisi * sisi; 
        System.out.println("Luas persegi dengan sisi " + sisi + " adalah: " + luas);
        sc.close();
    
    }
    
}
