package ArrayStringMethod;

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
        String[] myCars = new String[3]; //[3] size of array

        myCars[0] = "Honda";
        myCars[1] = "Lambo";
        myCars[2] = "Dodge";

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


    }
}
