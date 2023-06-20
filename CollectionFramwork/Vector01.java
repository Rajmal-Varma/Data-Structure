// Vector is a growable array of objects
// Vector is a class in java.util package
// Vector implements List interface
// Vector is a legacy class
// Vector is a dynamic array
// Vector is synchronized
// Vector is slow
// Vector is thread safe

// package CollectionFramwork;
import java.util.Scanner;
import java.util.ArrayList;



public class Vector01 {
    
public static void main (String args[]){

Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
ArrayList<Integer> v = new ArrayList<Integer>();
// Method-01
v.add(1);
v.add(2);
v.add(3);
v.add(4);

// for(Integer element:v){
//    System.out.println(element);
//    sc.close();
// }


//Method-02
v.remove(2);
for(int i=0; i<v.size(); i++){
   System.out.print(v.get(i) +" ");
}
//METHOD-03
System.out.println(v.size());
// METHOD-04
System.out.println(v.contains(3));
// METHOD-05
System.out.println(v.indexOf(3));
// METHOD-06
System.out.println(v.isEmpty());
// METHOD-07
System.out.println(v.remove(v));
}

}
