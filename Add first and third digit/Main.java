import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
      int n1=in.nextInt();
      int sum=n1%10;
      int div=n1/100;
      int sub=sum+div;
      System.out.println(sub);
	}
}