public class Day85_CariAngkaMaksimalArray {
    public static void main(String[] args) {
        
        int[] angka = {45, 23, 67, 12, 89, 34, 56};
        
        int minimal = angka[0];
        
        for(int i = 1; i < angka.length; i++) {
            if(angka[i] < minimal) {
                minimal = angka[i];
            }
        }
        
        System.out.println("Angka terkecil: " + minimal);
    }
}