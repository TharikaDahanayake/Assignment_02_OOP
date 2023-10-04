import java.util.Scanner;
public class Main {

    public static void main(String [] args){
        Scanner input=new Scanner(System.in);

        System.out.println("...Smart Calculator...");

        Calculator add = new Calculator();
        System.out.print("Enter a number : ");
        int x=input.nextInt();
        System.out.print("Enter a number : ");
        int y=input.nextInt();

        add.Addition(x,y);
        add.Subtraction(x,y);
        add.Multiplication(x,y);
        if (x<=0 || y<=0) {
            System.out.println("Invalid operation");
        }
        else{
            add.Division(x,y);
        }

  }
}
