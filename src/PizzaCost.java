import java.util.Scanner;


public class PizzaCost {

	public static void main(String[] args){
		
		int diameter; //diameter of the pizza in inches
		
		double labor = 0.75; //cost of labor, regardless of size
		
		double rent  = 1.00; //cost of rent, regardless of size
		
		double materials = 0.05; //materials * diameter * diameter 
		
		double total = labor + rent + materials; //total
		
		Scanner scan = new Scanner (System.in);
		System.out.print("Enter the diameter of pizza in inches");
		diameter = scan.nextInt();
		scan.close();
	 
	total = (materials * diameter * diameter) + labor + rent;
	
		System.out.print ("The cost of making pizza is: $" + total);
		
	
	}
	
	




}





