/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Umsl.SwitchCase;
import java.util.Scanner;
/**
 *
 * @author Sophie
 */
public class SwitchCaseExample 
{
    
    public static void main(String args[])
    {
        int telephone_number;
        System.out.println("Please enter a phone extension:");
        Scanner in = new Scanner(System.in);
	telephone_number = in.nextInt();
	switch (telephone_number)
	{
	  case 6279:
	  case 6127:{
			System.out.println("This is on the 2nd floor of CCB");
			break;
		    }
	  case 6520:{
			System.out.println("This is on the 3rd floor of CCB");
			break;
		    }
	  default:  {
			System.out.println("Invalid Telephone Number");
			break; //not required
		    }
	}
	
    }

}
    
