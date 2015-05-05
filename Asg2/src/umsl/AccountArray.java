/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umsl;

import java.util.*;
import java.io.*;

/**
 *
 * @author Sophie
 */
public class AccountArray {
    Asg2[] AcctArray = new Asg2[3];
    
    
    public static void main(String args[]) throws IOException, NotSerializableException, EOFException
    {
        AccountArray aa = new AccountArray();
        
        System.out.println("Is this your first time banking with Sophie Bank? 'yes' or 'no'");
        Scanner response = new Scanner(System.in);
        String answer = response.nextLine();
        double balance = 100;
        
        if(answer.equalsIgnoreCase("yes"))
        {
           aa.populateArray();
           aa.readArray();
           aa.selectAccount();
        }
        else
        {
           aa.readArray();
           aa.selectAccount();
        }
        
        
        //menu.Asg2Menu(balance); 
    }
    
    public void populateArray() throws IOException, NotSerializableException, EOFException
    {
        for(int i=0; i<AcctArray.length; i++)
            {
                    AcctArray[i] = new Asg2();	
                    AcctArray[i].setBalance(100);
            }
            
            System.out.println("There are " + AcctArray.length + " accounts available.");
            System.out.println();
            
            for (int i=0; i<1; i++)
                {
                    AcctArray[i].showAll();
                }
            
            try
            {
                OutputStream fout = new FileOutputStream("file.out");
                OutputStream buffer = new BufferedOutputStream(fout);
                ObjectOutputStream oout = new ObjectOutputStream(buffer);
                oout.writeObject(AcctArray);
                fout.close();
                System.out.println("Populate array has written to a file.");
                
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
            AcctArray = (Asg2[])oIn.readObject();
            
            for (int i=0; i<1; i++)
                {
                    AcctArray[i].showAll();
                }
            
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
    public void selectAccount()
        {
            System.out.println("Please enter the account you wish to access (0,1,2):" );
            Scanner select = new Scanner(System.in);
            int input = select.nextInt();
            Asg2Menu menu = new Asg2Menu(); //call Asg2Menu from AccountArray
            AcctArray[input].Asg2Menu();
            //return(input);
        }
}
