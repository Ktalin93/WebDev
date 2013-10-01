/* Clasa Colectie contine urmatoarele functii:
 * SQUARE - returneaza patratul lui i
 * nFACT - returneaza i factrial (i!)
 * nSUM - returneaza rezultatul sumei 1+2+3+..+i
 * ABS- returneaza modulul lui i
 * ADD_FIVE - returneaza rezultatul expresiei i+5
 * SUB_NINE - returneaza i-9
 * MULT_TEN - returneaza i*10
 * DIV_THREE - returneaza catul impartirii i/3
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class WebDev {
	public static void citire() throws NumberFormatException, IOException {
		BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Intorduceti valoare lui  i: ");
		int i=Integer.parseInt(bufferedReader.readLine());
		System.out.println("Urmatorul set de functii se va aplicaca valorii i");
		System.out.println("I) [ nFACT , ADD_FIVE, MULTIPLY_TEN, nSUM]");
	    	System.out.println("[ "+ Colectie.nFact(i)+" , "+ Colectie.add_five(i) + " , "
					+ Colectie.mult_ten(i)+ " , "+ Colectie.nSum(i)+"]");
		System.out.println("II) [SQUARE , ABS]");
	    	System.out.println("[ "+ Colectie.square(i)+" , "+ Colectie.abs(i) +"]");
		System.out.println("III) [SUB_NINE , DIV_THREE]");
		System.out.println("[ "+Colectie.sub_nine(i) + ","+ Colectie.div_three(i) +"]");

	}
	public static void main(String[] args) {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		boolean  rep=false;
		do {
			try {
				citire();
				System.out.println("Doriti sa introduceti o alta valoare[Y/N] ?");
				if(br.readLine().toString().toUpperCase().startsWith("Y"))
					rep=true;
				else
					rep=false;
				
			} catch (NumberFormatException e) {
				System.out.println("Nu ati introdus un numar !");
			} catch (IOException e) {
				e.printStackTrace();
			}}  while(rep);
		

	}

}
