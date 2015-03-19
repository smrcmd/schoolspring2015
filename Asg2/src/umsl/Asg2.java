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
    
    public double deposit()
    {
        double depositAMT;
        double balance = 100;
        double newBalance = 0;
        System.out.println("Please enter amount to deposit. Ex: 200.05");
        Scanner in = new Scanner(System.in);
        depositAMT = in.nextDouble();
        newBalance = balance + depositAMT;
        return(depositAMT);
    }
    
    public double withdraw()
    {
        double withdrawAMT;
        double balance = 100.00; 
        double newBalance=0;
        System.out.println("Your available balance is " + balance + ". Please enter amount to withdraw. Ex: 200.05");
        Scanner in = new Scanner(System.in);
        withdrawAMT = in.nextDouble();
        newBalance = balance - withdrawAMT;
        return(withdrawAMT);
    }
    
    public int checkBalance()
    {
    
    }
    
    private void calcInterest()
    {
    
    }
    
    private void dateCalculator()
    {
        String month="";
        String day="";
        String year="";

        GregorianCalendar gregorianCalendar=new GregorianCalendar();            
        month=String.valueOf(gregorianCalendar.get(GregorianCalendar.MONTH));            
        day=String.valueOf(gregorianCalendar.get(GregorianCalendar.DAY_OF_MONTH));
        year=String.valueOf(gregorianCalendar.get(GregorianCalendar.YEAR));
    }
    

}