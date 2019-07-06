import java.util.Scanner;
class Main {
	public static void main (String[] args){
       Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int sum=0, p;
      while(n>0)
      {
        p=n%10;
        sum=sum+p;
        n=n/10;
      }
      System.out.println(sum);
        
        
      
      
	    
	}
}