public class Day38_menetukan_bilangan_positif_negatif_dan_nol {
    public static void main (String [] args){
    java.util.Scanner sc = new java.util.Scanner(System.in);
    System.out.print("Masukkan sebuah bilangan: ");
    int number = sc.nextInt();
        
        if (number > 0) {
            System.out.println(number + " adalah bilangan positif");
        } else if (number < 0) {
            System.out.println(number + " adalah bilangan negatif");
        } else {
            System.out.println("Bilangan yang dimasukkan adalah nol");
        }

    }

}

