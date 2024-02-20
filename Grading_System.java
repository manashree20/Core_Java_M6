class Grading_System
{
 public static void main(String[] args)
  { 
   int phy=95;
   int chem= 75;
   int math = 95;
   int bio = 78; 
   int hist=50;

  double sum = (phy+chem+math+bio+hist)*100;
  double percentage = sum/500;
  System.out.println(" The percentahe is : " + percentage);

  int percentage1 = (int) percentage;
  System.out.println("The integer percentage is :" + percentage1);
   
string result = (percentage <= 100 && pecentage1>=90)?("A"):((percentage1<90&&percentage1>=75)?("B"):(percentage1<75 &&percentage1>=55))?("C"):((percentage1<55 && percentage1>=35)?("E"):("F")));                      

  System.out.println("Grades are:" + result);
 }
}