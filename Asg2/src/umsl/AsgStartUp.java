/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umsl;

import java.util.Scanner;

/**
 *
 * @author Sophie
 */
public class AsgStartUp {
    
    public static void main(String args[])
    {
        AccountArray aa = new AccountArray();
        
        System.out.println("Is this your first time banking with Sophie Bank? 'yes' or 'no'");
        Scanner response = new Scanner(System.in);;
        String answer = response.nextLine();
        float balance = 100;
        
        if(answer.equalsIgnoreCase("yes"))
        {
           aa.populateArray();
           // aa.writearray();
           aa.readArray();
           aa.selectAccount();
        }
        else
        {
           aa.readArray();
           balance = aa.selectAccount();
        }
        
        
        //menu.Asg2Menu(balance); 
    }
}
