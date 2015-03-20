/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenctscc.codechallenge;

/**
 *
 * @author Sophie
 */
public class Calculator extends NumberOfEmployees {
    
    public int Calculator()
    {
        Managers mgr = new Managers();
        managers = mgr.Managers();
        int total = 0;
        if (managers > 0) 
            
        {
            int mgrcount = 1;
            while(mgrcount <= managers)
                
            {
                System.out.println("For team " + mgrcount + ":");
                NumberOfEmployees budget = new NumberOfEmployees();
                mgrcount++;
                total += (budget.NumberOfEmployees());
            }
            
            System.out.println("For your team:");
            NumberOfEmployees budget = new NumberOfEmployees();
            total += (budget.NumberOfEmployees());
        }
        else
        {
            NumberOfEmployees budget = new NumberOfEmployees();
            total += (budget.NumberOfEmployees());
        }
        System.out.println("The total budget needed for this team is " + total);
        return total; 
    }
}
