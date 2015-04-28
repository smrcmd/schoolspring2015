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
public class Asg2Menu{

    
    public void Asg2Menu(int balance)
    {
        int selection;
        double todayJul;
        String futureDate;
        double futureDateJul;
        double balInt;
        String answer;

        
        
        Asg2 currentdate = new Asg2();
        String today = currentdate.currentDate();
        
        JulianCalc temp = new JulianCalc();
        todayJul = temp.JulianCalc(today);
        
        Date sDate1 = new Date();
        futureDate = sDate1.Date();
        
        JulianCalc temp2 = new JulianCalc();
        futureDateJul = temp2.JulianCalc(futureDate);
        
        InterestCalc intCalc = new InterestCalc();
        balInt = intCalc.InterestCalc(todayJul, futureDateJul, balance); // take out balance to make code work
        
        Asg2 asg2 = new Asg2();
        
        if (balInt < 0)
        {
            System.out.println("You did not enter a valid date. ");
            futureDate = sDate1.Date();
            futureDateJul = temp2.JulianCalc(futureDate);
            double tryAgain = intCalc.InterestCalc(todayJul, futureDateJul, balance); // take out balance to make code work
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
            selection = in.nextInt();

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
}
