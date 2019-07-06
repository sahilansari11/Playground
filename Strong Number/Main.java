import java.util.Scanner;
class Main{
	public static void main (String[] args){
	     Scanner in = new Scanner(System.in);
      int num = in.nextInt(); 
      int temp, total=0, rem;
      temp = num;
      while ( num > 0)
      {
         rem = num % 10;
         int fact = 1;
      for(int i = 1 ; i<= rem ; i++)
      {
        fact = fact*i;
}
        num = num / 10;
        total = total + fact;
      }
 if(temp == total)
   System.out.println("Yes");
 else
   System.out.println("No");
}
}
    