public class toasty {
    //instance variables
    private String fname = "Curious";
    private String lname = "George";
    final int age = 16;
    //The final keyword is useful when you 
    //want a variable to always store the same value, like PI.
    //can use that here it depends on data and context
    //static members indicate member belongs to type itself rather
    //than instance
    public static void main(String[] args) {
    //this is a local age variable, does NOT reference the age variable above!
        int age = 22;
    // instantiation of new objects 
        toasty myObj = new toasty();
        toasty myObj2 = new toasty();
        System.out.println("Name: " + myObj.fname + " " + myObj.lname);
        // to access age I can use the local age variable or to reference the
        // instance variable of the final age, I need to use myObj2.age
        // System.out.println("Age: " + age); //Error without using local main method scope 
    }
}
