public class Car {
    //instance variables, these are our states
    //we can control states to preserve control and privacy in our classes
    //encapsulaton**
    private String model;
    private int year;
    
    //constructor - setting variables to default values
    //each empty car object that is created will carry the values below
    public Car(){

        model = "";
        year = 2019;
    }

    // constructor: set instance variables to init parameters
    // When you pass object references as parameters to constructors or 
    // methods, they become aliases for the original object and can change it.
    public Car(String initModel, int initYear){
        //aliasing
        model = initModel;
        year = initYear;
    }

    //an empty method with no return type or formal parameters
    public void print(){
        System.out.println("car model is" + model);
        System.out.println("car year is" + year);
    }

    //our main method that executes our code 
    public static void main(String[] args) {
        //creating 2 car objects based on our constructors
        // Car car1 = new Car();
        Car car2 = new Car("Jeep", 2020);

        System.out.println("------");

        //using our void method as behaviors to impact the state
        // car1.print();
        car2.print();
    }
}