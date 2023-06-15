/**
 * Node_creation   node contain-   1. data part  2 . address part
 */
public class Node<T> {
               T data;
               Node <T> next;

               public Node(T data){
                  this.data=data;
                  next=null;
               }

}
