import java.util.Scanner;
public class Day79_login_akun {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		
		do{
		    System.out.print("Masukkan Username: ");
		    String user = sc.nextLine();
		    System.out.print("Masukkan Password: ");
		    String pw = sc.nextLine();
		    
		    if ( user.equalsIgnoreCase("admin") && pw.equalsIgnoreCase("123")){
		    System.out.println("login berhasil");
		    return;
		}else{
		    System.out.println("login gagal");
		}
		    
		    }while(true);
		
		
	}
}