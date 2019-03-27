import java.util.Scanner;

public class Passfail
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int s1,s2,s3;
        int total;
        String grade = null;
        float per;

        System.out.print("Enter Marks of English : ");
        s1 = input.nextInt();
        System.out.print("Enter Marks of Maths : ");
        s2 = input.nextInt();
        System.out.print("Enter Marks of Science : ");
        s3 = input.nextInt();

        total = s1 + s2 + s3;
        per = (total * 100) / 300;



        if(s1<35 || s2<35 || s3<35)
        {
             grade = "Fail";
        }
        else if(per>=80){
            grade = "A+";
        }else if(per>=60 && per<80){
            grade = "A";
        }
        else if(per>=50 && per<60){
            grade = "B";
        }
        else if (per>=35 && per<50) {
            grade = "C";
        }

        System.out.println("Your Total is : " +total);
        System.out.println("Percentage is : " +per);
        System.out.println("Your grade is : " +grade);





    }
}
