import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner s=new Scanner(System.in);
      int n1=s.nextInt();
      int n2=s.nextInt();
      int n3=s.nextInt();
      int result=maxno(n1,n2);
      System.out.println(maxno(result,n3));
	}
  public static int maxno(int n1, int n2)
  {
    int max=0;
    if(n1>n2)
    {
      max=n1;
    }
    else
    {
      max=n2;
    }
    return max;
  }
}