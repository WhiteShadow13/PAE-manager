package UE_classes;

import People_side.Teacher;

import java.util.HashMap;
import java.util.Map;

public class Class {
    final private String name;
    final private String code;
    protected int nhours;
    private Map<String, Teacher> teachers;

    public Class(String name, String code){
        this.name = name;
        this.code = code;
        this.teachers = new HashMap<String, Teacher>();
    }

    /*
     * Getter for name
     *
     * inputs: void
     * outputs: string
     * */
    public String getName(){ return this.name; }

    /*
     * Getter for code
     *
     * inputs: void
     * outputs: string
     * */
    public String getCode(){ return this.code; }

    /*
     * Getter for number of hours
     *
     * inputs: void
     * outputs: int
     * */
    public int getNHours(){ return this.nhours; }

    /*
     * Setter for number of hours
     *
     * inputs: int
     * outputs: void
     * */
    public void setNHours(int hours){ this.nhours = hours; }

    /*
     * Getter for teacher list
     *
     * inputs: void
     * outputs: HashMap<String, Teacher>
     * */
    public Map<String, Teacher> getTeachers(){ return this.teachers; }

    /*
     * Setter method for unit test
     *
     * inputs: void
     * outputs: void
     * */
    public void testSetParam(){
        this.nhours = 10;
        Teacher cbf = new Teacher("Sebastien", "Combefis", 1);
        Teacher lrk = new Teacher("Quentin", "Lurkin", 2);
        this.teachers.put("1", cbf);
        this.teachers.put("2", lrk);
    }
}
