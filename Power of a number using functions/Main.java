import java.util.Scanner;
class Main{
	public static void main (String[] args){
	
      Scanner s=new Scanner(System.in);
      int base=s.nextInt();
      int exp=s.nextInt();
      System.out.println(powerno(base,exp));
      
    }
  public static int powerno(int base,int exp)
  {
    int power=1;
    for(int i=1;i<=exp;i++)
    {
      power=power*base;
    }
    return power;
  }
}