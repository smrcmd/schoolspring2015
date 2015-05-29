/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UMSL;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Sophie
 */
public class CD extends Account{

    
    public double getInterest() 
    {
        int datediff = seconddate - firstdate;
        rate = .05/365;
        double ratetime = Math.pow(1+rate,datediff);
        balance = balance * ratetime;
        firstdate = seconddate;
        return balance;
    }
    
    public void deposit() throws IOException 
    {
        int depositCount = 0;
        BufferedReader br;
        String entered_amount;
        if (depositCount < 1)
        {
            System.out.print("How much would you like to deposit? :");
            br = new BufferedReader(new InputStreamReader(System.in));
            entered_amount = br.readLine();
            double amount = Double.valueOf(entered_amount).doubleValue();
            balance = balance + amount;
            System.out.println("Your balance is: " + getBalance());
            depositCount++;
        }
        else
        {
            System.out.println("You have already made a deposit. You are limited to only 1 deposit for this account.");
        }
    }
    
    public void withdraw() throws IOException 
    {
        BufferedReader br;
        String entered_amount;
        int withdrawCount = 0;
        System.out.print("How much would you like to withdraw? :");
        br = new BufferedReader(new InputStreamReader(System.in));
        entered_amount = br.readLine();
        double amount = Double.valueOf(entered_amount).doubleValue();
        
        if (withdrawCount < 1)
        {
            if (balance < amount)
                {
                    System.out.println("Insufficient funds.");
                }
            else
                {
                    balance = balance - amount;
                }

            System.out.println("Your balance is: " + getBalance());
            withdrawCount++;
        }
        else
        {
            System.out.println("You have already made a withdrawal. You are limited to only 1 withdrawal for this account");
        }
    }
}
