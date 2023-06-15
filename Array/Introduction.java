package Array;
import java.util.Scanner;
// array is non primitive data type
// array is collection of similar data type
// array is fixed in size
// array is contigous memory location
// array is index based
// array is linear data structure
// array is homogenous data structure
// array is static data structure
// array is dynamic data structure
// array is random access data structure

public class Introduction {
  public static void main(String[] args) {
   
    Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
       int arr [] = new int [n];
       for(int i=0; i<n; i++){
        arr[i]  = sc.nextInt();

       }  
       for(int j=0; j<n; j++){
        System.out.println(arr[j]);
       }
       sc.close();
  }  
}
