
import java.util.Scanner;

public class Youngestfriend {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);{
            System.out.println("Enter your ages(Amar,Akbar,Anthony)");
            int[] age=new int[3];
            int[] height=new int[3];
            String[] arr={
                "Amar",
                "Akbar",
                "Anthony"
            };
            for(int i=0;i<3;i++){
                age[i]=sc.nextInt();
            }
            System.out.println("enter your height(Amar,Akbar,Anthony)");
                for(int i=0;i<3;i++){
                height[i]=sc.nextInt();
            }
            int young=Integer.MIN_VALUE;
            int ind=0;
            for(int i=0;i<3;i++){
                if(age[i]>young){
                    young=age[i];
                    ind=i;
                }
            }
            System.out.println("Youngest:"+arr[ind]);
            int tallest=Integer.MIN_VALUE;
            int ind2=0;
            for(int i=0;i<3;i++){
                if(height[i]>tallest){
                    tallest=height[i];
                    ind2=i;
                }
            }
            System.out.println("Tallest:"+arr[ind2]);
        }
    }
}
