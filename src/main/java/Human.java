public class Human {
    private final String name;
    private final String lastname;

    public Human(String name, String lastname){
        this.name = name;
        this.lastname = lastname;
    }

    /*
    * Getter for name + lastname
    *
    * inputs: void
    * outputs: string (full name)
    * */
    public String getName(){
        return name + " " + lastname;
    }
}
