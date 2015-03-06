 
package umsl;

import java.util.Scanner;
import java.util.StringTokenizer;


public class VariousMethods 
{
   /* public static void main(String[] args)
    {
        VariousMethods vm = new VariousMethods();
        float tempProduct = vm.product();
        float tempMinMaxAvg = vm.minMaxAvg();
        float tempMyGrader = vm.myGrader();
    }
    */
    public float product()
    {
    
        float number, count = 0, total = 1;
        Scanner in = new Scanner(System.in);
         
        System.out.print("Enter a whole number, and 0 to quit: ");
        number = in.nextInt(); 

        while (number != 0)
        { 
            if (number > 0)
            {
                count++; 
                total *= number; 
                System.out.print("Enter a whole number, and 0 to quit: ");
                number = in.nextInt(); 
            }
            else
            {
                System.out.print("Enter a whole number, and 0 to quit: ");
                number = in.nextInt(); 
            }
        } 
        
        System.out.println("You keyed in " + count + " numbers.");
        System.out.println("The product  is: " + total);
        return(total);
    }
    
    public float findTwelves()
    {
        int twelves = 0;
        int counter = 0;
        boolean instance;
        int firstInstance=0;
        int lastInstance=0;
        
        System.out.println("Please enter a series of numbers:");
        Scanner in = new Scanner(System.in);
        String myline = in.nextLine();
        StringTokenizer mytokenizer = new StringTokenizer(myline);
        
        while(mytokenizer.hasMoreTokens())
        {
            String temp;
            temp = mytokenizer.nextToken();
            counter++;
            
            if(temp.equalsIgnoreCase("12"))
            {
             twelves++;
             if(twelves == 1)//this is right don't change it
             {
                 firstInstance = counter;//this is right don't change it
                 lastInstance = counter; //covers if there is only 1 twelve
             }
             else
             {
                 lastInstance = counter;
             }
            }
        }
        System.out.println(twelves + " twelves in the series.");
        System.out.println("The first instance of 12 is at " + firstInstance);
        System.out.println("The last instance of 12 is at " + lastInstance);
        return(twelves);
    }
    
    public float minMaxAvg()
    {
        int num = 0;
        int newnum = 0;
        float avg = 0; 
        int count = 0; 
        int total = 0; 
        int min = 0; 
        int max = 0;
        Scanner in = new Scanner(System.in);
         
        System.out.print("Enter a whole number, and -1 to quit: ");
        num = in.nextInt(); 
        count++;
        total += num;
        max = num;
        min = num;
        System.out.print("Enter a whole number, and -1 to quit: ");
        newnum = in.nextInt();

        while (newnum != -1)
        { 
            count++;
            total += newnum;
            
            if (newnum > max)
            {
                max = newnum;
                System.out.print("Enter a whole number, and -1 to quit: ");
                newnum = in.nextInt(); 
            }
            else if (newnum < min)
            {
                min = newnum;
                System.out.print("Enter a whole number, and -1 to quit: ");
                newnum = in.nextInt(); 
            }
            else
            {
                System.out.print("Enter a whole number, and -1 to quit: ");
                newnum = in.nextInt(); 
            }
        } 
        avg = total / count;
        System.out.println("You keyed in " + count + " numbers.");
        System.out.println("The average  is: " + avg);
        System.out.println("The minimum number is " + min);
        System.out.println("The maximum number is " + max);
        return(min);
    }
    
    float myGrader()
    {
        int gradeA = 0;
        int gradeB = 0;
        int gradeC = 0;
        int gradeD = 0;
        int gradeF = 0;
        int grades[] = {63, 75, 72, 72, 78, 67, 80, 63, 0, 90, 89, 43, 59, 99, 82, 12, 100, 75 };
        
        System.out.println("There are " +  grades.length + " grades in the list.");
        for(int grade = 0; grade < grades.length; grade++) 
            if (grades[grade] >= 90)
            {
                System.out.println(grades[grade] + " is an A.");
                gradeA++;
            }
            else if (grades[grade] >= 80)
            {
                System.out.println(grades[grade] + " is a B.");
                gradeB++;
            }
            else if (grades[grade] >= 70)
            {
                System.out.println(grades[grade] + " is a C.");
                gradeC++;
            }
            else if (grades[grade] >= 60)
            {
                System.out.println(grades[grade] + " is a D.");
                gradeD++;
            }
            else 
            {
                System.out.println(grades[grade] + " is an F.");
                gradeF++;
            }
        System.out.println("There are " + gradeA + " A's in the array.");
        System.out.println("There are " + gradeB + " B's in the array.");
        System.out.println("There are " + gradeC + " C's in the array.");
        System.out.println("There are " + gradeD + " D's in the array.");
        System.out.println("There are " + gradeF + " F's in the array.");
        return(gradeA);
    }
}
