package paduka;

public class Paduka {
    public static void main(String[] args) {
        
        //konstanta adalah variabel yang tidak bisa diubah setelah diberi nilai awal.
        
        final String iniKonstanta = "contoh 1";
        // iniKonstanta = "contoh"; ERROR! Tidak bisa diubah
        
        String iniBukanKonstanta = "contoh 2";
        iniBukanKonstanta = "contoh 2 berhasil diubah";
        
        System.out.println(iniKonstanta+" tidak bisa dubah");
        System.out.println(iniBukanKonstanta);
    }
    
}



