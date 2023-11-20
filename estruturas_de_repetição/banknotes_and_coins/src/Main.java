import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double n = sc.nextDouble();
		
		int n100 = (int)n/100;
		int n50 = ((int)n -(n100 * 100))/50;
	    int n20 = ((int)n -(n100 * 100) - (n50 * 50))/20;
	    int n10 = ((int)n -(n100 * 100) - (n50 * 50) - (n20 * 20))/10;
	    int n5 = ((int)n -(n100 * 100) - (n50 * 50) - (n20 * 20) - (n10 * 10))/5;
	    int n2 = ((int)n -(n100 * 100) - (n50 * 50) - (n20 * 20) - (n10 * 10) - (n5 * 5))/2;
	    int n1 = ((int)n -(n100 * 100) - (n50 * 50) - (n20 * 20) - (n10 * 10) - (n5 * 5) - (n2 * 2))/1;
	    double n05 = (n -(n100 * 100) - (n50 * 50) - (n20 * 20) - (n10 * 10) - (n5 * 5) - (n2 * 2) - (n1 * 1))/0.5; 
	    		
	    System.out.println("NOTAS:");
	    System.out.printf("%d nota(s) de R$ 100,00%n", n100);
	    System.out.printf("%d nota(s) de R$ 50,00%n", n50);
	    System.out.printf("%d nota(s) de R$ 20,00%n", n20);  
	    System.out.printf("%d nota(s) de R$ 10,00%n", n10);
	    System.out.printf("%d nota(s) de R$ 5,00%n", n5);
	    System.out.printf("%d nota(s) de R$ 2,00%n", n2);
	    
	    System.out.println("MOEDAS:");
	    System.out.printf("%d moeda(s) de R$ 1,00%n", n1);
	    System.out.printf("%f moeda(s) de R$ 0,50%n", n05);
	    
		sc.close();
	}
}
//banknotes and coins
