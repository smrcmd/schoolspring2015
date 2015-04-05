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
        Asg2 date1 = new Asg2();
        Asg2 date2 = new Asg2();
        InterestCalc intCalc = new InterestCalc();
        double balInt = intCalc.InterestCalc(date1.julianConversion(), date2.julianConversion());
        if (balInt < 0)
        {
            System.out.println("You did not enter valid dates. Please enter current date and date in future.");
            double tryAgain = intCalc.InterestCalc(date1.julianConversion(), date2.julianConversion());
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
            double tempDeposit = date2.deposit(balInt);
            balInt = tempDeposit;
        }
        else if (selection == 2)
        {
            double tempWithdraw = date2.withdraw(balInt);
            balInt = tempWithdraw;
        }
        else if (selection == 3)
        {
            double tempCheckBalance = date2.checkBalance(balInt);
        }

        }while(selection != 4);
        
    }
}
