public class Day54_Keyword_continue {
    public static void main(String[] args) {
        System.out.println("Contoh CONTINUE dalam WHILE:");
        
        int i = 0;
        while(i < 100) {
            i++;
            if(i % 3 == 0) { // skip kelipatan 3
                continue;
            }
            System.out.println("Angka: " + i);
        }
    }
}