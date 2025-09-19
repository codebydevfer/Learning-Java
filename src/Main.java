import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Variable and data types
        //int
        int a = 5;
        System.out.println(a);

        //double
        double b = 2.5;
        System.out.println(b);

        //boolean
        boolean c = true;
        boolean d = false;
        System.out.println(c);
        System.out.println(d);

        //String
        String e = "Hello World";
        System.out.println(e);

        //Output and input

        System.out.print("Hey, what's is your name?");
        Scanner userInput = new Scanner(System.in);

        String userOutput = userInput.nextLine();
        System.out.println("Welcome back, " + userOutput + "!");

        // if - else if - switch

        Scanner scanner = new Scanner(System.in);

        System.out.println("Type your first number: ");
        int number1 = scanner.nextInt();

        System.out.println("Type your second number: ");
        int number2 = scanner.nextInt();

        System.out.println("Select the type of operation: '+', '-', '/', '*': ");
        String operationType = scanner.next(); //use one Scanner only and carefully choose next() instead of nextLine() for single tokens

        int result;

        if (operationType.equals("+")){
            result = number1 + number2;
            System.out.println(result);
        } else if (operationType.equals("-")){
            result = number1 - number2;
            System.out.println(result);
        } else if (operationType.equals("/")){
            result = number1 / number2;
            System.out.println(result);
        } else if (operationType.equals("*")){
            result = number1 * number2;
            System.out.println(result);
        }else{
            System.out.println("Please select the correct operator!");
        }

        //Switch

        //Loops > for - while - do-while


    }
}