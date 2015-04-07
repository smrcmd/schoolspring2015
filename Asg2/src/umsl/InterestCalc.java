/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umsl;

/**
 *
 * @author Sophie
 */
public class InterestCalc {
    public double InterestCalc(double todayJul, double futureDateJul)
    {
        double interestRate = 0.05;
        double daysYear = 365;
        double interest = interestRate/daysYear;
        double newBalInt = 0;
        double newInterest = 0;
        double balance = 100;
        double dateDiff;
        int count=0;
        if (futureDateJul > todayJul)
            {
                dateDiff = futureDateJul - todayJul;
                dateDiff = dateDiff - 1;
                System.out.println("Interest will be calculated for " + dateDiff + " days");
                while (count <= dateDiff)
                {
                    newInterest = balance * interest;
                    newBalInt = balance + newInterest;
                    balance = newBalInt;
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
}
