import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.*; 
/**
 * @author Joslenne Pena
 * initial credit:https://www.geeksforgeeks.org/stream-in-java/
 */
public class stream {
    public static void main(String[] args) {    
    // Initial DATA SOURCE - create a list of integers 
	List<Integer> number = Arrays.asList(2,3,4,5); 
    System.out.println(number);
	System.out.println("------------------------  --");
	/**
	 * INTERMEDIATE OPERATIONS
	 */
	//map method produces a new stream after applying a function to 
	//each element of the original stream, new stream could be of different type
	//collect just gets everything once we are done with processing
	List<Integer> squared = number.stream().map(x -> x*x).collect(Collectors.toList()); 
    System.out.println(squared); 

	// create a list of String 
	List<String> names = Arrays.asList("snape","Hermoine","Voldy", "Hagrid"); 

	// demonstration of filter method 
	// filter method is used to select elements as indicated passed as argument
	List<String> result = names.stream().filter(s->s.startsWith("S") || s.startsWith("s")).collect(Collectors.toList()); 
	System.out.println("------------------------");
	System.out.println(result); 

	// demonstration of sorted method, it sorts the stream
	// come with an example 
	// List<String> show = names.stream().sorted().collect(Collectors.toList()); 
	// System.out.println("------------------------");
	// System.out.println(show); 

	/**
	 * TERMINAL OPERATIONS
	 */
	// create a list of integers 
	// List<Integer> number = Arrays.asList(2,10,4,102,2); 

	// demonstration of forEach method - used to iterate through every element of the stream
	number.stream().map(x->x*x).forEach(y->System.out.println(y)); 

	//demonstration of reduce method - reduce the elements of a stream to a single value
	// int even = number.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i); 
	// System.out.println("------------------------");
	// System.out.println(even); 
    }
}











// collect method returns a set, returns the result of the intermediate operations performed on the stream
	// Set<Integer> squareSet = number.stream().map(x->x*x).collect(Collectors.toSet()); 
	// System.out.println("------------------------");
	// System.out.println(squareSet); 