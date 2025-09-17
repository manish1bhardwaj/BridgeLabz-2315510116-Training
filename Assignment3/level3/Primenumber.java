import java.util.Scanner;

public class Primenumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);{
            System.out.println("Enter the number");
            int n=sc.nextInt();
            int i=1;
            int fac=0;
            while(i<=n){
                if(n%i==0){
                    fac+=1;
                }
                i++;
            }
            if(fac==2){
                System.out.println(n+" is a prime number");
            }else{
                System.out.println(n+" is not a prime number");
            }
        }
    }
}
