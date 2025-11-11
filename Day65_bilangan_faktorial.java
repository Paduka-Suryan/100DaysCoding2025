import java.util.Scanner;

public class Day65_bilangan_faktorial{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan untuk menghitung faktorial: ");
        int n = input.nextInt();
        
        long faktorial = 1;
        
        // Hitung faktorial
        for(int i = 1; i <= n; i++) {
            faktorial *= i;
        }
        
        System.out.println("= " + faktorial);
        
        input.close();
    }
}