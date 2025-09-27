public class Day20_tipe_data_primitif_menjadi_string {
    public static void main(String[] args) {

        //byte ke string
        byte a = 10;
        String strByte = Byte.toString(a);
        System.out.println("Byte berubah menjadi String: " + strByte);

        //short ke string
        short b = 100;
        String strShort = Short.toString(b);
        System.out.println("Short berubah menjadi String: " + strShort);
        
        //integer ke string
        int c = 12345;
        String strInt = Integer.toString(c);
        System.out.println("Integer berubah menjadi String: " + strInt);

        //long ke string
        long d = 123456789;
        String strLong = Long.toString(d);
        System.out.println("Long berubah menjadi String: " + strLong);

        //float ke string
        float e = 12.34f;
        String strFloat = Float.toString(e);
        System.out.println("Float berubah menjadi String: " + strFloat);

        //double ke string
        double f = 123.45;
        String strDouble = Double.toString(f);
        System.out.println("Double berubah menjadi String: " + strDouble);

        //boolean ke string
        boolean g = true;
        String strBoolean = Boolean.toString(g);
        System.out.println("Boolean berubah menjadi String: " + strBoolean);

        //char ke string
        char h = 'A';
        String strChar = Character.toString(h);
        System.out.println("Char berubah menjadi String: " + strChar);
    }
}
