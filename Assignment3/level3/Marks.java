import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);{
            System.out.println("Enter your marks in physics");
            int phy=sc.nextInt();
            System.out.println("Enter your marks in chemistry");
            int chem=sc.nextInt();
            System.out.println("Enter your marks in maths");
            int math=sc.nextInt();
            int per=100*(phy+chem+math)/300;
            if(per>=80){
                System.out.println("average marks: "+per +" Grade: A "+"Remark: Level 4");
            }else if(per<80 || per>=70){
                System.out.println("average marks: "+per +" Grade: B "+"Remark: Level 3");
            }else if(per<70 || per>=60){
                System.out.println("average marks: "+per +" Grade: C "+"Remark: Level 2");
            }
            else if(per< 60|| per>=50){
                System.out.println("average marks: "+per +" Grade: D "+"Remark: Level 1");
            }
            else if(per<50 || per>=40){
                System.out.println("average marks: "+per +" Grade: E "+"Remark: Level 1-");
            }else{
                    System.out.println("average marks: "+per +" Grade: R "+"Remark: Remedial standards");
            }
        }
    }
}
