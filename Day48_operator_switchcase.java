import java.util.Scanner;

public class Day48_operator_switchcase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("=== KALKULATOR SEDERHANA ===");
        
        System.out.print("Masukkan angka pertama: ");
        double angka1 = input.nextDouble();
        
        System.out.print("Masukkan operator (+, -, *, /): ");
        char operator = input.next().charAt(0);
        
        System.out.print("Masukkan angka kedua: ");
        double angka2 = input.nextDouble();
        
        double hasil = 0;
        boolean valid = true;
        
        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                break;
            case '-':
                hasil = angka1 - angka2;
                break;
            case '*':
                hasil = angka1 * angka2;
                break;
            case '/':
                if (angka2 != 0) {
                    hasil = angka1 / angka2;
                } else {
                    System.out.println("Error: Tidak bisa dibagi dengan nol!");
                    valid = false;
                }
                break;
            default:
                System.out.println("Operator tidak valid!");
                valid = false;
        }
        
        if (valid) {
            System.out.println("Hasil: " + angka1 + " " + operator + " " + angka2 + " = " + hasil);
        }
        
        input.close();
    }
}