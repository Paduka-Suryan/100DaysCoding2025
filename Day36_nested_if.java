public class Day36_nested_if {
    public static void main (String [] args){
        int a = 7;
        int b = 8;
        int c = 9;

        // Menggunakan nested if
        if (a > b) {
            if (a > c) {
                System.out.println("a adalah yang terbesar");
            } else {
                System.out.println("c adalah yang terbesar");
            }
        } else {
            if (b > c) {
                System.out.println("b adalah yang terbesar");
            } else {
                System.out.println("c adalah yang terbesar");
            }
        }

    }

}
