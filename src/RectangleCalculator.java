/* Kunal Pathade
 * November 20th, 2014
 * Period 5
 * RectangleCalculator
 */
 
import java.util.*;
 
public class RectangleCalculator {
		
	public static void main(String[] args){
		int length = 13; //longer side of rectangle
		int width = 4;   //shorter side of rectangle
		int area;        //calculated area of triangle
		int perimeter;
		//<class> <variable name> = new <class>(<parameters>);
		
		Scanner scan = new Scanner (System.in);
		System.out.print("Input value length:");
		length = scan.nextInt();
		System.out.println ("Input value width:");
		width = scan.nextInt();
		
		scan.close();
		
	
		
		area = length * width;
		perimeter = (2 * length) + (2 * width);
		System.out.println ("Area of Rectangle:  " + area);
		System.out.println ("Perimeter of Rectangle:  " + perimeter);
	}
	
 }
	
