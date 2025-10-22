import java.util.Scanner;

public class Day45_percabangan_switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukkan Nilai (A-E): ");
        char grade = sc.next().charAt(0);
        
        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'B':
                System.out.println("Good job!");
                break;
            case 'C':
                System.out.println("Well done");
                break;
            case 'D':
                System.out.println("You passed");
                break;
            case 'E':
                System.out.println("Try again");
                break;
            default:
                System.out.println("Invalid grade");
        }
    }
