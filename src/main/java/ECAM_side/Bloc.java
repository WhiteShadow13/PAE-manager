package ECAM_side;

import UE_classes.ObservableUE;

import java.util.HashMap;
import java.util.Map;

public class Bloc {
    private Map<String, ObservableUE> content;

    public Bloc(HashMap<String, ObservableUE> content){
        this.content = content;
    }

    /*
     * Get a specific UE_classes.UE from the UE_classes.UE hashmap
     *
     * inputs: string (UE_classes.UE code)
     * outputs: UE_classes.ObservableUE
     * */
    public void getContent(){}
}
