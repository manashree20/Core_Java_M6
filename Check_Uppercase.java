/*  A program to  check if the given Alphabet is in upper case or lower case */

package Java_Program;


public class Check_Uppercase {

	public static void main(String[] args) {
		char ch='A';
		
		String Result = (ch>=65&&ch<90)?("The given char is in Uppercase"):("The given char is in Lowercase");
		
		System.out.println(Result);

	}

}
