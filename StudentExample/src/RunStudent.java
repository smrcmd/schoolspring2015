/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sophie
 */
public class RunStudent {
    public static void main(String args[])
    {
        Student Sophie = new Student("Sophie", "Russo", 90, 85);
        Sophie.myAverage();
        Sophie.getlettergrade();
        Sophie.showResults();
        
        Student Damon = new Student("Damon", "Rockefeller", 100, 90);
        Damon.myAverage();
        Damon.getlettergrade();
        Damon.showResults();
    }
}
