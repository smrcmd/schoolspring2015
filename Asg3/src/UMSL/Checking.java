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
    
    private double rate;
    double balance = getBal();
    int firstdate = getDateOne();
    int seconddate = getDateTwo();
    
//    public Checking (double begin_balance) 
//    {
//        balance = begin_balance;
//    } // End Initial Constructor
    
    public void getInterest() 
    {
        int datediff = seconddate - firstdate;
        rate = .05/365;
        double ratetime = Math.pow(1+rate,datediff);
        balance = balance * ratetime;
        firstdate = seconddate;
    }
    
}
