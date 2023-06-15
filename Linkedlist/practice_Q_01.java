import java.util.Scanner;
                     //Insert new Node at ayone position of the list
                     
public class practice_Q_01<T> {
                
    public static  Node <Integer> takeInput(){
        Node<Integer>head = null , tail=null;
        Scanner sc =new Scanner(System.in);
        
           int data=sc.nextInt();
        while(data!=-1){
           Node <Integer> newnode = new Node<Integer>(data);
             if(head==null){
                head=newnode;
                tail=newnode;
                 
             }else{
              tail.next =newnode;
                tail = newnode;
             }
             data = sc.nextInt();
        }
        
        return head;  

    }

    public static void printList(Node<Integer>head){
        while(head!=null){
            System.out.print(head.data +" ");
            head = head.next;
         }
    }

    public static Node<Integer> insert(Node<Integer>head , int data , int pos){
     
Node<Integer> newnode = new Node<Integer>(data);
     if(pos==0){
        newnode.next = head;
        return newnode;
     }
       int i=0;
       Node<Integer>temp = head;
        while(i<pos-1){
         temp = temp.next;
         i++;
        }
        newnode.next = temp.next;
        temp.next=  newnode;
    
        return head;
    }

    public static void main(String[] args) {
        Node<Integer>head = takeInput();
        head = insert(head, 50, 0);
        printList(head);

    }

}
