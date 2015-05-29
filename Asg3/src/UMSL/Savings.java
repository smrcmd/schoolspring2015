/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UMSL;

/**
 *
 * @author Sophie
 */
public class Savings extends Account{
    private double rate;
    double balance = getBal();
    int firstdate = getDateOne();
    int seconddate = getDateTwo();
    
//    public Savings (double begin_balance) 
//    {
//        balance = begin_balance;
//    } // End Initial Constructor
    
    public double getInterest() 
    {
        int datediff = seconddate - firstdate;
        rate = .10/365;
        double ratetime = Math.pow(1+rate,datediff);
        balance = balance * ratetime;
        firstdate = seconddate;
        return balance;
    }
}
