// hashmap  defination - key value pair
// key - unique 
// value - can be duplicate
// key and value can be of any type
// key cannot be null
// value can be null
// hashmap is not thread safe
// hashmap is fail fast
// hashmap is unordered
// hashmap is not synchronized

//some function of hashmap 
//put(key,value)
//get(key)
//remove(key)
//containsKey(key)
//containsValue(value)
//size()
//isEmpty()
//clear()
//keySet()
//values()
//entrySet()
//clone()
//equals()
//hashCode()
//forEach()
//replace(key,value)
//replace(key,oldValue,newValue)



import java.util.HashMap;

public class Hashmap {

    

    public static void main(String[] args) {
        
        HashMap <Integer , String> hm = new HashMap<>();

        hm.put(10 , "tea");
        hm.put(25, "soap");
       hm.put(55, "sugar");
        hm.put(30, "tea");

        // System.out.println(hm);
        // System.out.println(hm.get(10));  we will get value on that key
        // System.out.println(hm.isEmpty());   it will return true or false
        System.out.println(hm.replace(10, "haldi"));
        System.out.println(hm);
        //  System.out.println(hm.containsKey(16));  it will return true and false

    }
}





