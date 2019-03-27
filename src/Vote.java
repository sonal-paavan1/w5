import java.util.Scanner;

public class Vote
{
    public static void main(String args[])
    {

        int age;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your Age : ");
        age = input.nextInt();

        if(age>=18) {
            System.out.println("You are eligible for Vote");
        } else
            System.out.println("You are not eligible for Vote");
    }

}
