package FirstChallenger;


import java.util.Scanner;
import javax.swing.JOptionPane;

public class Challenge1 {
	
	public static void main(String args[]) {
		excerciseA();		
	}
	
	//2.a
	
	public static void excerciseA() {
		String type = "";
		//Scanner class this class allows to read the data by console
		Scanner read = new Scanner(System.in);

		//while the parameters are met, the random numbers are generated
		while (!type.equals("TypeA") & !type.equals("TypeB")) {
			//Welcome screen
			System.out.println(" ************* Welcome! ************* ");
			System.out.println(" --------------------------------------- ");
			System.out.println(" Please choose the option you want 'TypeA' or 'TypeB' : \n");
			type = read.nextLine();
			
			//if the condition is not met, an error is generated
			if (!type.equals("TypeA") & !type.equals("TypeB")) {
				System.out.println("you can only choose 'TypeA' or 'TypeB' ");				
			} else {
				System.out.println("The generated random number is: \n" + generateRandom(type));
			}
		}
	}
	//Generate random numbers under certain conditions
	private static String generateRandom(String type) {
		String number = "";

		if (type.equals("TypeA")) {
			number = "54";
		} else if (type.equals("TypeB")) {
			number = "08";
		}
		//Using the valueOf function to convert an integer to a string
		for (int i = 0; i < 8; i++) {
			number += String.valueOf((int) (Math.random() * 10)); 
		}

		return number;
		
	}

	
}

// Exercise 2.b

public class exerciseB {

	public static String t;
	public static void main(String args[]) {	
		
    //Home Screen
	t= JOptionPane.showInputDialog(null, " ************* RANDOM NUMBER LIST ************* \nPlease tell us how you want to order them:?\n Smallest to largest (Asc) or Largest to smallest (Desc)?");
    array(t);

}
	public static void array(String t) {
		String sizes=JOptionPane.showInputDialog(null, "How many random numbers do you want to order?");
	    
	    int number[] = new int[Integer.parseInt(sizes)];
	    
	    //Random numbers fill the array via the generateNumber() method
	    for (int i = 0; i < number.length; i++) {
	    	number[i]= generateNumber();
	    }	    
	    
	    //create the string of random numbers without ordering
	    JOptionPane.showMessageDialog(null,"The random numbers generated are: "+stringArray(number));
	    if (t.equals("Asc")) {
	    	orderAsc(number);
	    }else if (t.equals("Desc")) {
	        orderDsc(number);
	    }
	}
	//Here the array is sorted in ascending order
	public static void orderAsc(int mallestToLargest[]){
	    for (int i = 0; i < mallestToLargest.length; i++) 
	    {      
	        for (int j = i + 1; j < mallestToLargest.length; j++) 
	        {  
	            int mtl = 0;                            
	            if (mallestToLargest[i] > mallestToLargest[j]) 
	            {        
	            	mtl = mallestToLargest[i];               
	                mallestToLargest[i] = mallestToLargest[j];            
	                mallestToLargest[j] = mtl;
	            }
	        }
	    }
	    JOptionPane.showMessageDialog(null,"The list was sorted from smallest to largest: "+ stringArray(mallestToLargest));        
	} 
	//Here the array is sorted in descending order
	public static void orderDsc(int highestToLowest[]){
	    for(int i = 0; i < highestToLowest.length - 1; i++)
	    {
	        for(int j = 0; j < highestToLowest.length - 1; j++)
	        {
	            if (highestToLowest[j] < highestToLowest[j + 1])
	            {
	                int htl = highestToLowest[j+1];
	                highestToLowest[j+1] = highestToLowest[j];
	                highestToLowest[j] = htl;
	            }
	        }
	    }
	        JOptionPane.showMessageDialog(null,"The list is ordered from highest to lowest: "+ stringArray(highestToLowest));
	}
	//Here generate the random number, to display the result.
	
	public static int generateNumber(){
	    int random;
	    random = (int) (Math.random()*10);
	    return random;
	}
	////Random numbers ordered according to the user's request
	public static String stringArray(int matriz[]){
	    int solution;
	    String returned="";
	    for(int t=0;t<matriz.length;t++){
	    	solution=matriz[t];
	        returned=returned+solution+", ";
	    }
	    return returned;
	}
}	
	


	