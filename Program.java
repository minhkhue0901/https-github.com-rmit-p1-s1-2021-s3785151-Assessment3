package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import ehicles.VehicleSystem;

public class Program {

	public static void main(String[] args) throws IOException {
		String[] vehicles = null;
		VehicleSystem veh = new VehicleSystem();
		vehicles=veh.loadVehicles();
		Menu menu = new Menu();
for (int i =0; i<100;i++)
{
		int selection=menu.menu();

		if (selection==6)

		{
			System.out.println("Program Ending");
			System.exit(0);

			return;
		}


		else if (selection == 1)
		{

			
			for (int j =0;j<vehicles.length;j++)
			{
				String[] arrOfStr = null;
				String st = vehicles[j];
				arrOfStr = st.split(";");
				System.out.println(arrOfStr[0] + "  " + arrOfStr[1] + "  " + arrOfStr[2] + "  " + arrOfStr[3] + "  " +arrOfStr[4] + "  " +arrOfStr[5]);
			}

		}
		
		
		
		
		
		else if (selection == 4)
		{
			   System.out.println("Enter rego :");
			 Scanner Rego = new Scanner(System.in);
			String rego = Rego.nextLine();
			for (int j =0;j<vehicles.length;j++)
			{
				String[] arrOfStr = null;
				String st = vehicles[j];
				if (st.contains(rego))
				{
					
					vehicles=veh.removeTheElement(vehicles, j);
					System.out.println("Successfully removed vehicles with rego = " +rego);
					
				}
				//arrOfStr = st.split(";");
				//System.out.println(arrOfStr[0] + "  " + arrOfStr[1] + "  " + arrOfStr[2] + "  " + arrOfStr[3] + "  " +arrOfStr[4] + "  " +arrOfStr[5]);
			}

		}
		
		
		
		
		
		
	}
	}
}
