import java.util.Scanner;

public class Powerofnumber2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);{
            System.out.println("Enter the number");
            int num=sc.nextInt();
            System.out.println("Enter the power");
            int pow=sc.nextInt();
            int re=1;
            int i=1;
            while(i<=pow){
                re=re*num;
                i++;
            }
            System.out.println(re);
        }
    }
}
