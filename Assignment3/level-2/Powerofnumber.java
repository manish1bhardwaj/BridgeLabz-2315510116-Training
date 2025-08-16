import java.util.Scanner;

public class Powerofnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);{
            System.out.println("Enter the number");
            int num=sc.nextInt();
            System.out.println("Enter the power");
            int pow=sc.nextInt();
            int re=1;
            for(int i=1;i<=pow;i++){
                re=re*num;
            }
            System.out.println(re);
        }
    }
}
