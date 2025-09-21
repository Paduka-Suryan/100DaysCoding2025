public class Day14_string_menjadi_tipedata_primitif {
    public static void main(String[] args) {

        //string ke byte
        String strByte = "1";
        byte a = Byte.parseByte(strByte);
        System.out.println("String berubah menjadi byte: " + a);

        //string ke short
        String strShort = "12";
        short b = Short.parseShort(strShort);
        System.out.println("String berubah menjadi short: " + b);
        
        //string ke integer
        String strInt = "123";
        int c = Integer.parseInt(strInt);
        System.out.println("String berubah menjadi integer: " + c);

        //string ke long
        String strLong = "1234";
        long d = Long.parseLong(strLong);
        System.out.println("String berubah menjadi long: " + d);

        //string ke float
        String strFloat = "12.34";
        float e = Float.parseFloat(strFloat);
        System.out.println("String berubah menjadi float: " + e);

        //string ke double
        String strDouble = "123.45";
        double f = Double.parseDouble(strDouble);
        System.out.println("String berubah menjadi double: " + f);

        //string ke boolean
        String strBoolean = "true";
        boolean g = Boolean.parseBoolean(strBoolean);
        System.out.println("String berubah menjadi boolean: " + g);

        //string ke char
        String strChar = "A";
        char h = strChar.charAt(0);
        System.out.println("String berubah menjadi char: " + h);
    }
    
}


