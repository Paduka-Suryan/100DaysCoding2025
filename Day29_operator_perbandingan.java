package paduka;
import java.util.Scanner;
public class Day29_operator_perbandingan{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan tinggi Arul : ");
        int a = in.nextInt();
        System.out.print("Masukkan tinggi Jeff : ");
        int b = in.nextInt();
        
        boolean c = a>b;
        System.out.printf("\nTinggi Arul %d %s",a,"cm");
        System.out.printf("\nTinggi Jefri %d %s\n",b,"cm");
        System.out.println("\nApakah Arul lebih tinggi daripada Jefri?? : "+c);
    }
    
}