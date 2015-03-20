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
public class Managers extends NumberOfEmployees {
    
    
    public int Managers () 
    {
        System.out.println("How many managers are currently managed?");
        Scanner sc = new Scanner(System.in);
        managers = sc.nextInt();
        return(managers);
    }
   
    public int Layers ()
    {
        System.out.println("How many layers of managers are under you?");
        Scanner sc = new Scanner(System.in);
        layers = sc.nextInt();
        return(layers);
    }
   /* 
    public String Reports()
    {
        System.out.println("Do any managers report to this manager?");
        Scanner sc = new Scanner(System.in);
        reports = sc.nextLine();
        return(reports);
    }
    
    public int ReportsCalc()
    {
        int budgettotal = 0;

        while (reports.equalsIgnoreCase("yes"))
        {
            Managers mgrreports = new Managers();
            int mgrReports = mgrreports.Managers();
            
            if ( mgrReports > 0) 
            {
                int mgrtotal = 1;
                while(mgrtotal <= mgrReports)

                {
                    System.out.println("For team " + mgrtotal + ":");
                    NumberOfEmployees budget = new NumberOfEmployees();
                    mgrtotal++;
                    budgettotal += (budget.NumberOfEmployees());
                }

                System.out.println("For your team:");
                NumberOfEmployees budget = new NumberOfEmployees();
                budgettotal += (budget.NumberOfEmployees());
            }
            else
            {
                NumberOfEmployees budget = new NumberOfEmployees();
                budgettotal += (budget.NumberOfEmployees());
            }
        }
        return(budgettotal);
    }
 */   
}
