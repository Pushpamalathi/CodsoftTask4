import java.util.*;
public class Task4 {

	private static double incCost=83.37;
	private static double usdCost=0.012;
	
	private static void convertIncToUsd() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter amount in INC : ");
		double inc = sc.nextDouble();
		double incToUsd = inc * usdCost;
		System.out.println(inc+" Inc to "+incToUsd+" Usd");
	}
	
	private static void convertUsdToInc() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter amount in USD : ");
		double usd = sc.nextDouble();
		double incToUsd = usd * incCost;
		System.out.println(usd+" Usd to "+incToUsd+" Inc");
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Click 1 for Convert Inc to Usd");
		System.out.println("Click 2 for Convert Usd to Inc");
		System.out.println("Click 3 for Exit");
		System.out.print("Select Your Option : ");
		int num = sc.nextInt();
		switch(num) {
		case 1:
			convertIncToUsd();
			break;
		case 2:
			convertUsdToInc();
			break;
		case 3:
			System.out.println("Invalid Choice");
		}
	}
}