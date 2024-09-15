import java.util.ArrayList;

//Lambda expressions are usually passed as parameters to a method
//method call inside of another method (outer and inner)
//the outer method's call is another method call
public class numLambda {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    numbers.add(10);
    numbers.add(12);
    numbers.add(7);
    numbers.add(1);
    numbers.add(456);
    numbers.forEach( (n) -> { System.out.println(n); } );
  }
}