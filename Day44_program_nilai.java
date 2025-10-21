public class Day44_program_nilai {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner (System.in);
		
		System.out.print("Masukkan nilai: ");
		byte a = sc.nextByte();
		
		if (a <= 100){
		    System.out.println("Nilai A");
		}else if(a <= 70){
		    System.out.println("Nilai B");
		}else if(a <= 50){
		    System.out.println("Nilai C");
		}else if(a <= 30){
		    System.out.println("Nilai D");
		}else if(a >=100){
		    System.out.println("Nilai yg dimasukkan tidak masuk akal!!");
		}
	}
}