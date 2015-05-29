/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UMSL;

import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Scanner;

/**
 *
 * @author Sophie
 */
public class ATM {
    
    Account[] AcctArray = new Account[3];
    
    public static void main(String args[]) throws IOException, NotSerializableException, EOFException
    {
        ATM aa = new ATM();
        
        System.out.println("Is this your first time banking with Sophie Bank? 'yes' or 'no':");
        Scanner response = new Scanner(System.in);
        String answer = response.nextLine();

        if(answer.equalsIgnoreCase("yes"))
        {
           aa.populateArray();
           aa.selectAccount();
           aa.writeArray();
        }

        else 
        {
           aa.readArray();
           aa.selectAccount();
           aa.writeArray();
        }
        
    }
    
    public void populateArray() throws IOException, NotSerializableException, EOFException, InvalidClassException
    {
        for(int i=0; i<AcctArray.length; i++)
        {
            System.out.println("What kind of account do you wish to create? (C) for Checking (S) for Savings");
            Scanner sc = new Scanner(System.in);
            String acctType = sc.nextLine();
            
            if (acctType.equalsIgnoreCase("C"))
            {
                AcctArray[i] = new Checking();
                System.out.println("Please enter your desired account name: ");
                String local_id = sc.next();
                AcctArray[i].setID(local_id);
            }
            else if (acctType.equalsIgnoreCase("S"))
            {
                AcctArray[i] = new Savings();
                System.out.println("Please enter your desired account name: ");
                String local_id = sc.next();
                AcctArray[i].setID(local_id);
            }
            
        }
        System.out.println("There are " + AcctArray.length + " accounts available.");
        System.out.println();
    } 
    
    public void readArray() throws EOFException, InvalidClassException
    {
        try
        {
            FileInputStream fIn = new FileInputStream("file.out");
            ObjectInputStream oIn = new ObjectInputStream(fIn);
            AcctArray = (Account[])oIn.readObject();
            
            fIn.close();
        }
        catch (Throwable e)
        {
            System.err.println(e);
        }
        System.out.println(AcctArray.length + " accountss to choose from.");
    }

    public void writeArray() throws ArrayIndexOutOfBoundsException
    {
            try
            {
                OutputStream fout = new FileOutputStream("file.out");
                OutputStream buffer = new BufferedOutputStream(fout);
                ObjectOutputStream oout = new ObjectOutputStream(buffer);
                oout.writeObject(AcctArray);
                oout.flush();
                fout.close();
                System.out.println("Array has written to a file.");
                
            }
            catch (Throwable g)
            {
                System.err.println(g);
            }
    }
    /**
     *
     * @return
     */
    public void selectAccount() throws ArrayIndexOutOfBoundsException
    {
        try
        {
            Scanner sc = new Scanner(System.in);

                System.out.println("Please enter your Account Name:");
                String secondinput = sc.next();
                int index = -1;
                for(int i = 0; i < AcctArray.length; i++)
                {

                    if(AcctArray[i].getID().equalsIgnoreCase(secondinput))
                    {
                        index = i;
                    }
                }
            Account menu; //call menu from AcctArray
            AcctArray[index].menu();
        }
        
        catch (Throwable o)
            {
                System.exit(0);
            }
    }
}
