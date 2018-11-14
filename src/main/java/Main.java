import People_side.Teacher;
import UE_classes.ObservableClass;
import UE_classes.ObserverUE;

public class Main {

    public static void main( final String[] args) {
        System.out.print("Launching...");
        ObservableClass test = new ObservableClass("SA", "1111");
        test.addTeacher(new Teacher("", ""));
    }
}
