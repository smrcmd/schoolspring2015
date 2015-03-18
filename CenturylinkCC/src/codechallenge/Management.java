/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codechallenge;

import java.util.Scanner;

/**
 *
 * @author Sophie
 */
public class Management {
    
    public int Management()
    {
        int managertotal = 0;
        String response = null;
        System.out.println("Do you currently manage any other managers? 'yes' or 'no'?");
        Scanner sc = new Scanner(System.in);
        response = sc.next();
        int totalBudget = 0;
        
        if (response.equalsIgnoreCase("yes")) // do in a seperate class
        {
            System.out.println("How many managers are on this team?");
            Scanner mgr = new Scanner(System.in);
            managertotal = mgr.nextInt();
            
            int mgrcount = 1;
            while(mgrcount <= managertotal)
            {
                System.out.println("For team " + mgrcount + ":");
                NumberOfEmployees budget = new NumberOfEmployees();
                mgrcount++;
                totalBudget += (budget.NumberOfEmployees());
            }
            
            System.out.println("For YOUR team:");
            NumberOfEmployees budget = new NumberOfEmployees();
            totalBudget += (budget.NumberOfEmployees());
        }
        else
        {
            NumberOfEmployees budget = new NumberOfEmployees();
            totalBudget += (budget.NumberOfEmployees());
        }
      System.out.println("The total budget needed for this team is " + totalBudget);
      return totalBudget; 
    }
    
}
