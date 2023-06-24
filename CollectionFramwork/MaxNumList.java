import java.util.ArrayList;

public class MaxNumList {
    

    public static void main(String[] args) {
        
        ArrayList<Integer> al = new ArrayList <Integer>();

al.add(7);
al.add(8);
al.add(2);
al.add(4);
al.add(5);

// maximum number in the list 

int max= al.get(0);
int min  = al.get(0);

for(int i=0; i<al.size(); i++){

    if(al.get(i)>max){
        max=al.get(i);
    }
}


//minimum number in the list
for(int i=0; i<al.size(); i++){
   if(al.get(i)<min){
       min=al.get(i);
   }
}

System.out.println(max);
System.out.println(min);
    }
}
