
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class WebDev {
	
	public static void main(String[] args) {
		BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
		int i;
		System.out.print("Intorduceti valoare lui  i: ");
		try {
			 i=Integer.parseInt(bufferedReader.readLine());
			 System.out.println("Urmatorul set de functii se va aplicaca valorii i");
			 System.out.println("I) [ nFACTORIAL , ADD_FIVE, MULTIPLY_TEN, nSUM]");
			 System.out.println("[ "+ Colectie.nFact(i)+" , "+ Colectie.add_five(i) + " , "
						+ Colectie.mult_ten(i)+ " , "+ Colectie.nSum(i)+"]");
			 System.out.println("II) [SQUARE , ABS_VAL]");
			 System.out.println("[ "+ Colectie.square(i)+" , "+ Colectie.abs(i) +"]");
		} catch (NumberFormatException e) {
			System.out.println("Nu ati introdus un numar !");
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
