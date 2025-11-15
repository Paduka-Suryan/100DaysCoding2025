import java.util.Scanner;

public class Day69_soal3evaluasi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai N: ");
        int N = sc.nextInt();

        long faktorial = 1;
        int i = 1;

        while (i <= N) {
            faktorial = faktorial * i;
            i++;
        }

        long temp = faktorial;
        int jumlahDigit = 0;

        while (temp > 0) {
            jumlahDigit++;
            temp = temp / 10;
        }

        System.out.println("Hasil faktorial (" + N + "!): " + faktorial);
        System.out.println("Jumlah digit: " + jumlahDigit);
    }
}
