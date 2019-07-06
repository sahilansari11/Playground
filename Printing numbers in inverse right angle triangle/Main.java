import java.util.Scanner;
class Main{
	public static void main (String[] args){
	     Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      for(int rownum = 1 ; rownum<=n ; rownum++){
        for(int colnum = n-(rownum-1); colnum >= 1; colnum--)
        { 
          System.out.print(colnum);
        }
        System.out.print("\n");
      }
	}
}
