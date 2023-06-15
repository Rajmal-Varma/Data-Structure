/**
 * Linked_List creation / print using functi
 */
public class Linked_List {

public static void printList(Node <Integer> head){
    
         while(head!=null){
            System.out.print(head.data +" ");
            head = head.next;
         }
}
    public static void main(String[] args) {
        Node<Integer> node1 = new Node<Integer>(10);
        Node<Integer> node2 = new Node<Integer>(20);
        Node <Integer> node3 = new Node<Integer>(30);
       
                //  line se print karna
        // Node<Integer>head = node1;
        // node1.next = node2;
        // node2.next = node3;

                    // 3rd node ko head ki jagah print karna
        Node<Integer>head = node3;
        node3.next = node2;
        node2.next = node1;

            //  node1 ka head ke sath connection
        // System.out.println(head.data + " "+head);  
        // System.out.println(node1.data+" "+node1);  both have same reference and data
            //   node2 ka node1 ke sath connection
        // System.out.println(node1.next +"= "+node2);
        // System.out.println(node1.next.data +"= "+node2.data);
                // node3 ka node2 ke sath link
        // System.out.println(node2.next +"= "+node3);
        // System.out.println(node2.next.data +"= "+node3.data);
        printList(head);
    }
    
}
