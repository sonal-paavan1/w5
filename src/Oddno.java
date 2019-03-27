import java.util.Scanner;

public class Oddno{

    public static void main (String args[])
    {
        int a;
        Scanner no = new Scanner(System.in);

        System.out.print("Enter any number : ");
        a = no.nextInt();   //  passing value entered by user to "a"

        String evenodd = (a%2==0) ? "Even" : "Odd"; // use ternary method
        System.out.println(a + " is " +evenodd);

    }
}
