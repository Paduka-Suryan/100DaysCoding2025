public class Day21_menukar_nilai_variabel {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;

        System.out.println("Sebelum ditukar:");
        System.out.println("Nilai a = " + a);
        System.out.println("Nilai b = " + b);
        System.out.println("Nilai c = " + c);
        System.out.println("Nilai d = " + d);

        // Menukar nilai menggunakan variabel sementara
        int tukar = a;
        a = b;
        b = c;
        c = d;
        d = tukar;
        
        System.out.println("Setelah ditukar:");
        System.out.println("Nilai a = " + a);
        System.out.println("Nilai b = " + b);
        System.out.println("Nilai c = " + c);
        System.out.println("Nilai d = " + d);
    }
    
}

