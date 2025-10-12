import java.util.Scanner;

public class main {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukkan nilai : ");
        int nilai = sc.nextInt();
        
        if (nilai >= 70){
                System.out.print("Selamat, anda lulus");
            }else {
                System.out.print("Maaf, anda blum lulus");
            }
    }
}
