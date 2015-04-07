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

    
    public void Asg2Menu()
    {
        int selection;
        //Asg2 date1 = new Asg2();
        //Asg2 date2 = new Asg2();
        Asg2 asg2 = new Asg2();
        Date sDate1 = new Date();
        Asg2 currentdate = new Asg2();
        JulianCalc temp = new JulianCalc();
        JulianCalc temp2 = new JulianCalc();
        InterestCalc intCalc = new InterestCalc();
        
        String today = currentdate.currentDate();
        double todayJul = temp.JulianCalc(today);
        String futureDate = sDate1.Date();
        double futureDateJul = temp2.JulianCalc(futureDate);
        double balInt = intCalc.InterestCalc(todayJul, futureDateJul);
        
        if (balInt < 0)
        {
            System.out.println("You did not enter valid dates. Please enter current date and date in future.");
            futureDate = sDate1.Date();
            futureDateJul = temp2.JulianCalc(futureDate);
            double tryAgain = intCalc.InterestCalc(todayJul, futureDateJul);
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
            double tempWithdraw = asg2.withdraw(balInt);
            balInt = tempWithdraw;
        }
        else if (selection == 3)
        {
            double tempCheckBalance = asg2.checkBalance(balInt);
        }

        }while(selection != 4);
        
    }
}
