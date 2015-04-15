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
public class AccountArray {
    public static void main(String[] args)
    {
            String id;
            float balance, interest;
            Scanner in = new Scanner(System.in);
            Accounts[] sarray = new Accounts[3]; //creates 3 parking spots

            for(int i=0; i<sarray.length; i++)
            {
                    System.out.print("Enter ID#: ");
                    id = in.next();
                    System.out.print("Enter Exam 1: ");
                    balance = in.nextFloat();
                    System.out.print("Enter Exam 2: ");
                    interest = in.nextFloat();

                    sarray[i] = new Accounts();	
                    sarray[i].setaccountID(id);
                    sarray[i].setAccountBalance(balance);
                    sarray[i].setAccountInterest(interest);
            }

            for(int i=0; i<sarray.length; i++)
            {
                    sarray[i].showAll();
            }
    }
    
}
