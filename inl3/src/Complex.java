public class Complex {
	private double re;
	private double im;

	/** Skapar en komplex variabel med realdelen re och imagin�rdelen im */
	Complex(double re, double im) {
		this.re = re;
		this.im = im;
	}

	/** Tar reda p� realdelen */
	double getRe() {
		return re;
	}

	/** Tar reda p� imagin�rdelen */
	double getIm() {
		return im;
	}

	/** Tar reda p� talets absolutbelopp i kvadrat */
	double getAbs2() {
		return Math.pow(re, 2) + Math.pow(im, 2); // Metoden returnerar v�rdet
													// av det f�rsta argumentet
													// upph�jt till det andra.
													// Dvs (re+im)^2.
	}

	/** Adderar det komplexa talet c till detta tal */
	void add(Complex c) {
		im += c.getIm();
		re += c.getRe();
	}

	/** Multiplicerar detta tal med det komplexa talet c */
	void mul(Complex c) {
		double real = getRe() * c.getRe() - getIm() * c.getIm();
		im = getRe() * c.getIm() + getIm() * c.getRe();
		re = real;
	}

}