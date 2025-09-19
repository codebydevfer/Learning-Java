package JavaBasics;

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

        // if - else if - switch / Calculator

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

        //Switch / Calculator

        switch (operationType){
            case "+":
                result = number1 + number2;
                System.out.println(result);
                break;
            case "-":
                result = number1 - number2;
                System.out.println(result);
                break;
            case "/":
                result = number1 / number2;
                System.out.println(result);
                break;
            case "*":
                result = number1 * number2;
                System.out.println(result);
                break;
            default:
                System.out.println("Please select the correct operator!");
                break;
        }
        //Loops > for - while - do-while

        //for loop
        for (int i = 0; i < 5; i++){
            System.out.println("I = " + i);
        }

        //while
        int count = 0;
        while (count < 3){
            System.out.println("Count = " + count);
            count++;
        }

        //do-while
        int num = 0;
        do {
            System.out.println("Num = " + num);
            num++;
        }while (num < 10);

        //for-each (when studying lists/arrays)

        //Mini-projects

        //Calculator > Done
        //Number guessing game > Done
        //Multiplication table > Done

        //Number guessing game
        Scanner s = new Scanner(System.in);
        System.out.print("Guess a number between 1 and 100: ");
        int guessedNumber = s.nextInt();

        int numberToGuess = 5;
        int tries = 0;
        while (guessedNumber != numberToGuess) {
            if (guessedNumber < numberToGuess) {
                System.out.println("Guess higher.");
            }
            else {
                System.out.println("Guess lower.");
            }
            tries++;
            System.out.print("Try again: ");
            guessedNumber = s.nextInt();
        }
        tries++;
        System.out.println("It took you " + tries + " tries to guess the correct number!");

        //Multiplication table
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the desired number: ");
        int mtNumber = scan.nextInt();

        for (int x = 0; x < 10; x++){
            for (int y = 0; y < 1; y++) {
                System.out.println("Number = " + ((x + 1) * mtNumber));
            }
        }
    }
}
