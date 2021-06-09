package ehicles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class VehicleSystem {
	
	
	  public static   String[] loadVehicles() throws IOException {

		  
		  String[] vehicles = new String[7];
		  File file = new File("D:/DataSet/vehicle.txt");
		  
		  BufferedReader br = new BufferedReader(new FileReader(file));
		  
		  String[] arrOfStr = null;
		  
		  String st;
		  int counter = 0;
		  while ((st = br.readLine()) != null)
		  { 
			  vehicles[counter]=st;
			  counter=counter+1;
			// arrOfStr = st.split(";");
		    //System.out.println(arrOfStr[0] + "  " + arrOfStr[1] + "  " + arrOfStr[2] + "  " + arrOfStr[3] + "  " +arrOfStr[4] + "  " +arrOfStr[5]);
		  } 
		  
		  
		  return vehicles;
	    }
	  
	  
	  
	  
	  
	  public static String[] removeTheElement(String[] arr,
              int index)
{

// If the array is empty
// or the index is not in array range
// return the original array
if (arr == null
|| index < 0
|| index >= arr.length) {

return arr;
}

// Create another array of size one less
String[] anotherArray = new String[arr.length - 1];

// Copy the elements except the index
// from original array to the other array
for (int i = 0, k = 0; i < arr.length; i++) {

// if the index is
// the removal element index
if (i == index) {
continue;
}

// if the index is not
// the removal element index
anotherArray[k++] = arr[i];
}

// return the resultant array
return anotherArray;
}
	  
	  

}
