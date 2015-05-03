/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umsl;

import java.util.*;
import java.util.Scanner;
import java.io.*;

/**
 *
 * @author Sophie
 */
public class AccountArray {
    Asg2[] AcctArray = new Asg2[3];
    
    
    public static void main(String args[])
    {
        AccountArray aa = new AccountArray();
        
        System.out.println("Is this your first time banking with Sophie Bank? 'yes' or 'no'");
        Scanner response = new Scanner(System.in);
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
    
    public void populateArray()
    {
        for(int i=0; i<AcctArray.length; i++)
            {
                    AcctArray[i] = new Asg2();	
                    AcctArray[i].setBalance(100);
            }
            
            System.out.println("There are " + AcctArray.length + " accounts available.");
            System.out.println();
            
            try
            {
                FileOutputStream fout = new FileOutputStream("file.out");
                ObjectOutputStream oout = new ObjectOutputStream(fout);
                oout.writeObject(AcctArray);
                oout.close();
                System.out.println("Populate array has written to a file.");
                
                for (int i=0; i<AcctArray.length; i++)
                {
                    AcctArray[i].showAll();
                }
            }
            catch (Throwable e)
            {
                System.err.println(e);
            }
    } 
    
    public void readArray()
    {
        try
        {
            FileInputStream fIn = new FileInputStream("file.out");
            ObjectInputStream oIn = new ObjectInputStream(fIn);
            AcctArray = oIn.readObject();
            fIn.close();
        }
        catch (Throwable e)
        {
            System.err.println(e);
        }
        System.out.println(AcctArray.length + " arrays to choose from.");
    }

    /**
     *
     * @return
     */
    public float selectAccount()
        {
            System.out.println("Please enter the account you wish to access (0,1,2):" );
            Scanner select = new Scanner(System.in);
            float input = select.nextFloat();
            Asg2Menu menu = new Asg2Menu(); //call Asg2Menu from AccountArray
            AcctArray[input].Asg2Menu(balance);
            //AcctArray[input]
            return(input);
        }
}
