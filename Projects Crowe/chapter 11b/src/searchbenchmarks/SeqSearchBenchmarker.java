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
 The SeqSearchBenchmarker class performs a sequential
 search on an int array and records the number of comparisons
 it makes.
 */

public class SeqSearchBenchmarker
{
    private int array[];      // Array of values to search
    private int comparisons;  // Number of comparisons made

    /**
     The constructor initializes the array and the
     comparisons counter.
     @param values The array to search.
     */

    public SeqSearchBenchmarker(int values[])
    {
        array = values;
        comparisons = 0;
    }

    /**
     The search method searches array for a value.
     @param value The value to search for.
     @return The subscript of the value if found in the
     array, otherwise -1.
     */

    public int search(int value)
    {
        int index;        // Loop control variable
        int position;     // Position the value is found at
        boolean found;    // Flag indicating search results

        // Element 0 is the starting point of the search.
        index = 0;

        // Store the default values position and found.
        position = -1;
        found = false;

        // Search the array.
        while (!found && index < array.length)
        {
            comparisons++;
            if (array[index] == value)
            {
                found = true;
                position = index;
            }
            index++;
        }

        // Return the found element's position,
        // or -1 if not found.
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