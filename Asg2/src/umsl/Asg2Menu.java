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
        //date1.julianConversion();
        Asg2 date2 = new Asg2();
        //date2.julianConversion();
        InterestCalc intCalc = new InterestCalc();
        System.out.println("Please enter the type of transaction you wish to make.");
        Scanner in = new Scanner(System.in);
        
    do
        {
            System.out.println("1) Deposit");
            System.out.println("2) Withdraw");
            System.out.println("3) Check Balance");
            System.out.println("4) Exit");
            selection = in.nextInt();
            

        if(selection == 1)
        {
            double balInt = intCalc.InterestCalc(date1.julianConversion(), date2.julianConversion());
            double tempDeposit = date2.deposit(balInt);
        }
        else if (selection == 2)
        {
            double balInt = intCalc.InterestCalc(date1.julianConversion(), date2.julianConversion());
            double tempWithdraw = date2.withdraw(balInt);
        }
        else if (selection == 3)
        {
            double balInt = intCalc.InterestCalc(date1.julianConversion(), date2.julianConversion());
            double tempCheckBalance = date2.checkBalance(balInt);
        }
        }while(selection != 4);
        
    }
}
