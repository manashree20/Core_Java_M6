/*  A program to  check if the given character is alphabet and is in upper case or lower case */


package Java_Program;

public class Check_Alphabet_Case {

	public static void main(String[] args) {
		char ch ='@';
		
		String Result=(ch>=65 && ch<=90 || ch>=97 && ch<=122)?(( ch>=65 && ch<=90)?("This alphabet is in Uppercase"):
			("This alphabet is in Lower case")):("This is special character or not an alphabet");
		
		System.out.println(Result);
	

	}

}
