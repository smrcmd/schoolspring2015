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
public class Student 
{
        private	String ID;
	private float Exam1;
	private float Exam2;
        private float Avg;
	
	public void setID(String s)
        {
		ID = new String(s);
	}

	public void setExam1(float e1)
        {
		Exam1 = e1;	
	}
	
	public void setExam2(float e2)
        {
		Exam2 = e2;	
	}

	public void showAll()
        {
		System.out.println();
		System.out.println("Student ID: " + ID);
		System.out.println("Exam 1: " + Exam1);
		System.out.println("Exam 2: " + Exam2);
                System.out.println("Average is:" + Avg);
		System.out.println();
	}
        
         public void calcAvg()
        {
            Avg = (Exam1 + Exam2)/2;
        }
        
        public void showGrades()
        {
        }
        
        public void calcLetterGrade()
        {   
            if(Avg>=90){
                //sumA++;
                System.out.println(Avg + " is an A");
	    }
            else if(Avg >= 70){
                //sumB++;
                System.out.println(Avg + " is a B");
            }
            else if(Avg >= 50){
                //sumC++;
                System.out.println(Avg + " is a C");
            }
            else if(Avg >= 35){
                //sumD++;
                System.out.println(Avg + " is a D");
            }
            else{
                //sumF++;
                System.out.println(Avg + " is an F");
            }
        }
}
