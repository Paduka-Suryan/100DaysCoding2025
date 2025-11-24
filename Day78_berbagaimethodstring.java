public class Day78_berbagaimethodstring {
    public static void main(String[] args) {
        String text = "   Onic Paduka! All For ONIC   ";
        
        System.out.println("Original: '" + text + "'");
        
        // Method Dasar
        System.out.println("length(): " + text.length());
        System.out.println("toUpperCase(): '" + text.toUpperCase() + "'");
        System.out.println("toLowerCase(): '" + text.toLowerCase() + "'");
        
        // Method Manipulasi
        System.out.println("trim(): '" + text.trim() + "'");
        System.out.println("substring(6, 18): '" + text.substring(6, 18) + "'");
        System.out.println("replace('Onic', 'LORD'): '" + text.replace("Onic", "LORD") + "'");
        
        // Method Pencarian
        System.out.println("contains('RRQ'): " + text.contains("RRQ"));
        
        // Method Perbandingan
        System.out.println("equals('For'): " + text.equals("ONIC"));
        System.out.println("equalsIgnoreCase('onic'): " + text.equalsIgnoreCase("onic"));
        
        // Gabungkan beberapa method
        String result = text.trim()
                           .toLowerCase()
                           .replace("Paduka", "Liaaa")
                           .substring(0, 15);
        
        System.out.println("Combined methods: '" + result + "'");
    }
}