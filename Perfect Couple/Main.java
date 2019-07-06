import java.util.Scanner;
class Main{
    public static void main(String args[])  {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
		    a[i]=s.nextInt();
		    
		}
		int v=s.nextInt();
		for(int i=0;i<n;i++)
		{
		    for(int j=i+1;j<n;j++)
		    {
		        if(a[i]+a[j]==v)
		        {
		            System.out.print(a[i]+", "+a[j]);
                   System.out.print("\n");
		            
		        }
		    }
		    
		}
	}
}

