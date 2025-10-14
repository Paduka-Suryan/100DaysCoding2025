import java.util.Scanner;

public class Day37_menentukan_bilangan_ganjil_genap {
    public static void main (String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan sebuah bilangan: ");
    int number = sc.nextInt();

        // Menentukan bilangan ganjil atau genap
        if (number % 2 == 0) {
            System.out.println(number + " adalah bilangan genap");
        } else {
            System.out.println(number + " adalah bilangan ganjil");
        }

    }

}
