package ArrayStringMethod;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //Arrays (int[], String[])

        //string array
        String[] cars = {"Volvo", "BMW", "Mazda", "Audi", "Mercedes"};
        System.out.println(cars[1]);

        //change array element
        cars[0] = "Ferrari";
        System.out.println(cars[0]);

        //array length
        System.out.println(cars.length);

        //using new keyword
        String[] myCars = new String[4]; //[3] size of array

        Scanner scanner = new Scanner(System.in);
        System.out.print("What's your car? -> ");
        String userCar = scanner.nextLine();

        myCars[0] = "Honda";
        myCars[1] = "Lambo";
        myCars[2] = "Dodge";
        myCars[3] = userCar;

        //looping trough array to print indexes
        for (int i = 0; i < myCars.length; i++){
            System.out.println(myCars[i]);
        }

        //int array
        int[] numbers = {1, 2, 7, 3, 20, 40, 200, 4};
        System.out.println(numbers[4]);

        //...

        //Strings basics -> length(), charAt(), substring().

        //length()
        String myString = "Hello World!";
        int length = myString.length(); // Calls the length() method on the string object
        System.out.println("The length of the string is: " + length);

        String emptyString = "";
        int emptyLength = emptyString.length();
        System.out.println("The length of the empty string is: " + emptyLength);

        //charAt()
        String txt = "Hello";
        System.out.println(txt.charAt(2)); //l
        System.out.println(txt.charAt(0)); //H

        //substring()
        String myStr = "Hello, World!";
        System.out.println(myStr.substring(7,12)); //World
        System.out.println(myStr.substring(0,5)); //Hello

        //Methods
        myMethod();
        myMethod();

        //Parameters
        myOtherMethod("Sara");

        anotherMethod("Sara", 23);

        //Method with if / else
        checkAge(17);

        //Method + return
        System.out.println(returnMethod(4));

        System.out.println(returnMethodTwo(5, 5));

        int z = variableMethod(6, 1);
        System.out.println(z);

        //Method Overloading
        int num1 = plusMethod(5, 5);
        double num2 = plusMethod(5.5, 6.5);
        System.out.println("Int = " + num1 + " Double = " + num2 + " | Total = " + (num1 + num2));

        //Method recursion
        //Adding from 1 to 10
        int result = sum(10);
        System.out.println(result);

        //Halting condition
        //Adding from 5 to 10
        int secondResult = secondSum(5, 10);
        System.out.println(secondResult);

        //Countdown
        countdown(5);

        //Mini-projects
        //Find max/min number in an array -> Done
        //Word counter (count word in a string) -> Done
        //Temperature converter (Celsius -> <- Fahrenheit) -> Done


        //Find max/min number in array
        int[] numbersArray = new int[4];
        Scanner numberScanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int numberOne = numberScanner.nextInt();
        System.out.print("Enter the second number: ");
        int numberTwo = numberScanner.nextInt();
        System.out.print("Enter the third number: ");
        int numberThree = numberScanner.nextInt();
        System.out.print("Enter the fourth number: ");
        int numberFour = numberScanner.nextInt();

        numbersArray[0] = numberOne;
        numbersArray[1] = numberTwo;
        numbersArray[2] = numberThree;
        numbersArray[3] = numberFour;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int a = 0; a < numbersArray.length; a++){
            if (numbersArray[a] < min){
                min = numbersArray[a];
            }
            if (numbersArray[a] > max){
                max = numbersArray[a];
            }
        }
        System.out.println("Min: " + min + " " + "Max: " + max);

        //Word Counter (counting words in a string)
        Scanner stringInput = new Scanner(System.in);
        System.out.print("Enter your string here: ");
        String userInput = stringInput.nextLine();

        int countWords = userInput.split("\\s").length;

        System.out.println(countWords);

        //Temperature converter C <- -> F
        Scanner tempC = new Scanner(System.in);
        System.out.print("Select 'C' or 'F': ");
        String tempCInput = tempC.nextLine();

        if (tempCInput.equals("F")){
            System.out.print("Type temperature in Celsius: ");
            double celsius = tempC.nextInt();
            double cToF = celsius * 9/5 + 32;
            System.out.println(celsius + " celsius converted to fahrenheit = " + cToF);
        }
        else if (tempCInput.equals("C")){
            System.out.print("Type temperature in Fahrenheit: ");
            double fahrenheit = tempC.nextInt();
            double fToC = fahrenheit - 32 * 5/9;
            System.out.println(fahrenheit + " fahrenheit converted to celsius = " + fToC);
        }
    }

    //Methods
    static void myMethod(){
        System.out.println("Code executed!");
    }

    //Parameters
    static void myOtherMethod(String fname){
        System.out.println(fname + " Linda");
    }

    static void anotherMethod(String name, int age){
        System.out.println(name + " is " + age);
    }

    //Method with if / else
    static void checkAge(int age){
        if (age < 18){
            System.out.println("Access denied");
        }
        else{
            System.out.println("Access granted - Welcome back");
        }
    }

    //Method using return
    static int returnMethod(int x){
        return 5 + x;
    }

    static int returnMethodTwo(int a, int b){
        return a * b;
    }

    static int variableMethod(int w, int y){
        return w - y;
    }

    //Method Overloading - multiple methods can have the same name with different parameters
    static int plusMethod(int x, int y){
        return x + y;
    }

    static double plusMethod(double x, double y){
        return x + y;
    }

    //Method recursion
    //Adding from 1 to 10
    public static int sum(int k){
        if (k > 0){
            return k + sum(k - 1);
        }
        else{
            return 0;
        }
    }

    //Halting condition
    //Adding from 5 to 10
    public static int secondSum(int start, int end){
        if (end > start){
            return end + secondSum(start, end - 1);
        }
        else{
            return end;
        }
    }

    //Countdown
    static void countdown(int n){
        if (n > 0){
            System.out.println(n + " ");
            countdown(n - 1);
        }
    }
}
