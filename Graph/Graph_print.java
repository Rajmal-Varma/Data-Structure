package Graph;
import java.util.*;
public class Graph_print {
    
    public static void main(String[] args) {
         ArrayList<ArrayList<Integer>> al = new ArrayList<>();

            ArrayList<Integer> list1 = new ArrayList<>();
            list1.add(2);
            list1.add(3);
            ArrayList<Integer> list2 = new ArrayList<>();
            list2.add(4);
            list2.add(8);
            list2.add(5);
            list2.add(3);
            ArrayList<Integer> list3 = new ArrayList<>();
            list3.add(6);
            list3.add(7);
            ArrayList<Integer> list4 = new ArrayList<>();
           list4.add(0);
            ArrayList<Integer> list5 = new ArrayList<>();

            ArrayList<Integer> list6 = new ArrayList<>();
            list6.add(5);

               ArrayList<Integer> list7 = new ArrayList<>();
                       list7.add(9);
                          list7.add(8);
                  ArrayList<Integer> list8= new ArrayList<>();

                     ArrayList<Integer> list9 = new ArrayList<>();

                     for(int i=0; i<10; i++){
                        al.add(new ArrayList<>(i));
                     }
                    
                    for(int i=0; i<10; i++){
                        ArrayList<Integer> currList = al.get(i);
                        for(int j=0; j<currList.size(); j++){
                            System.out.print( j + ":"+ currList.get(j)+" ");
                        }
                        System.out.println();
                        
                    }
      
}}
