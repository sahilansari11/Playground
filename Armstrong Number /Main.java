import java.util.Scanner;
class Main{
	public static void main (String[] args){
      Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      int temp;
      int total=0;
      int original_number;
      original_number = num;
	    for(int i = 1; i <= num; i++)
      {
          temp = original_number % 10;
          total = total + temp*temp*temp;
          original_number= original_number / 10;
      }
      
      if(total == num)
           System.out.println("Armstrong Number");
      else
          System.out.println("Not a Armstrong Number");
    }
}
