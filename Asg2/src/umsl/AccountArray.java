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
    float[] AccountArray = new float[3];
    
    public void populateArray()
    {
            float balance = 100;
            int i = 0;
 
            for(i=0; i<AccountArray.length; i++)
            {
                    AccountArray[i] = balance;
            }
            
            System.out.println("There are " + AccountArray.length + " accounts available.");
            System.out.println();
            
            try
            {
                FileOutputStream fout = new FileOutputStream("file.out");
                ObjectOutputStream oout = new ObjectOutputStream(fout);
                oout.writeObject(AccountArray);
                oout.close();
                System.out.println("Done");
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
            AccountArray = (float[]) oIn.readObject();
            fIn.close();
        }
        catch (Throwable e)
        {
            System.err.println(e);
        }
        System.out.println(AccountArray.length + " arrays to choose from.");
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
            AccountArray[input].Asg2Menu();     
            return(input);
        }
}
