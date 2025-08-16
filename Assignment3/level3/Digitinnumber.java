import java.util.Scanner;

public class Digitinnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);{
            System.out.println("Enter the number");
            int num=sc.nextInt();
            int dig=0;
            while(num>0){
                int digit=num%10;
                dig+=1;
                num=num/10;
            }
            System.out.println("Number of digits "+dig);
            
        }
    }
}
