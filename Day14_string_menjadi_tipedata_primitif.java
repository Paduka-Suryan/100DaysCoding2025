public class Day14_string_menjadi_tipedata_primitif {
    public static void main(String[] args) {
        
        //string ke integer
        String strInt = "12345";
        int a = Integer.parseInt(strInt);
        System.out.println("String berubah menjadi integer: " + a);

        //string ke double
        String strDouble = "123.45";
        double b = Double.parseDouble(strDouble);
        System.out.println("String berubah menjadi double: " + b);

        //string ke boolean
        String strBoolean = "true";
        boolean c = Boolean.parseBoolean(strBoolean);
        System.out.println("String berubah menjadi boolean: " + c);

        //string ke char
        String strChar = "A";
        char d = strChar.charAt(0);
        System.out.println("String berubah menjadi char: " + d);
    }
    
}
