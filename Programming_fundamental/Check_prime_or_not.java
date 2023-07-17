package Programming_fundamental;
 
public class Check_prime_or_not {
    public static void main(String[] args) {
        int n=2;
        if(n==1 || n==0){
            System.out.println("not prime");
        }
        if(n==2){
            System.out.println("prime");
        }
        else{
        if(n%2==0){
            System.out.println("not prime");
        }else{
   System.out.println("prime");
        }
    }

    }
}
