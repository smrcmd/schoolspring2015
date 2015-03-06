/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umsl;
import java.util.Scanner;


public class VariousMethodsMenu 
{

    public static void main(String[] args)
    
    {
        int choice;
        VariousMethods vm = new VariousMethods();
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the number for the method you wish to run. ");
        
    do 
        {
            System.out.println("1) Product");
            System.out.println("2) Find Twelves");
            System.out.println("3) Min Max Average");
            System.out.println("4) Grades");
            System.out.println("5) Exit");
            choice = in.nextInt();

        if(choice == 1)
        {
            float tempProduct = vm.product();
            //System.out.println("Please enter the number for the method you wish to run. ");
            //num = in.nextInt();
        }
        else if (choice == 2)
        {
            float tempfindTwelves = vm.findTwelves();
            //System.out.println("Please enter the number for the method you wish to run. ");
            //num = in.nextInt();
        }
        else if (choice == 3)
        {
            float tempminMaxAvg =vm.minMaxAvg();
            //System.out.println("Please enter the number for the method you wish to run. ");
            //num = in.nextInt();
        }
        else if (choice == 4)
        {
            float tempmyGrader = vm.myGrader();
            //System.out.println("Please enter the number for the method you wish to run. ");
            //num = in.nextInt();
        }
    
    }while(choice != 5);
    }
}
