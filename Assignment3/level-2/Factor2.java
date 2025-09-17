import java.util.Scanner;

public class Factor2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);{
            System.out.println("Enter the number you facortize");
            int num=sc.nextInt();
            System.out.println("Factors:");
            int i=1;
            while(i<=num){
                if(num%i==0){
                    System.out.print(i+" ");
                }
                i++;
            }
        }
    }
}
