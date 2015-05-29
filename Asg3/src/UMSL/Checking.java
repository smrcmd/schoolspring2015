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
public class Checking extends Account{
//    
//    private double rate;
//    double balance = getBal();
//    int firstdate = getDateOne();
//    int seconddate = getDateTwo();
    
//    public Checking (double begin_balance) 
//    {
//        balance = begin_balance;
//    } // End Initial Constructor
    
    @Override
    public double getInterest() 
    {
        int datediff = seconddate - firstdate;
        rate = .01/365;
        double ratetime = Math.pow(1+rate,datediff);
        System.out.println(ratetime);
        balance = balance * ratetime;
        firstdate = seconddate;
        return balance;
    }
    
}
