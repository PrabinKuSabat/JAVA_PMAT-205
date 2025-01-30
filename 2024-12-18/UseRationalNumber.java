/**
 * Uses the Rational Number class to create a Rational Number using user input and prints
 * out its GCD, Reduced fraction, doubleValue and multiply, divide, add and subtract with “6/7” rational number.
 * 
 * @author Prabin-24010203007
 */

public class UseRationalNumber {
   /**
     * Main function to perform all the available operations, on a user given Rational Number,
     * and print all of them.
     * @param args Arguments given to with the file while execution
     */
    public static void main(String[] args) {
        //Stores the user defined numerator and denominator values.
        int numerator = Validator.getInt("Please enter the numerator: ");
        int denominator = Validator.getInt("Please enter the denominator: ");
       
        //Created a new RationalNumber with the user defined numerator and denominator. 
        RationalNumber rn = new RationalNumber(numerator,denominator);     
        RationalNumber trial = new RationalNumber(6,7);
        
        //Printing all the results from the available operations (when performed with 6/7)
        {   
            
            System.out.println("");
            System.out.println("Reduced value of given RationalNumber: " + rn.toString());
            System.out.println("Gcd of the given RationalNumber: " + rn.getGcd());
            System.out.println("Double Value of the given RationalNumber: " + rn.getDoubleValue());
            System.out.println("Multiplication with " + trial.toString() + " gives: " + rn.multiply(trial));
            System.err.println("Dividing with " + trial.toString() + " gives: " + rn.divide(trial));
            System.err.println("Sum with " + trial.toString() + " gives: " + rn.add(trial));
            System.err.println("Subtracting with " + trial.toString() + " gives: " + rn.subtract(trial));
        }
   }
}
