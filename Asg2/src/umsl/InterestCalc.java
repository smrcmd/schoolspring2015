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
    public double InterestCalc(double date1, double date2)
    {
        double interest = 1.005;
        double newBalInt = 0;
        double newInterest = 0;
        double balance = 100;
        double dateDiff;
        if (date2 > date1)
            {
                dateDiff = date2 - date1;
                dateDiff = dateDiff - 1;
                newInterest = dateDiff * interest;
                newBalInt = balance + newInterest;
                System.out.println("Interest will be calculated for " + dateDiff + " days");
                System.out.println("Your new balance with interest is " + newBalInt + ".");
            }
        else
            {
                newBalInt = -1;
            }
        return (newBalInt);
        
    }
}