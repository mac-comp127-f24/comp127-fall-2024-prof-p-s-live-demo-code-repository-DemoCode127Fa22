/* == should be used during reference comparison. == checks if both references 
points to same location or not. equals() method should be used for content comparison. 
equals() method evaluates the content to check the equality.
*/
public class operators {
    public static void main(String[] args) {
      String s1 = new String("POKEMONARCEUS");
      //String s2 = new String("POKEMONARCEUS");
      int num1 = 5;
      String s2 = s1;
      System.out.println(s2);
      //Reference comparison
      System.out.println(s1 == s2);
      //Content comparison
      System.out.println(s1.equals(s2));
      // int
      System.out.println(10 == 10);
      // char
      System.out.println('a' == 'a');
    }
}


