/*  Check Buzz Number
 *  Buzz Number = 1.The number is divisible by 7
 *                2.or last digit of that number is 7
 * */

package Java_Program;

public class Buzz_Number {

	public static void main(String[] args) {
		
		int number = 99;
		
		String Result = (number %7==0 || number%10==7)?("The given number is BUZZ Number"):("The given number is not a buzz number");
		
		System.out.println(Result);
	}

}
