import java.util.Scanner;
public class Day81_akses_array_dengan_indeks {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		String [] a = {"Paduka","Padulika","Likaaa","Liaaa"};
		
		System.out.print("Masukkan indeks untuk memanggil nama (0-3): ");
		int i = sc.nextInt();
		System.out.println("Namaku: "+ a[i]);
		
	}
}