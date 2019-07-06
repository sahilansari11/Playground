import java.util.Scanner;
class Main
{
	public static int square_of_digit(int num)
    {
      int sod = (num*num);
      return sod;
    }
   public static void main(String args[])
   {
     Scanner in = new Scanner(System.in);
     int n = in.nextInt();
     int sod = square_of_digit(n);
     System.out.print(sod);
	} 
}