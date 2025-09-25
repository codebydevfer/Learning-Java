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
        myMethod();

        //Static method
        myStaticMethod();

        //Public method
        Main myNewObj = new Main();
        myNewObj.myPublicMethod();

        //Access methods with an object
        Main myCar = new Main();
        myCar.fullThrottle();
        myCar.speed(300);

        //Constructors - special method that is used to initialize objects
    }
    //Methods
    static void myMethod(){
        System.out.println("Hello World!");
    }

    //Static vs Public

    //Static method
    static void myStaticMethod(){
        System.out.println("Static methods can be called without creating objects.");
    }

    //Public method
    public void myPublicMethod(){
        System.out.println("Public methods must be called by creating objects.");
    }

    //Access methods with an object
    public void fullThrottle(){
        System.out.println("The car is going as fast as it can!");
    }

    public void speed(int maxSpeed){
        System.out.println("Max speed is: " + maxSpeed);
    }

    //Using multiple classes
//    public void fullThrottle(){
//        System.out.println("The car is going as fast as it can!");
//    }
//
//    public void speed(int maxSpeed){
//        System.out.println("Max speed is: " + maxSpeed);
//    }

    //Constructors - special method that is used to initialize objects

}
