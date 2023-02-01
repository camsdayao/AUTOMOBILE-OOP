import java.util.Scanner;

/**
 * 
 */

/**
 * @author CamilleDayao
 **@Description : To set and display the specs of the automobile
 *@DateCreated : 23/05/2022
 */
public class Automobile {
	private String make;
	private String color;

	
	Scanner scan = new Scanner(System.in);
	public void setMake() {				//set the make of the automobile
		
		do {
			System.out.print("Select Buick, Chevrolet, or Pontiac (b,c,p): ");
			make = scan.next();
			if(make.equals("b") || make.equals("c") || make.equals("p")) {
			break;
			}
			else {
				System.out.println("The only valid selections are 'b', 'c', or 'p'");
			}
		}
		while(true);
	}
	
	public void setColor() {			//set the color of the automobile
		
		do {
			System.out.print("Select blue, green, or red (b,g,r): ");
			color = scan.next();
			if(color.equals("b") || color.equals("g") || color.equals("r")) {
			break;
		}
		else {
			System.out.println("The only valid selections are 'b', 'g', or 'r'");
		}
	}
		while(true);
	}
	
	public void printColor(){			//print the color of the automobile
		
		if(color.equals("b")) {
			System.out.print("Blue ");
		}
		else if(color.equals("g")) {
			System.out.print("Green ");
		}
		else if(color.equals("r")) {
			System.out.print("Red ");
	}
	}
	
	public void printMake() {			//print the make of the automobile
		if(make.equals("b")) {
			System.out.println("Buick");
		}
		else if(make.equals("c")) {
			System.out.println("Chevrolet");
		}
		else if(make.equals("p")) {
			System.out.println("Pontiac");
		}	
		}
		
	}
	
