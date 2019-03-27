import java.util.Scanner;

public class Average
{
    public static void main(String args []){

        int num1, num2, num3, num4, num5;

        Scanner input = new Scanner( System.in);

        System.out.print("Enter the First number :");
        num1 = input.nextInt();

        System.out.print("Enter the Second number :");
        num2 = input.nextInt();


        System.out.print("Enter the Third number :");
        num3 = input.nextInt();

        System.out.print("Enter the Forth number :");
        num4 = input.nextInt();

        System.out.print("Enter the Fifth number :");
        num5 = input.nextInt();

        System.out.print("Average of five numbers is :"+( num1+num2+num3+num4+num5)/5);




    }
}
