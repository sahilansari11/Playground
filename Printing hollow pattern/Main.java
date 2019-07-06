import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
        int n = in.nextInt();
       for(int rownum = 1; rownum <= n; rownum++)
       {
         for(int colnum = 1; colnum<=n; colnum++){
           if( rownum == 1 || rownum ==  n || colnum == 1 || colnum == n)
             System.out.print("*");
           else
             System.out.print(" ");
         }
         System.out.print("\n");
	}
}
}