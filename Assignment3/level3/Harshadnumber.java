import java.util.Scanner;

public class Harshadnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);{
            System.out.println("enter the number");
            int num=sc.nextInt();
            int n=num;
            int sum=0;
            while(num>0){
                int digit=num%10;
                sum=sum+digit;
                num=num/10;
            }
            if(n%sum==0){
                System.out.println(n + " is a Harshad number");
            }else{
                System.out.println(n+" is not a Harshad number");
            }
            
        }
    }
}
