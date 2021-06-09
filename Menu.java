package main;

import java.util.Scanner;

public class Menu {
	
	  public static int menu() {

	        int selection;
	        Scanner input = new Scanner(System.in);

	        /***************************************************/

	        System.out.println("Options");
	        System.out.println("-------------------------\n");
	        System.out.println("1 - Display Vehicles");
	        System.out.println("2 - Perform Job");
	        System.out.println("3 - Service Vehicles");
	        System.out.println("4 - Remove Vehicle");
	        System.out.println("5 - Save and Quit");
	        System.out.println("6 - Quit");

	        selection = input.nextInt();
	        return selection;    
	    }

}
