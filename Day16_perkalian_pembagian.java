import java.util.Scanner;
public class Day16_perkalian_pembagian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\n===PERKALIAN DAN PEMBAGIAN===\n");
        System.out.print("Masukkan Angka Pertama : ");
        double angka = sc.nextDouble();
        System.out.print("Masukkan Angka Kedua : ");
        double angka2 = sc.nextDouble();

        System.out.println((angka)+" x "+(angka2)+" = "+(angka*angka2));
        System.out.println((angka)+" / "+(angka2)+" = "+(angka/angka2));

        sc.close();
    }
    
}
