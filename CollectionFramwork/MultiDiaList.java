import java.util.ArrayList;

//list ke andar list add karna - multi diamintional array

public class MultiDiaList {
    public static void main(String[] args) {
        
        ArrayList<ArrayList<Integer>> mainLisT = new ArrayList<>();
                              
                      //Example-01
            // ArrayList<Integer> list1=  new ArrayList<>();
            //  ArrayList<Integer> list2=  new ArrayList<>(); 

            //  list1.add(1);
            //  list1.add(2);
            //  list2.add(3);
            //  list2.add(4);

            //  mainLisT.add(list1);
            //  mainLisT.add(list2);


                //Example-02
             ArrayList<Integer> list1=  new ArrayList<>();
             ArrayList<Integer> list2=  new ArrayList<>(); 
             ArrayList<Integer> list3 = new ArrayList<>();
             
             for(int i=1; i<=5; i++){
                list1.add(i*1); //1 2 3 4 5
                list2.add(i*2); //2 4 6 8 10
                list3.add(i*3); //3 6 9 12 15
               }
             mainLisT.add(list1);
             mainLisT.add(list2);
             mainLisT.add(list3);

            

                 //print main list using nested loop
               
                 for(int i=0; i<mainLisT.size(); i++){
                    ArrayList<Integer> currList = mainLisT.get(i);

                    for(int j=0; j<currList.size(); j++){
                        System.out.print(currList.get(j)+" ");
                    }
                     System.out.println();
                 }
         
   
    }
}
