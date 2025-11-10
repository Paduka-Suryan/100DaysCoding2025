import java.util.Scanner;

public class Da64_mencetak_hasil_M_pangkat_N {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan (M): ");
        int M = input.nextInt();
        
        System.out.print("Masukkan pangkat (N): ");
        int N = input.nextInt();
        
        long hasil = 1;
        
        for(int i = 1; i <= N; i++) {
            hasil *= M; // hasil = hasil * M
        }
        
        System.out.println(M + " pangkat " + N + " = " + hasil);
        
        input.close();
    }
}