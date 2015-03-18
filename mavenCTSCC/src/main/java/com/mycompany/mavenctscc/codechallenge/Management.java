/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenctscc.codechallenge;

import java.util.Scanner;

/**
 *
 * @author Sophie
 */
public class Management {
    public int Management()
    {
        int managers = 0;
        System.out.println("How many managers do you currently manage?");
        Scanner sc = new Scanner(System.in);
        managers = sc.nextInt();
        int totalBudget = 0;
        
        if (managers > 0) // do in a seperate class
        {
            int mgrcount = 1;
            while(mgrcount <= managers)
            {
                System.out.println("For team " + mgrcount + ":");
                NumberOfEmployees budget = new NumberOfEmployees();
                mgrcount++;
                totalBudget += (budget.NumberOfEmployees());
            }
            
            System.out.println("For your team:");
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
