//print School Marksheet

package Java_Program;

public class School_Marksheet {

	public static void main(String[] args) {
		// Declare all variables 
		// 1.define marks of subjects
				int Eng_Marks=87;
				int Mar_Marks=90;
				int Maths_Marks=85;
				int Sci_Marks= 93;
				int Hist_Marks=75;
				String Name="Manashri Dadasaheb Rahane";
				int RollNo = 154;
				int Full_Marks=500;
		// Printing School name and affiliation
		System.out.println("________________________________________________________________________________________  ");
		System.out.println("                         A.K.WAGHAMRE HIGH SCHOOL,Sambhajinagar");
		System.out.println("                             State board of Maharashtra");
		System.out.println("________________________________________________________________________________________  ");
		
		System.out.println("Name : Manashri Rahane"+"                                       "+"Date: 21/2/20214");
		System.out.println("   ");
		System.out.println("Roll No.:154"+"                     Sec : A                     "+"Exam: Summer Exam");
		
		System.out.println("________________________________________________________________________________________  ");
		System.out.println(" Sr.No         Subject              Full Marks                 Marks obtained");
		System.out.println("   1           English                 100                            "+""+Eng_Marks);
		System.out.println("   2           Marathi                 100                            "+""+Mar_Marks);
		System.out.println("   3           Mathematics             100                            "+""+Maths_Marks);
		System.out.println("   4           Science                 100                            "+""+Sci_Marks);
		System.out.println("   5           History                 100                            "+""+Hist_Marks);
		System.out.println("________________________________________________________________________________________  ");
		
		//Sum of all marks in subjects
		int Sum_Marks=(Eng_Marks+Mar_Marks+Maths_Marks+Sci_Marks+Hist_Marks);
		
		System.out.println("                                    Total:"+Full_Marks+"               "+"Total Obtained:"+Sum_Marks);
		System.out.println("________________________________________________________________________________________  ");
		
		// percentage of marks
		double Percentage= (Sum_Marks*100)/500;
		
		//Grades 
		String grade=(Percentage >90 && Percentage <=100)?("A+"):
			         (Percentage >80 && Percentage <=90)?("A"):
				     (Percentage >70 && Percentage <=80)?("B"):
					 (Percentage >60 && Percentage <=70)?("C"):
						 (Percentage >50 && Percentage <=60)?("D"):
							 (Percentage >35 && Percentage <=50)?("E"):
								 ("Failed");
		
		//Print Percentage and Grades
		System.out.println("Percentage:"+Percentage+"                                             Grade: " +grade);
		System.out.println("________________________________________________________________________________________  ");
		
		// Remark by percentage
		String Remark = (Percentage >90  && Percentage <=100)?("Excellence"):
	                    (Percentage >80 && Percentage <=90)?("Outstanding"):
		                (Percentage >70 && Percentage <=80)?("Very Good"):
			            (Percentage >60 && Percentage <=70)?("Good"):
				        (Percentage >50 && Percentage <=60)?("Average"):
					    (Percentage >35 && Percentage <=50)?("Need to Improve"):
						  ("Failed");
				
				
		System.out.println("Remark: "+Remark+"                                         Signature:Manashri");
		System.out.println("________________________________________________________________________________________  ");
	}
}
