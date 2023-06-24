import java.util.ArrayList;
import java.util.Collections;

public class SortingList {
    public static void main(String[] args) {
        

        ArrayList<Integer> list = new ArrayList<Integer>();

        //collections is a class which contain some method to sort the list in accending order(by default)
        //collecton is interface 
        // comparator is interface  which contain compare method  to sort the list in decending order .
        //comparator is function logic which is used to sort the list in decending order.


        list.add(9);
        list.add(5);
        list.add(3);
        list.add(7);
        list.add(1);
        list.add(2);

        System.out.println(list);
        //sort the list in accending order
        Collections.sort(list);
        System.out.println(list);
        //sort the list in decending order
      Collections.sort(list , Collections.reverseOrder());
      System.out.println(list);
      






    }
}
