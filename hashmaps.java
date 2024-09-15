// Import the HashMap class and Map Interface
import java.util.HashMap; // can have null values and keys
import java.util.Map; // cannot duplicate keys

public class hashmaps {
    public static void main(String[] args) {
    //hashmaps cannot make guarantees to order
    HashMap<String, Integer> company = new HashMap<String, Integer>();

    // Add keys and values, company.put(keys, values);
    company.put("Apple", 1976);
    company.put("Microsoft", 1975);
    company.put("IBM", 1911);
    company.put("Google", 1998);
    company.put(null, null);
    //company.put(1198, 1999); // ERROR
    System.out.println(company);
    System.out.println("-----------------------------------------");

    // This implies that the compiler will treat your Map object as if it 
    // were of type Map, even though it may point to any of its subtypes at runtime
    Map<String, String> teams = new HashMap<String, String>();
    
    //similar keys
    teams.put("Minnesota", "Twins");
    teams.put("Georgia", "Wild");
    teams.put("Alabama", "Timberwolves");
    System.out.println(teams);
    teams.get("Minnesota");
    System.out.println(teams.get("Minnesota"));
    teams.remove("Georgia"); 
    // other methods are .size() which gets length or .clear() which removes all items
    
    // Print keys
    for (String i : teams.keySet()) {
        System.out.println(i);;
        }
    //Prints values
    for (String i : teams.values()) {
        System.out.println(i);
        }
    }
}

/** Hashmaps or maps are similar to dictionaries in python. They have key value pairs
 * to help match and pair data.
 * 
 * Arrays store items as an ordered collection, and you have to access them with an 
 * index number (int type). A HashMap however, store items in "key/value" pairs, and 
 * you can access them by an index of another type (e.g. a String).

    One object is used as a key (index) to another object (value). It can store 
    different types: String keys and Integer values, or the same type, 
    like: String keys and String values
 */