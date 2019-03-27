import java.util.Scanner; // importing java scanner library

public class Interchange {

    public static void main ( String args [])
    {
        int a,b,temp;
        Scanner input = new Scanner(System.in);

        System.out.print( "Enter the number A : ");
        a = input.nextInt();

        System.out.print( "Enter the number B : ");
        b = input.nextInt();

        temp = a;
        a = b;
        b = temp;

        System.out.println( "Now A = " +a);
        System.out.println("Noe B = " +b);


    }
}
