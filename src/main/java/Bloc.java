import java.util.HashMap;
import java.util.Map;

public class Bloc {
    private Map<String, ObservableUE> content;

    public Bloc(HashMap<String, ObservableUE> content){
        this.content = content;
    }

    /*
     * Get a specific UE from the UE hashmap
     *
     * inputs: string (UE code)
     * outputs: ObservableUE
     * */
    public void getContent(){}
}
