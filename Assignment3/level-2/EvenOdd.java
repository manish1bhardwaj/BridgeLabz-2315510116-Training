import java.util.*;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);{
        int num=sc.nextInt();
        System.out.println("Even");
        for(int i=1;i<=num;i++){
            if(i%2==0){
                System.out.print(i+",");
            }
        }
        System.out.println("Odd");
        for(int i=1;i<=num;i++){
            if(i%2!=0){
                System.out.print(i+",");
            }
        }
    }
   }
}
