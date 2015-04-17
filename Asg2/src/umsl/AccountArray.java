/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umsl;

import java.util.*;
import java.util.Scanner;

/**
 *
 * @author Sophie
 */
public class AccountArray {
    
    ArrayList<float[]> accountTot = new ArrayList<>();
    
    public void AccountArray()
    {
            
            float id;
            float balance = 100;
            float[] Account; //creates 2 parking spots
            Account = new float[2];
            System.out.println("Please enter a number you wish to label your account.");
            Scanner in = new Scanner(System.in);
            id=in.nextFloat();

            for(int i=0; i<Account.length; i++)
            {
                    Account[i] = id;
                    Account[i] = balance;
            }
         
            System.out.println("Account ID: " + id);
            System.out.println("Account Balance: " + balance);
            System.out.println();
            
            accountTot.add(Account);
            System.out.println("The accounts available are:");
            System.out.println(accountTot);
    } 
    public int selectAccount()
        {
            System.out.println("Please enter your account number");
            Scanner select = new Scanner(System.in);
            int selection = select.nextInt();
            
            for (int j = 0; j < accountTot.size(); j++)
            {
                float outer[] = accountTot.get(j);
                
                    for (int k = 0; k <=outer.length; k++)
    
                        if(k == selection)
                        {
                            System.out.println("This is a test");
                        }
            }
            return(selection);
        }
}
