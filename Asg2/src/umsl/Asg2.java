/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umsl;
import java.util.Scanner;
import java.util.GregorianCalendar;
/**
 *
 * @author Sophie
 */
public class Asg2 
{
    double balance = 100;
    double interest = 1.05;
    double newBalInt;
    
    public void dateCalc()
    {
        String month="";
        String day="";
        String year="";

        GregorianCalendar gregorianCalendar=new GregorianCalendar();            
        month=String.valueOf(gregorianCalendar.get(GregorianCalendar.MONTH));            
        day=String.valueOf(gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH));
        year=String.valueOf(gregorianCalendar.get(GregorianCalendar.YEAR));
        System.out.println(month + "/" + day + "/" + year);
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
        return(withdrawAMT);
    }
    
    public double checkBalance()
    {
        System.out.println("Your available balance is " + balance*interest + ".");
        return(newBalInt);
    } 

}