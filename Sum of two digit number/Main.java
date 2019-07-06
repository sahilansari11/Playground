import java.util.*;
class Main {
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
      int n1=in.nextInt();
      int s=n1%10;
      int p=s+(n1/10);
      System.out.println(p);
	}
}