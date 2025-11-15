import java.util.Scanner;

public class Day69_soal1evaluasi{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan nilai N: ");
        int n = sc.nextInt();
        
        int t = 0;
        int k = 1;
        System.out.print("Deret 1 ke N: ");
        for(int i = 1 ; i<=n ; i++){
            System.out.print(i+" ");
            t+=i;
            k*=i;
        }
        
        System.out.print("\nDeret N ke 1: ");
        do{
            System.out.print(n+" ");
            n--;
        }while(n>=1);
        
        System.out.print("\nJumlah: "+t);
        System.out.print("\nPerkalian: "+k);
    }
}