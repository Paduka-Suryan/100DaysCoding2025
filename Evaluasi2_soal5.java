import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int mangga = 12000;
		int alpukat = 15000;
		int jeruk = 10000;
		int americano = 12000;
		int kapalapi = 10000;
		int hytam = 5000;
		
		System.out.print("=== ISC Cafe ===");
		System.out.println("\n1. Kopi" + 
		                   "\n2. Jus" + 
		                   "\n3. Keluar");
		System.out.print("Pilih kategori (1-3): ");
		byte kategori = sc.nextByte();
		
		if (kategori == 1){
		    System.out.println("\n=== Menu Kopi ===" + 
		                       "\n1. Americano (Rp12.000)" + 
		                       "\n2. Kapal Api (Rp10.000)" + 
		                       "\n3. Kopi Hytam (Rp5.000)");
		System.out.print("Pilih menu (1-3): ");
		byte menu1 = sc.nextByte();
		System.out.print("\nMasukkan jumlah pesanan: ");
		byte jumlah = sc.nextByte();
		
		if (menu1 == 1){
		    System.out.println("\nAnda memesan "+jumlah+" Americano");
		    System.out.println("Total bayar Rp"+jumlah*americano);
		}else if (menu1 == 2){
		    System.out.println("\nAnda memesan "+jumlah+" Kapal Api");
		    System.out.println("Total bayar Rp"+jumlah*kapalapi);
		}else if (menu1 == 3){
		    System.out.println("\nAnda memesan "+jumlah+" Kopi Hytam");
		    System.out.println("Total bayar Rp"+jumlah*hytam);
		}else{
		    System.out.println("\nAngka yang anda masukkan tidak valid");
		}
		
		System.out.println("\nPilih metode pembayaran: " + 
		                   "\n1. Cash" + 
		                   "\n2. QRIS");
		System.out.print("Masukkan pilihan (1-2): ");
		byte bayar = sc.nextByte();
		
		if ( bayar == 1){
		    System.out.println("Pembayaran dengan Cash. Silahkan bayar di kasir");
		}else if ( bayar == 2){
		    System.out.println("\nPembayaran dengan QRIS. Silahkan scan QR");
		}else{
		    System.out.println("\nAngka yang anda masukkan tidak valid");
		}
		
		}else if(kategori == 2){
		    System.out.println("\n=== Menu Jus ===" + 
		                       "\n1. Jus Mangga (Rp12.000)" + 
		                       "\n2. Jus Alpukat (Rp15.000)" + 
		                       "\n3. Jus Jeruk (Rp10.000)");
		System.out.print("Pilih menu (1-3): ");
		byte menu = sc.nextByte();
		System.out.print("\nMasukkan jumlah pesanan: ");
		byte jumlah = sc.nextByte();
		
		if ( menu == 1 ){
		    System.out.println("\nAnda memesan "+jumlah+" mangga");
		    System.out.println("Total bayar Rp"+jumlah*mangga);
		}else if (menu == 2){
		    System.out.println("\nAnda memesan "+jumlah+" alpukat");
		    System.out.println("Total bayar Rp"+jumlah*alpukat);
		}else if(menu == 3){
		    System.out.println("\nAnda memesan "+jumlah+" jeruk");
		    System.out.println("Total bayar Rp"+jumlah*jeruk);
		}else{
		    System.out.println("\nAngka yang anda masukkan tidak valid");
		}
		
		System.out.println("\nPilih metode pembayaran: " + 
		                   "\n1. Cash" + 
		                   "\n2. QRIS");
		System.out.print("Masukkan pilihan (1-2): ");
		byte bayar = sc.nextByte();
		
		if ( bayar == 1){
		    System.out.println("Pembayaran dengan Cash. Silahkan bayar di kasir");
		}else if(bayar == 2){
		    System.out.println("\nPembayaran dengan QRIS. Silahkan scan QR");
		}else{
		    System.out.println("\nAngka yang anda masukkan tidak valid");
		}
		    
		}else if(kategori == 3){
		    System.out.println("\nDadahh");
		
		}else{
		    System.out.println("\nAngka yang anda masukkan tidak valid");
		}
		
		System.out.println("\n=== Terima kasih telah berbelanja di ISC Cafe! ===");
	}
}
