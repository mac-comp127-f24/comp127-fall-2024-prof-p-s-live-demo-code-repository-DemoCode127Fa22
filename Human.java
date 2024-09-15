public class Human {
    // private instance variables
    // illustrate my state
    private String name;
    private String birthlocation;

    //getter methods AKA accessor methods
    //to get or access data/information
    public String getName(){
        return name;
    }

    public String getBL(){
        return birthlocation;
    }

    // mutator methods AKA setters
    //to mutate or set/change our data/information
    public void setName(String newName){
        this.name = newName;
    }

    public void setBL(String newBirthlocation){
        this.birthlocation = newBirthlocation;
    }
}