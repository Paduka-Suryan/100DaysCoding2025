import java.util.Scanner;
public class Day24_luas_lingkaran {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===Menghitung Luas Lingkaran===");
        double phi = 3.14;
        System.out.print("Masukkan jari-jari lingkaran: ");
        int jari = sc.nextInt();
        double luas = phi * jari * jari;
        System.out.println("Luas lingkaran dengan jari-jari " + jari + " adalah: " + luas);
        sc.close();
    }
}
