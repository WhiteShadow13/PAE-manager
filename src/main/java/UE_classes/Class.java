package UE_classes;

import People_side.Teacher;

import java.util.ArrayList;
import java.util.List;

public class Class {
    final private String name;
    final private String code;
    private int nhours;
    private List<Teacher> teachers;

    public Class(String name, String code){
        this.name = name;
        this.code = code;
        this.teachers = new ArrayList<Teacher>();
    }

    /*
     * Getter for name
     *
     * inputs: void
     * outputs: string
     * */
    public void getName(){}

    /*
     * Getter for code
     *
     * inputs: void
     * outputs: string
     * */
    public void getCode(){}

    /*
     * Getter for number of hours
     *
     * inputs: void
     * outputs: string
     * */
    public void getNHours(){}

    /*
     * Getter for teacher list
     *
     * inputs: void
     * outputs: string
     * */
    public void getTeachers(){}
}
