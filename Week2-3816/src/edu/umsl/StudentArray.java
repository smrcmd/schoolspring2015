/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.umsl;
import java.io.*;
import java.util.*;
/**
 *
 * @author lawtonb
 */
public class StudentArray
{
	Student[] sarray = new Student[3];
    
        public static void main(String[] args)
        {

               StudentArray sa = new StudentArray(); 
               sa.runStudents();

	}
        
        public void runStudents()
        {
                String id_holdinput;
		float ex1_holdinput, ex2_holdinput;
                Scanner sc = new Scanner(System.in);
                int x = 0;

		for(int i=0; i<sarray.length; i++)
                {
      
                        System.out.println("Please enter if the student is a Grad or UnderGrad [G or UG]");
                        
                        String input = sc.next();
                    
			if(input.equalsIgnoreCase("G"))
                        {
                            sarray[i] = new GradStudent();
                            System.out.println("Please enter the id number [0, 1, 2]: ");
                            x = sc.nextInt();
                        }
                        else if(input.equalsIgnoreCase("UG"))
                        {
                            sarray[i] = new Undergrad(); 
                            System.out.println("Please enter the id number [0, 1, 2]: ");
                            x = sc.nextInt();
                        } 
                        else
                        {
                            sarray[i] = new Student();
                            System.out.println("Please enter the id number [0, 1, 2]: ");
                            x = sc.nextInt();
                        }
		}

                        System.out.println("Please enter the student account you want to access [0, 1, 2]: ");
                        x = sc.nextInt();
//                        
                        if (x<=2)
                        {
                            System.out.print("Enter Exam 1: ");
                            ex1_holdinput = sc.nextFloat();
                            System.out.print("Enter Exam 2: ");
                            ex2_holdinput = sc.nextFloat();
                            String xx = Integer.toString(x);
                            sarray[x].setID(xx);
                            sarray[x].setExam1(ex1_holdinput);
                            sarray[x].setExam2(ex2_holdinput);
                            sarray[x].showAll();
                        } 
                        else
                        {
                            System.out.println("You did not enter a valid student ID.");
                        }
                        
                        //sarray[x].
                        //sarray[x].average(); 
                
        }
	
}// end class StudentArray	
