import java.util.Scanner;
class Main{
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
      int arr_size = sc.nextInt();
      int arr[] = new int [arr_size];
      for(int index = 0; index <= arr_size-1; index++){
         arr[index] = sc.nextInt();
      }
      int search_elem_1 = sc.nextInt();
      int search_elem_2 = sc.nextInt();
      int elem_1_idx = -1;
      int elem_2_idx = -1;
      for(int index = 0; index <=arr_size-1; index++){
         if(search_elem_1 == arr[index]){
           elem_1_idx = index;
         }
        if(search_elem_2 == arr[index]){
          elem_2_idx = index;
           }
      }
      System.out.println(elem_1_idx);
      System.out.println(elem_2_idx);
       
           
      
    }
}