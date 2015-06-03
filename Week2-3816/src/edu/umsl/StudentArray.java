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
           Scanner sc = new Scanner(System.in);
           StudentArray sa = new StudentArray();
           int input = -99;
           do{
           System.out.println("1) populate students");
           System.out.println("2) lookup student by id");
           System.out.println("3) exit");
           input = sc.nextInt();
           if(input == 1)
           {    
            sa.populateStudents();
           }
           else if(input == 2)
           {
               sa.lookupStudents();
           }
           else
           {
               System.exit(0);
           }
           }while(input != 3);
    }
        
    public void populateStudents()
    {
            String id_holdinput;

            Scanner sc = new Scanner(System.in);
            for(int i=0; i<sarray.length; i++)
            {

                System.out.println("Please enter if you are a Grad or UnderGrad [G or UG]");

                String input = sc.next();

                if(input.equalsIgnoreCase("G"))
                {
                    sarray[i] = new GradStudent();
                    System.out.println("Please enter your id number[first name and last initial]: ");
                    String local_id = sc.next();
                    sarray[i].setID(local_id);
                }
                else if(input.equalsIgnoreCase("UG"))
                {
                    sarray[i] = new Undergrad();  
                    System.out.println("Please enter your id number[first name and last initial]: ");
                    String local_id = sc.next();
                    sarray[i].setID(local_id);
                } 
                else
                {
                    sarray[i] = new Student();
                    System.out.println("Please enter your id number[first name and last initial]: ");
                    String local_id = sc.next();
                    sarray[i].setID(local_id);
                }
}

    }
    public void lookupStudents()
    {
        float ex1_holdinput, ex2_holdinput;
        Scanner sc = new Scanner(System.in);

                System.out.println("Please enter your ID so we can look you up:");
                String secondinput = sc.next();
                int index = -1;
                for(int i = 0; i < sarray.length; i++)
                {

                    if(sarray[i].getID().equalsIgnoreCase(secondinput))
                    {
                        index = i;
                    }
                }
                  //int x = sc.nextInt();
                System.out.print("Enter Exam 1: ");
                ex1_holdinput = sc.nextFloat();
                System.out.print("Enter Exam 2: ");
                ex2_holdinput = sc.nextFloat();

                  //String xx = Integer.toString(x);

                  //sarray[index].setID(local_id);
                if(index == -1)
                {
                    System.out.println("We didn't find your record, please contact system administrator");
                }
                else
                {
                    sarray[index].setExam1(ex1_holdinput);
                    sarray[index].setExam2(ex2_holdinput);
                    sarray[index].showAll();
                } 

                    //sarray[x].
                    //sarray[x].average(); 

    }
 
}// end class StudentArray 

//public class StudentArray
//{
//	Student[] sarray = new Student[3];
//    
//        public static void main(String[] args)
//        {
//
//               StudentArray sa = new StudentArray(); 
//               sa.runStudents();
//
//	}
//        
//        public void runStudents()
//        {
//                String id_holdinput;
//		float ex1_holdinput, ex2_holdinput;
//                Scanner sc = new Scanner(System.in);
//                int x = 0;
//
//		for(int i=0; i<sarray.length; i++)
//                {
//      
//                        System.out.println("Please enter if the student is a Grad or UnderGrad [G or UG]");
//                        
//                        String input = sc.next();
//                    
//			if(input.equalsIgnoreCase("G"))
//                        {
//                            sarray[i] = new GradStudent();
//                            assignID();
//
//                        }
//                        else if(input.equalsIgnoreCase("UG"))
//                        {
//                            sarray[i] = new Undergrad(); 
//                            assignID();
//                        } 
//                        else
//                        {
//                            sarray[i] = new Student();
//                            assignID();
//                        }
//		}
//
//                        System.out.println("Please enter the student account you want to access [0, 1, 2]: ");
//                        x = sc.nextInt();                       
//
//                        if (x<=2)
//                        {
//                            System.out.print("Enter Exam 1: ");
//                            ex1_holdinput = sc.nextFloat();
//                            System.out.print("Enter Exam 2: ");
//                            ex2_holdinput = sc.nextFloat();
//                            sarray[x].setExam1(ex1_holdinput);
//                            sarray[x].setExam2(ex2_holdinput);
//                            sarray[x].showAll();
//                        } 
//                        else
//                        {
//                            System.out.println("You did not enter a valid student ID.");
//                        }
//                        
//                        //sarray[x].
//                        //sarray[x].average(); 
//                
//        }
//        
//        public void assignID()
//        {
//            System.out.println("Please enter the id number [0, 1, 2]: ");
//            Scanner sc = new Scanner(System.in);
//            int x = sc.nextInt();
//            String xx = Integer.toString(x);
//            sarray[x].setID(xx);
//        }
//	
//}// end class StudentArray	
