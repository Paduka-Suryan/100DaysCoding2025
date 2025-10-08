public class Day31_operator_logika_AND {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = 10;

        // Menggunakan operator logika AND (&&)
        System.out.println("a > b && a == c: " + (a > b && a == c)); // true
        System.out.println("a < b && a == c: " + (a < b && a == c)); // false
        System.out.println("a > b && a != c: " + (a > b && a != c)); // false
    }

}
