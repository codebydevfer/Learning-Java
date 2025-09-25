package OOPFirstSteps.Studies;

public class Second {
    public static void main(String[] args) {
        Main myObj = new Main();
        System.out.println(myObj.y + myObj.x);
        System.out.println(myObj.fname);

        //Using multiple classes
        Main myCar = new Main();
        myCar.fullThrottle();
        myCar.speed(250);
    }
}

