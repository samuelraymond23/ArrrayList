public class TermClass {
	//establish integers
	private int coef, expo;
	//Constructor with two parameters
	public TermClass(int coef, int expo){
		// Declared instances of each parameter
		this.coef = coef;
		this.expo = expo;
	} // Method to return each case using if statements 
	public String toString(){
		if(expo == 0){
			//changes the integer coef to a string
			String newcoef = Integer.toString(coef);
			return (newcoef);
		}
		else if(expo == 1){
			return (coef + "x");
		}
		else {
			return(coef + "x" + "^" + expo);
		}
		
	}
}