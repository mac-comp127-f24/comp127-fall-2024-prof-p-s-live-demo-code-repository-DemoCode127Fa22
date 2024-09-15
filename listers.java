import java.util.List;
import java.util.Arrays;

public class listers {
    
    public static void main(String[] args) {
        //Arrays.asList returns a mutable list 
        //while the list returned by List.of is immutable!!
        List<Integer> list = Arrays.asList(1, 2, null);
        list.set(1, 10); // OK

        List<Integer> list = List.of(1, 2, 3);
        list.set(1, 10); // Fails 
    }
}
