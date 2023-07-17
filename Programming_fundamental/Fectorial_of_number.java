package Programming_fundamental;

public class Fectorial_of_number {
    
    public static void main(String[] args) {
        int n=10;
        int fact = 1;
        while(n>=1){
          fact*=n;
          n--;
        }
        System.out.println(fact);
    }
}
