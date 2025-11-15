import java.util.Scanner;

public class Day69_soal2evaluasi{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai N: ");
        int N = sc.nextInt();

        int i = 1; 
        int totalGanjil = 0;
        int jumlahGanjil = 0;
        int totalGenap = 0;
        int jumlahGenap = 0;

        while (i <= N) {
            if (i % 2 == 1) { 
                jumlahGanjil++;
                totalGanjil += i;
            } else {
                jumlahGenap++;
                totalGenap += i;
            }
            i++;
        }

        System.out.println("Total angka ganjil : " + jumlahGanjil);
        System.out.println("Jumlah nilai ganjil : " + totalGanjil);

        System.out.println("Total angka genap : " + jumlahGenap);
        System.out.println("Jumlah nilai genap : " + totalGenap);
    }
}