package OOPFirstSteps.Studies;

public class Main {

    int x = 3;
    int y = 1;
    int z;

    String fname = "Mark";
    String lname = "Ham";
    int age = 26;

    public static void main(String[] args) {
        //Class -> Fruit
        //Objects -> Apple, Banana, Mango...

        //Class -> Car
        //Objects -> Volvo, Audi, BMW...

        //Creating an object
        Main myObj = new Main(); //Object 1
        System.out.println(myObj.x);

        Main mySecondObj = new Main(); //Object 2
        System.out.println(mySecondObj.x);

        //Attributing value to an existing variable
        Main newObj = new Main();
        newObj.z = 50;
        System.out.println(newObj.z);

        //Changing value for only one object
        Main myObj1 = new Main();
        Main myObj2 = new Main();
        myObj2.x = 100;
        //Outputs 3 (x)
        System.out.println(myObj1.x);
        //Outputs 100
        System.out.println(myObj2.x);

        //Multiple attributes
        Main multAtt = new Main();
        System.out.println("First name: " + multAtt.fname + " | Last name: " + multAtt.lname);
        System.out.println("Age: " + multAtt.age);

        //Note: Not necessary to create multiple objects (Main obj = new Main()...)...

        //Methods
    }
}
