import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
        int n = in.nextInt();
       for(int rownum = 0; rownum < n; rownum++)
       {
         for(int colnum = 0; colnum< n; colnum++){
           if( rownum == colnum || rownum + colnum == n-1)
             System.out.print("*");
           else
             System.out.print(" ");
         }
         System.out.print("\n");
	}
}
}