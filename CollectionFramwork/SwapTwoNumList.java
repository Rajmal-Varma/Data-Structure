import java.util.ArrayList;



public class SwapTwoNumList {

    
public static  void  swap(ArrayList<Integer>al, int idx1, int idx2){
    int temp = al.get(idx1);
     al.set(idx1, al.get(idx2));
     al.set(idx2, temp);
}
    public static void main(String[] args) {
         ArrayList<Integer> al = new ArrayList <Integer>();

al.add(7);
al.add(8);
al.add(2);
al.add(4);
al.add(5);

        int idx1=1;
        int idx2=3;
        System.out.print(al+" ");
        swap (al,idx1,idx2);
        System.out.print(al+" ");



    }
}
