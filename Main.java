public class Main {
    public static void main(String[] args) {
        //creating an instance of the human object
        Human myObj = new Human();
        /**
         * the two commented lines below create an error because of visibility issues
         * due to the private instance variables in the Human.java class, I cannot
         * access them easily and change directly but my getter and setter methods are public
         * which means I can use them to modify and interact with an external class
         */

        // myObj.name = "joslenne"; --> ERROR
        // System.out.println(myObj.name); --> ERROR
        myObj.setName("Fred Flinstone");
        System.out.println(myObj.getName());
    }
}