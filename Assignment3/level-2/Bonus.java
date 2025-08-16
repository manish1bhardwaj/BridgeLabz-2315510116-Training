import java.util.*;
public class Bonus {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);{
            System.out.println("Enter years of experience");
            int exp=sc.nextInt();
            System.out.println("Enter your salary");
            int sal=sc.nextInt();
            if(exp>5){
                float bonus=(5*sal)/100;
                System.out.println("Your bonus is: "+bonus);
            }else{
                System.out.println("Sorry! you don't have any bonus to claim");
            }
        }
    }
}
