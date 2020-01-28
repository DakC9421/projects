
package chargeit;
import javax.swing.JOptionPane;
/**
 *
 * @author WCC
 */

// DDDDDD      000000          NN      NN     000000      TTTTTTTTTT
// DD    DD   00     00        NNNN    NN    00     00        TT
// DD    DD  00       00       NN NN   NN   00       00       TT
// DD    DD   00     00        NN  NN  NN    00     00        TT
// DDDDDDD     000000          NN   NNNNN     000000          TT
//
// MM        MM     000000     DDDDDDD     II  FFFFFFFFF  YY      YY
// MMM      MMM   00      00   DD    DD    II  FF          YY    YY
// MMMM    MMMM  00        00  DD     DD   II  FF           YY  YY
// MM MM  MM MM  00        00  DD      DD  II  FFFFFFF       YYYY
// MM  MMMM  MM  00        00  DD     DD   II  FF             YY
// MM        MM   00      00   DD    DD    II  FF             YY
// MM        MM     000000     DDDDDDD     II  FF             YY

public class ChargeIt
{
    public static void main(String[] args)
    {
        String input;        // To hold keyboard input
        int accountNumber;   // Account number to validate

        // Create a Validator object.
        Validator val = new Validator();

        // Get a charge account number.
        input = JOptionPane.showInputDialog("Enter your charge account number: ");
        accountNumber = Integer.parseInt(input);

        // Determine whether it is valid.
        if (val.isValid(accountNumber))
            JOptionPane.showMessageDialog(null, "That's a valid account number.");
        else
            JOptionPane.showMessageDialog(null, "That's an INVALID account number.");

        System.exit(0);
    }
}
