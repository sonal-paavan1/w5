import java.util.Scanner;

public class Poneze

{ public static void main (String args []){

    int num;

    Scanner input = new Scanner( System.in);

    System.out.print("Enter any number :");
    num=input.nextInt();

    if (num>0) {
        System.out.print(num+ " It is Positive number :");
    }
    else if (num<0)
    {
        System.out.print(num+ " It is Negative number :");
    }
    else {
        System.out.print(" It is Zero number :");
    }

}
}
