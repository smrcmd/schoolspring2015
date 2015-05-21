/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umslArrayExample;

/**
 *
 * @author Sophie
 */
public class Student {
        private	String ID;
	private float Exam1;
	private float Exam2;
        private float Avg;
	
	public void setID(String s){
		ID = new String(s);
	}

	public void setExam1(float e1){
		Exam1 = e1;	
	}
	
	public void setExam2(float e2){
		Exam2 = e2;	
	}
	
	public void showAll(){
		System.out.println();
		System.out.println("Student ID: " + ID);
		System.out.println("Exam 1: " + Exam1);
		System.out.println("Exam 2: " + Exam2);
                System.out.println("Average is:" + Avg);
		System.out.println();
	}
        
         public void calcAvg()
        {
            //return 
        }
        
        //public void showGrades()
        //{
            
        //}
       // public abstract void showGrades();

}
