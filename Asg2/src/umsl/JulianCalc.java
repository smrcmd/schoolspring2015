/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umsl;
import java.util.*;
/**
 *
 * @author Sophie
 */
public class JulianCalc {
    public double JulianCalc(String today)
    {
        int month = 0;
        int day = 0;
        int year = 0;
        int julianMonth = 0;
        int julianDate1 = 0;
        int counter = 0;
        int num;
        StringTokenizer mytokenizer = new StringTokenizer(today, "/");

        while(mytokenizer.hasMoreTokens())
        {
            num = Integer.parseInt(mytokenizer.nextToken());
            counter++;
            if (counter == 1)
            {
                month = num;
            }
            else if (counter == 2)
            {
                day = num;
            }
            else
            {
                year = num;
            }
        }
        
        switch (month)
        {
            case 2:
            {
                julianMonth = 31;
                break;
            }
            case 3:
            {
                julianMonth = 59;
                break;
            }
            case 4:
            {
                julianMonth = 90;
                break;
            }
            case 5:
            {
                julianMonth = 120;
                break;
            }
            case 6:
            {
                julianMonth = 151;
                break;
            }
            case 7:
            {
                julianMonth = 181; 
                break;
            }
            case 8:
            {
                julianMonth = 212;
                break;
            }
            case 9: 
            {
                julianMonth = 243;
                break;
            }
            case 10:
            {
                julianMonth = 273;
                break;
            }
            case 11:
            {
                julianMonth = 304;
                break;
            }
            case 12:
            {
                julianMonth = 334;
                break;
            }
        }
        
        julianDate1 = julianMonth + day;
        System.out.println(" ");
        return(julianDate1);
    }
}
