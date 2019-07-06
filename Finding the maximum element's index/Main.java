import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int list[] = new int[n];
    for(int index = 0; index < n; index++)
    {
      list[index] = sc.nextInt();
    }
  max_index(list,n);
  }
  public static void max_index(int list[], int n){
    int max;
    if(list[0]>list[1])
    {
      max = 0;
    }
    else
    {
      max = 1;
    }
    for(int index = 2; index < n; index++)
    {
      if(list[max]<list[index])
      {
        max=index;
      }
    }
    System.out.print(max);
    
      }
}