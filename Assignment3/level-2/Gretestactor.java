import java.util.Scanner;

public class Gretestactor {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);{
            System.out.println("Enter the number you facortize");
            int num=sc.nextInt();
            System.out.println("Factors:");
            int gf=1;
            for(int i=1;i<num;i++){
                if(num%i==0){
                    gf=i;
                }
            }
            System.out.println("Greatest Factor: "+gf);
        }
    }
}
