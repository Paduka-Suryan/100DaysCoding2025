import java.util.Scanner;
public class Day93_Method_CeilFloorRound {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		double a = 1.4;
		
		System.out.println("Ceil: "+Math.ceil(a));
		System.out.println("Floor: "+Math.floor(a));
		System.out.println("Round: "+Math.round(a));
	}
}