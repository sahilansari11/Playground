import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner s=new Scanner(System.in);
      int n1=s.nextInt();
      int n2=s.nextInt();
      int n3=s.nextInt();
      int result=gcdno(n1,n2);
      System.out.println(gcdno(result,n3));
	}
  public static int gcdno(int n1, int n2)
  {
    int gcd=1;
    for(int i=1;i<=n1 && i<=n2;i++)
    {
      if(n1%i==0 && n2%i==0)
      {
        gcd=i;
      }
    }
    return gcd;
  }
}