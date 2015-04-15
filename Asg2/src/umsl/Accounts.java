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
public class Accounts {
        private	String accountID;
	private float AccountBalance;
	private float AccountInterest;
	
	public void setaccountID(String s){
		accountID = new String(s);
	}

	public void setAccountBalance(float b1){
		AccountBalance = b1;	
	}
	
	public void setAccountInterest(float b2){
		AccountInterest = b2;	
	}
	
	public void showAll()
        {
		System.out.println();
		System.out.println("Student ID: " + accountID);
		System.out.println("Exam 1: " + AccountBalance);
		System.out.println("Exam 2: " + AccountInterest);
		System.out.println();
	}
}
