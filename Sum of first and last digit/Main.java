import java.util.Scanner;
class Main {
	public static void main (String[] args){
	   Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int sum;
      int First_digit;
      int Last_digit;
      First_digit=n;
      while(First_digit >= 10)
		{
			First_digit = First_digit / 10;
		}	
		
		Last_digit = n % 10;
        sum=First_digit+Last_digit;
      System.out.println(sum);
      
      
      
	}
}
