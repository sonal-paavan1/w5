import java.util.Scanner;

public class Symbol {

    public static void main(String args[]){

        int a1,a2,cl=1;
        String s;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number 1 :");
        a1 = input.nextInt();


        System.out.print("Enter number 2 :");
        a2 = input.nextInt();

        System.out.print("Enter your calculation symbol +, -, / or * : ");
         s = input.next();

        if (s == "+") {
            cl = a1 + a2;
        }

        else if( s == "-"){
            cl = a1 - a2;
        }

        else if( s == "/"){
            cl = a1 / a2;
        }
        else if( s == "*"){
            cl = a1 * a2;
        }

        System.out.println(" calculation = " +cl);
    }
}
