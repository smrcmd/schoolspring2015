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
public class Asg2Menu {
    
    public static void main(String args[])
    {
        int selection;
        Asg2 asg2 = new Asg2();
        asg2.dateCalc();
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
            double tempDeposit = asg2.deposit();
        }
        else if (selection == 2)
        {
            double tempWithdraw = asg2.withdraw();
        }
        else if (selection == 3)
        {
            double tempCheckBalance = asg2.checkBalance();
        }
        }while(selection != 4);
        
    }
}
