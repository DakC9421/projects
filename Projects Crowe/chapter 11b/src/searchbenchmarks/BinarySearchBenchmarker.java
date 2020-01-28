/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searchbenchmarks;

/**
 *
 * @author WCC
 */
/**
 The BinarySearchBenchmarker class performs a binary
 search on an int array and records the number of comparisons
 it makes.
 */

public class BinarySearchBenchmarker
{
    private int array[];      // Array of values to search
    private int comparisons;  // Number of comparisons made

    /**
     The constructor initializes the array and the
     comparisons counter.
     @param values The array to search.
     */

    public BinarySearchBenchmarker(int values[])
    {
        array = values;
        comparisons = 0;
    }

    /**
     The search method performs a binary search on array.
     The array is searched for the number passed to
     value. If the number is found, its array subscript is
     returned. Otherwise, -1 is returned indicating the
     value was not found in the array. The number of
     comparisons made is also recorded.
     @param value The value to search for.
     */

    public  int search(int value)
    {
        int first;       // First array element
        int last;        // Last array element
        int middle;      // Mid point of search
        int position;    // Position of search value
        boolean found;   // Flag

        // Set the inital values.
        first = 0;
        last = array.length - 1;
        position = -1;
        found = false;

        // Search for the value.
        while (!found && first <= last)
        {
            // Calculate mid point
            middle = (first + last) / 2;

            // If value is found at midpoint...
            comparisons++;
            if (array[middle] == value)
            {
                found = true;
                position = middle;
            }
            // else if value is in lower half...
            else if (array[middle] > value)
            {
                // If we made it inside this block, then
                // a comparison was made by the if statement
                // above and it was true.
                comparisons++;
                last = middle - 1;
            }
            // else if value is in upper half....
            else
            {
                // If we made it inside this block, then a
                // comparison was made by the previous if
                // statement and it was false.
                comparisons++;
                first = middle + 1;
            }
        }

        // Return the position of the item, or -1
        // if it was not found.
        return position;
    }

    /**
     getComparisons method
     @return The number of comparisons made.
     */

    public int getComparisons()
    {
        return comparisons;
    }
}
