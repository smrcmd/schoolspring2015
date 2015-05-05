/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umsl;
import java.util.Scanner;
import java.util.GregorianCalendar;
import java.util.StringTokenizer;
import java.io.*;
/**
 *
 * @author Sophie
 */
public class Asg2 implements Serializable
{
    private double balance = 100;
    public double interest = 1.05;
    public double newBalInt;
    public double balInt = 0;
    
    public void setBalance(double b1){
            balance = b1;	
    }
    
    public void showAll()
        {
            int i;
            for (i = 1; i<=3; i++)
            {
		System.out.println("Account "+ i + ": " + balance);
            }
	}
    
    public void Asg2Menu()
    {
        double selection;
        double todayJul;
        String futureDate;
        double futureDateJul;
        String answer;

        Asg2 asg2 = new Asg2();
        String today = asg2.currentDate();
        todayJul = asg2.JulianCalc(today);
        futureDate = asg2.Date();
        futureDateJul = asg2.JulianCalc(futureDate);
        balInt = asg2.InterestCalc(todayJul, futureDateJul); // take out balance to make code work
        
       
        
        if (balInt < 0)
        {
            System.out.println("You did not enter a valid date. ");
            futureDate = asg2.Date();
            futureDateJul = asg2.JulianCalc(futureDate);
            double tryAgain = asg2.InterestCalc(todayJul, futureDateJul); // take out balance to make code work
            balInt = tryAgain;
        }
        
    do
        {
            System.out.println("Please enter the type of transaction you wish to make.");
            Scanner in = new Scanner(System.in);
            System.out.println("1) Deposit");
            System.out.println("2) Withdraw");
            System.out.println("3) Check Balance");
            System.out.println("4) Exit");
            selection = in.nextDouble();

        if(selection == 1)
        {
            double tempDeposit = asg2.deposit(balInt);
            balInt = tempDeposit;
        }
        else if (selection == 2)
        {
            if (balInt > 0)
            {
                double tempWithdraw = asg2.withdraw(balInt);
                balInt = tempWithdraw;
            }
            else
            {
                System.out.println("Your current balance is " + balInt);
                System.out.println("You have insufficient funds. Please make a deposit.");
            }
        }
        else if (selection == 3)
        {
            double tempCheckBalance = asg2.checkBalance(balInt);
        }

        }while(selection != 4);
        
    }
    
    public String currentDate()
    {
        int month;
        String day;
        String year;
        String date;

        GregorianCalendar gregorianCalendar=new GregorianCalendar();            
        month=(gregorianCalendar.get(GregorianCalendar.MONTH));            
        day=String.valueOf(gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH));
        year=String.valueOf(gregorianCalendar.get(GregorianCalendar.YEAR));
        month += 1;
        Integer.toString(month);
        System.out.println("Today's date is " + month + "/" + day + "/" + year);
        date = month+"/"+day+"/"+year;
        return(date);
    }
    
    public double InterestCalc(double todayJul, double futureDateJul)
    {
        double interestRate = 0.05;
        double daysYear = 365;
        interest = interestRate/daysYear;
        newBalInt = 0;
        double bal = 100;
        double newInterest;
        double dateDiff;
        int count=0;
        if (futureDateJul > todayJul)
            {
                dateDiff = futureDateJul - todayJul;
                dateDiff = dateDiff - 1;
                System.out.println("Interest will be calculated for " + dateDiff + " days");
                while (count <= dateDiff)
                {
                    newInterest = bal * interest;
                    newBalInt = balance + newInterest;
                    bal = newBalInt;
                    count++;
                }
                System.out.println("Your new balance with interest is " + newBalInt + ".");
            }
        else
            {
                newBalInt = -1;
            }

        return (newBalInt);
        
    }
    
    public double deposit(double balInt)
    {
        double depositAMT;
        System.out.println("Your available balance is " + balInt + ".");
        System.out.println("Please enter amount to deposit. Ex: 200.05");
        Scanner in = new Scanner(System.in);
        depositAMT = in.nextDouble();
        balance = balInt + depositAMT;
        System.out.println("Your deposit amount was " + depositAMT + ".");
        System.out.println("Your new balance is " + balance);
        return(balance);
    }
    
    public double withdraw(double balInt)
    {
        double withdrawAMT;
        System.out.println("Your available balance is " + balInt + ". Please enter amount to withdraw. Ex: 200.05");
        Scanner in = new Scanner(System.in);
        withdrawAMT = in.nextDouble();
        System.out.println("Your withdrawal amount is " + withdrawAMT + ".");
        balance = balInt - withdrawAMT;
        System.out.println("Your new balance is " + balance);
        return(balance);
    }
    
    public double checkBalance(double balInt)
    {
        System.out.println("Your available balance is " + balInt + ".");
        return(balInt);
    } 
    
    public double JulianCalc(String today)
    {
        int month = 0;
        int day = 0;
        int year = 0;
        int julianMonth = 0;
        int julianDate1 = 0;
        int counter = 0;
        int num;
        StringTokenizer mytokenizer = new StringTokenizer(today, "/");

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
        
        julianDate1 = julianMonth + day;
        System.out.println(" ");
        return(julianDate1);
    }
    
    public String Date()
    {
        System.out.println("Please enter a date (i.e. 5/24/2015) in the future: ");
        System.out.println(" ");
        Scanner in = new Scanner(System.in);
        String dateInput = in.nextLine();
        return(dateInput);
    }
}
  