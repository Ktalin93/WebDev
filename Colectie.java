
public class Colectie {
	
	//SQUARE - returneaza patratul lui i
	public static  int square(int n){
		return n*n;
	}
	
	//nFACT - returneaza i factrial (i!)
	public static int nFact(int n){
		if(n < 0)
			return -1;
		else
		if(n == 0)
			return 1;
		else
			return n*nFact(n-1);
			
			
	}	
	
	//nSUM - returneaza rezultatul sumei 1+2+3+..+i
	public static int nSum(int n){
		if(n < 0)
			return -1;
		else
		if(n == 0)
			return 0;
		else
			return n+nSum(n-1);
			
			
	}
	
	//ABS- returneaza modulul lui i
	public static int abs(int n){
		if(n < 0)
			return -n;
		return n;
	}
	
	//MULT_TEN - returneaza i*10
	public static int mult_ten(int i){
		return i*10;
	}
	
	//ADD_FIVE - returneaza i+5
	public static int add_five(int i){
		return i+5;
	}
	
	//DIV_THREE - returneaza catul impartirii i/3
	public static int div_three(int i){
		return i/3;
	}
	
	//SUB_NINE - returneaza i-9
	public static int sub_nine(int i){
		return i-9;
	}
	

}
