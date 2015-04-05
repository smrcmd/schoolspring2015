/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umsl;
import java.util.Scanner;
import java.util.GregorianCalendar;
import java.util.StringTokenizer;
/**
 *
 * @author Sophie
 */
public class Asg2 
{
    private double balance = 100;
    private double interest = 1.05;
    private double newBalInt;
    private int secondDate; 
    
    
    public void currentDate()
    {
        String month="";
        String day="";
        String year="";

        GregorianCalendar gregorianCalendar=new GregorianCalendar();            
        month=String.valueOf(gregorianCalendar.get(GregorianCalendar.MONTH));            
        day=String.valueOf(gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH));
        year=String.valueOf(gregorianCalendar.get(GregorianCalendar.YEAR));
        System.out.println("Today's date is " + month + "/" + day + "/" + year);
    }
    
    public void calcInterest()
    {
        newBalInt = balance * interest;
        System.out.println("Your new balance with interest is " + newBalInt + ".");
    }
    
    public double deposit()
    {
        double depositAMT;
        System.out.println("Please enter amount to deposit. Ex: 200.05");
        Scanner in = new Scanner(System.in);
        depositAMT = in.nextDouble();
        balance = balance + depositAMT;
        System.out.println("Your deposit amount was " + depositAMT + ".");
        System.out.println("Your new balance is " + balance);
        return(depositAMT);
    }
    
    public double withdraw()
    {
        double withdrawAMT;
        System.out.println("Your available balance is " + balance + ". Please enter amount to withdraw. Ex: 200.05");
        Scanner in = new Scanner(System.in);
        withdrawAMT = in.nextDouble();
        balance = balance - withdrawAMT;
        System.out.println("Your withdrawal amount is " + withdrawAMT + ".");
        System.out.println("Your new balance is " + balance);
        return(withdrawAMT);
    }
    
    public double checkBalance()
    {
        System.out.println("Your available balance is " + balance*interest + ".");
        return(newBalInt);
    } 
    
    public double julianConversion()
    {
        int month = 0;
        int day = 0;
        int year = 0;
        int julianMonth = 0;
        int julianCal = 0;
        int counter = 0;
        int num;
        System.out.println("Please enter a date in the format of 5/24/2015");
        Scanner in = new Scanner(System.in);
        String dateInput = in.nextLine();
        StringTokenizer mytokenizer = new StringTokenizer(dateInput, "/");

        while(mytokenizer.hasMoreTokens())
        {
            num = Integer.parseInt(mytokenizer.nextToken());
            counter++;
            if (counter == 1)
            {
                month = num;
            }
            else if (counter == 2)
            {
                day = num;
            }
            else
            {
                year = num;
            }
        }
        
        switch (month)
        {
            case 2:
            {
                julianMonth = 31;
                break;
            }
            case 3:
            {
                julianMonth = 59;
                break;
            }
            case 4:
            {
                julianMonth = 90;
                break;
            }
            case 5:
            {
                julianMonth = 120;
                break;
            }
            case 6:
            {
                julianMonth = 151;
                break;
            }
            case 7:
            {
                julianMonth = 181; 
                break;
            }
            case 8:
            {
                julianMonth = 212;
                break;
            }
            case 9: 
            {
                julianMonth = 243;
                break;
            }
            case 10:
            {
                julianMonth = 273;
                break;
            }
            case 11:
            {
                julianMonth = 304;
                break;
            }
            case 12:
            {
                julianMonth = 334;
                break;
            }
        }
        
        julianCal = julianMonth + day;
        System.out.println("Julian Calendar days is " + julianCal + ".");
        return(julianCal);
        
    }
}