public class Day26_operator_penugasan {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // Penugasan sederhana
        a += b; // a = a + b
        System.out.println("Hasil a += b: " + a); // Output: 15

        // Penugasan pengurangan
        a -= b; // a = a - b
        System.out.println("Hasil a -= b: " + a); // Output: 10

        // Penugasan perkalian
        a *= b; // a = a * b
        System.out.println("Hasil a *= b: " + a); // Output: 50

        // Penugasan pembagian
        a /= b; // a = a / b
        System.out.println("Hasil a /= b: " + a); // Output: 10

        // Penugasan modulus
        a %= b; // a = a % b
        System.out.println("Hasil a %= b: " + a); // Output: 0
    }

}

