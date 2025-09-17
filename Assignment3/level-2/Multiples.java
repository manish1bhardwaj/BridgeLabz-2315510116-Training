import java.util.*;
public class Multiples {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);{
            System.out.println("Enter the number");
            int num=sc.nextInt();
            if(num>0 && num<100){
            System.out.println("Multipiles:");
            for(int i=1;i<=num;i++){
                if(num%i==0){
                    System.out.print(i+" ");
                }
            }                
            }else{
                System.out.println("Please enter a number between 1 to 100");
            }
        }
    }
}
