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
public class NumberOfEmployees 
{
    int qaTesterTotal;
    int developerTotal;
    int qaBudget;
    int devBudget;
    int mgrBudget = 300;
    int totalBudget;
    
    public int NumberOfEmployees()
    {
        System.out.println("How many QA Testers are on this team?");
        Scanner qat = new Scanner(System.in);
        qaTesterTotal = qat.nextInt();
        qaBudget = qaTesterTotal * 500;
        
        System.out.println("How many developers are on this team?");
        Scanner dev = new Scanner(System.in);
        developerTotal = dev.nextInt();
        devBudget = developerTotal * 1000;
        
        totalBudget = (devBudget+qaBudget+mgrBudget);
        return totalBudget;
    }
}
