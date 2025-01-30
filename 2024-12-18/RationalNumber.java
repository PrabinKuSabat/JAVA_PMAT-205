

/**
 * A rational number given by a numerator and denominator.
 *
 * @author Prabin_24010203007
 */
public class RationalNumber {

	/**
	 * The numerator is given as an integer number.
	 * It is always 0 if this RationalNumber is 0.
	 */
	private int numerator;

	/**
	 * The denominator is given as an integer number greater than zero.
	 * It is always 1 if this RationalNumber is 0.
	 */
	private int denominator;
	
	//Stores the gcd of the numerator and denominator
	private int gcd;
	//protected int testValue=12;
	
	/**
	 * creates a new Rational Number
	 * (Default Constructor)
	 */
	public RationalNumber(){
		this (0);
	}

	/**
	 * creates a new RationalNumber with given numerator
	 * @param num an arbitary integer number
	 */
	public RationalNumber(int num){
		this (num,1);
	}

	/**
	 * Creates a new RationalNumber with given numerator and denominator.
	 * @param num an arbitry integer number
	 * @param den an integer not equal to zero
	 */
	public RationalNumber(int num, int den) {
		this.numerator = num;
		if (num == 0) {
			denominator = 1;
		}
		if (den == 0) {
			throw new RuntimeException("Denominator is Zero");
		}else{
			this.denominator = den;
		}
		reduceFraction();
	}

	/**
	 * Returns the greates common divisor of two positive integer numbers.
	 */
	private int getGcd(int p, int q) {
			p = Math.abs(p);
			q = Math.abs(q);
			int r = p%q;
			while (r > 0) {
				p = q;
				q = r;
				r = p%q;
			}
			//System.out.println("GCD::"+q);
			return q;
	}

	/**
	 * Reduces the fraction of numerator and denominator by their
	 * greatest common divisor.
	 */
	private void reduceFraction() {
		this.gcd = getGcd(Math.abs(numerator), denominator);
		//int num, den;

		if (gcd > 0) {
			numerator = numerator / gcd;
			denominator = denominator / gcd;

		}

	}

	/**
	 * Returns the gcd of the numerator and the denominator
	 * @return gcd of numerator and denominator
	 */
	public int getGcd(){
		return this.gcd;
	}

	/**
	 * Adds the given <code>rationalNumber</code> to this RationalNumber
	 * and returns the sum as a new RationalNumber.
	 *@param rn RationalNumber to be added to this RationalNumber
	 *@return a new RaionalNumber denoting the sum of the two RationalNumbers
	 */
	public RationalNumber add(RationalNumber rn){
		//using the formula : a/b + c/d = (a*d+c*b) / b*d
		int newNumerator = this.numerator*rn.denominator + this.denominator*rn.numerator;
		int newDenominator = this.denominator*rn.denominator;
		
		return  new RationalNumber(newNumerator, newDenominator);
	}

	/**
	 * Multiplies the given <code>RationalNumber</code> to this RationalNumber
	 * and returns the multiplied value as a new Rational Number.
	 * @param rn RationalNumber to be multiplied to this RationalNumber
	 * @return a new RationalNumber denotiong the multiplication of the two RationalNumbers
	 */
	public RationalNumber multiply(RationalNumber rn){
		//using the formula : (a/b) * (c/d) = (a*c) / (b*d)
		int newNumerator = this.numerator * rn.numerator;
		int newDenominator = this.denominator * rn.denominator;

		return new RationalNumber(newNumerator, newDenominator);
	}

	/**
	 * Subtracts the given <code>RationalNumer</code> to this RationalNumber
	 * and returns the subtracted value as a new Rational Number.
	 * @param rn RationalNumber to be subtracted from this RationalNumber
	 * @return a new RationalNumber denotiong the multiplication of the two RationalNumbers
	 */
	public RationalNumber subtract(RationalNumber rn){
		//using the formula : a/b - c/d = (a*d - b*c)/b*d
		int newNumerator = this.numerator * rn.denominator - this.denominator * rn.numerator;
		int newDenominator = this.denominator * rn.denominator;

		return new RationalNumber(newNumerator, newDenominator);
	}

	/**
	 * Divides the given <code>RationalNumber</code> to this RationalNumber
	 * and returns the division result.
	 * @param rn RationalNumber to de divide by
	 * @return a new RationalNumber obtained using 'reciprocal method'
	 */
	public RationalNumber divide(RationalNumber rn){
		//using the 'reciprocal' method
		RationalNumber reciprocalRn = rn.reciprocal();

		//Multiply the current RationalNumber with the reciprocal
		return this.multiply(reciprocalRn);
		
	}

	/**
	 * Returns the reciprocal of this RationalNumber.
	 * @return a new RationalNumber denoting the Reciprocal of this RationalNumber
	 */
	public RationalNumber reciprocal() {
		//The reciprocal of a/b is b/a
		return new RationalNumber(this.denominator, this.numerator);
	}

	/**
	 * Returns the string representation of the object.
	 * @return string representation of this RationalNumber
	 */
	public String toString() {
		if(this.denominator == 1){
			return Integer.toString (this.numerator);
		}

		return numerator + "/" + denominator;
	}


	/**
	 * Returns the denominator of this RationalNumber.
	 * @return denominator
	 * ? It is zero, if this RationalNumber is zero.
	 */
	public int getDenominator() {
		return denominator;
	}

	/**
	 * Returns the numerator of this RationalNumber.
	 * @return  numerator
	 */
	public int getNumerator() {
		return numerator;
	}

	/**
	 * Returns the value of this RationalNumber as a double value.
	 * @return value of this RatioalNumber as a double
	 */
	public double getDoubleValue() {
		return (double) numerator / (double) denominator;
	}

}
