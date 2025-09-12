public class Main {
	public static void main(String[] args) {
		
		String i = ("8 bits");
		byte a = -128;
		byte b = 127;
		
		String j = ("16 bits");
		short c = -32768;
		short d = 32767;
		
		String k = ("32 bits");
		int e = -2147483648;
		int f = 2147483647;
		
		String l = ("64 bits");
		long g = -9223372036854775808l;
		long h = 9223372036854775807l;
		
		System.out.println("Byte: \t Size: "+i+"\n\t Range: "+a+" to "+b);
		System.out.println("-----------------------------------------------");
		System.out.println("Short: \t Size: "+j+"\n\t Range: "+c+" to "+d);
		System.out.println("-----------------------------------------------");
		System.out.println("Int: \t Size: "+k+"\n\t Range: "+e+" to "+f);
		System.out.println("-----------------------------------------------");
		System.out.println("Long: \t Size: "+l+"\n\t Range: "+g+" to "+h);
	}
}