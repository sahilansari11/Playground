import java.util.Scanner;
class Main{
	public static int sum_of_number (int num){
      int sum = 0;
      int count= 1;
      while(count <= num)
      {
        sum = sum+count;
        count++;
      }
      return sum;
    }
      public static void main(String args[])
      {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = sum_of_number(n);
        System.out.print(sum);
      }
	}
