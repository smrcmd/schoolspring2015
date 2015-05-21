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
    
	public static void main(String[] args){
		String id;
		float ex1, ex2;
		Scanner kbd = new Scanner(System.in);
		Student[] sarray = new Student[3]; //creates 3 parking spots
		
		for(int i=0; i<sarray.length; i++){
			System.out.print("Enter ID#: ");
			id = kbd.next();
			System.out.print("Enter Exam 1: ");
			ex1 = kbd.nextFloat();
			System.out.print("Enter Exam 2: ");
			ex2 = kbd.nextFloat();
		
			sarray[i] = new Student();	
			sarray[i].setID(id);
			sarray[i].setExam1(ex1);
			sarray[i].setExam2(ex2);
		}

		for(int i=0; i<sarray.length; i++){
			sarray[i].showAll();
		}
	}
}// end class StudentArray


