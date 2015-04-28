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
    public double InterestCalc(double todayJul, double futureDateJul, float balance)
    {
        double interestRate = 0.05;
        double daysYear = 365;
        double interest = interestRate/daysYear;
        double newBalInt = 0;
        double bal = 100;
        double newInterest = 0;
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
}
