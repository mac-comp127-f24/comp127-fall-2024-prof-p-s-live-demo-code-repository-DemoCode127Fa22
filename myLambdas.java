public class myLambdas {
    
    public static void main(String[] args) {
        
        Cats myCat = new Cats();
        //myCat.print(); 
        Printable myOliver = () -> System.out.println("Meows");        
        //printThingy(() -> System.out.println("Meows"));

        
    }

    static void printThingy(Printable thing){
        thing.print();
    }
}
