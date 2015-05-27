/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umslArrayExample;
import java.util.Scanner;
/**
 *
 * @author Sophie
 */
public class StudentArray {
    
	public static void main(String[] args)
        {
            StudentArray sa = new StudentArray();
            sa.runStudents();
        }
        
        public void runStudents()
        {
            String id;
            float ex1, ex2;
            Scanner kbd = new Scanner(System.in);
            Student[] sarray = new Student[2]; //creates 2 parking spots

            for(int i=0; i<sarray.length; i++)
            {
                    System.out.print("Enter ID#: ");
                    id = kbd.next();
                    System.out.print("Enter Exam 1: ");
                    ex1 = kbd.nextFloat();
                    System.out.print("Enter Exam 2: ");
                    ex2 = kbd.nextFloat();

                    //could pass all into sarray[i] by setting up a constructor with parameters
                    sarray[i] = new Student(id, ex1, ex2);	
//                    sarray[i].setID(id);
//                    sarray[i].setExam1(ex1);
//                    sarray[i].setExam2(ex2);
                    sarray[i].calcAvg();
                    sarray[i].calcLetterGrade();
            }
            
            System.out.println("Which student grade do you wish to see?");
            int input = kbd.nextInt();
            sarray[input].calcAvg();
            sarray[input].calcLetterGrade();
            sarray[input].showAll();
//            for(int i=0; i<sarray.length; i++)
//            {
//                    sarray[i].showAll();
//            }
            
//            Scanner in = new Scanner(System.in);
//            Student[] nextArray = new Student[2]; //creates 2 parking spots
//
//            for(int i=0; i<nextArray.length; i++)
//            {
//                    System.out.print("Enter ID#: ");
//                    id = in.next();
//                    System.out.print("Enter Exam 1: ");
//                    ex1 = in.nextFloat();
//                    System.out.print("Enter Exam 2: ");
//                    ex2 = in.nextFloat();
//
//                    nextArray[i] = new Student();	
//                    nextArray[i].setID(id);
//                    nextArray[i].setExam1(ex1);
//                    nextArray[i].setExam2(ex2);
//                    nextArray[i].calcAvg();
//                    nextArray[i].calcLetterGrade();
//            }
//
//            for(int i=0; i<nextArray.length; i++)
//            {
//                    nextArray[i].showAll();
//            }
    }
}// end class StudentArray


