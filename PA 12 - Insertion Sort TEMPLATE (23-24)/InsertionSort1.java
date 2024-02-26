/** InsertionSort1
 *    sorts a "built-in"  array of doubles into ascending order using an insertion sort
 */

import java.util.*;

public class InsertionSort1
{
    
    public static void main(String[] args)
    {
        double  a[] = new double[ 10 ];      // the array
        
        for( int i=0; i < 10; i++)
            a[i] = 10*Math.random();
    
        System.out.println( "Initial List" );    
        printArray( a);
      
        insertionSort( a );                      // Sort list
    
        System.out.println( "Final List");    // Display Sorted List
        printArray( a );

    }
    
    /**
     * InsertionSort - Sorts an array of doubles into ascending order
     * @param x  the list of doubles
     * @return a array sorted in increasing order.
     */
    public static void insertionSort( double [] x)
    {
         // ADD CODE HERE
    }
   
    /**
     *  printArray -  Display an double array of "size" items as a single line
     *  @param x an array of doubles
     */
    public static void printArray( double[] x )
    {
        for( int i=0; i < x.length; i++)
           System.out.printf( "%.2f ", x[i]);
        System.out.println();
    }
}
