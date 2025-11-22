public class Day76_methodstringpengecekan {
    public static void main(String[] args) {
        String str1 = "Hello World";
        String str2 = "hello world";
        String str3 = "World";
        String str4 = "";
        
        System.out.println("=== PERBANDINGAN METHOD STRING ===");
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);
        System.out.println("String 3: " + str3);
        System.out.println("String 4: " + str4);
        
        System.out.println("\n=== HASIL PERBANDINGAN ===");
        System.out.println("str1.equals(str2): " + str1.equals(str2));
        System.out.println("str1.equalsIgnoreCase(str2): " + str1.equalsIgnoreCase(str2));
        System.out.println("str1.contains(str3): " + str1.contains(str3));
        System.out.println("str1.isEmpty(): " + str1.isEmpty());
        System.out.println("str4.isEmpty(): " + str4.isEmpty());
    }
}