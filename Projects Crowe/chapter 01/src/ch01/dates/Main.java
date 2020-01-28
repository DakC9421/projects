package ch01.dates;
//Java import
import java.util.Scanner; import ch01.dates.*;

public class Main {

    public static void main(String[] args) {
        //Scanner
        Scanner scan = new Scanner(System.in);
        //integers of the Year, Month, and Day
        int day, month, year;

        //Testing "Date prompt and Excep."
        System.out.println("Enter in the date.");
        System.out.println();
        System.out.println("**Exception**");
        System.out.println("The current date can not be before " + Date.MINYEAR + ".");
        System.out.println();
       //Entry of first date
       System.out.print("Enter in the first date.");
       //ints. into inputs
        month = scan.nextInt();
        day = scan.nextInt();
        year = scan.nextInt();
        //into Date d1
        Date d1 = new Date(month, day, year);
        //Entry of second date
        System.out.print("Enter in the second date.");
        //ints. into inputs
        month = scan.nextInt();
        day = scan.nextInt();
        year = scan.nextInt();
        Date d2 = new Date (month, day, year);
        //if statement
        if ((d1.getYear() <= Date.MINYEAR) || (d2.getYear() <= Date.MINYEAR))
            System.out.println("ERROR: Date is less than or equal to" + Date.MINYEAR + ".");
        //else statement
        else
        {
            System.out.println("The number of days between");
            System.out.print(d1 + " and " + d2 + " is ");
            System.out.println(Math.abs(d1.lilian() - d2.lilian()));
        }

    }
}
