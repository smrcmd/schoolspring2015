/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenctscc.codechallenge;

import java.util.Scanner;

/**
 *
 * @author Sophie
 */
public class Managers extends NumberOfEmployees {
    
    
    public int Managers () 
    {
        System.out.println("How many managers do you currently manage?");
        Scanner sc = new Scanner(System.in);
        managers = sc.nextInt();
        return(managers);
    }
    
}
