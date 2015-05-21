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
public class Arrays 
{
    
    public static void main(String[] args) 
    {
        int[] scores = {5, 5, 12, 17, 11};
        Arrays a1 = new Arrays();
        float avg = a1.averData(scores, scores.length);
        System.out.println("Average score: " + avg ); 
    }
        
    float averData(int[]  numbers, int size) 
    {
        int i, sum;
        for(i=0, sum=0; i<size; i++) 
        {
            System.out.println( "score " + (i+1) + " = " + numbers[i] );
            sum += numbers[i];
        }

        return ( (float) sum / i );
    }
}


