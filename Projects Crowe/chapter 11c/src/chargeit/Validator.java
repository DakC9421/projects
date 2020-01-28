package chargeit;

/**
 *
 * @author WCC
 */
public class Validator
{
    // Array of valid numbers
    private int[] valid = { 5658845, 4520125, 7895122, 8777541,
            8451277, 1302850, 8080152, 4562555,
            5552012, 5050552, 7825877, 1250255,
            1005231, 6545231, 3852085, 7576651,
            7881200, 4581002 };

    /**
     The isValid method uses a sequential search
     to determine whether a number appears in
     the array of valid numbers.
     @param number The number to search for.
     @return true if the number is found, false
     otherwise.
     */

    public boolean isValid(int number)
    {
        boolean found = false;  // Flag

        //******************************************************************************
        //******************************************************************************
        //**   ADD CODE HERE TO IMPLEMENT A SEQUENTIAL OR LINEAR SEARCH ON INTEGERS   **
        //**   DEVELOP JAVA CODE THAT WILL RETURN TRUE OR                             **
        //**   FALSE DEPENDING ON IF THE SEARCH VALUE IS IN THE ARRAY                 **
        //**   OF VALID NUMBERS                                                       **
        //******************************************************************************
        //******************************************************************************
        int index;        // Loop control variable

        // Element 0 is the starting point of the search.
        index = 0;

        // Store the default values position and found.

        found = false;

        // Search the array.
        while (!found && index < valid.length)
        {

            if (valid[index] == number)

                found = true;


            index++;
        }


        return found;
    }
}