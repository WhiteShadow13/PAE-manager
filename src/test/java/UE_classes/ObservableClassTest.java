package UE_classes;

import People_side.Teacher;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ObservableClassTest {
    ObservableClass SA4T = new ObservableClass("SA4T", "1E0101");
    Teacher cbf = new Teacher("Sebastien", "Combefis", 1);
    Teacher lrk = new Teacher("Quentin", "Lurkin", 2);

    @Test
    public void setNHours() {
        /*Assert.assertEquals(10, SA4T.getNHours());
        SA4T.setNHours(9);
        Assert.assertEquals(9, SA4T.getNHours());*/
    }

    @Test
    public void addTeacher() {
        /*List<ObserverClass> observers = SA4T.getObservers();
        Assert.assertTrue(observers.isEmpty());
        SA4T.addTeacher(cbf);
        Assert.assertFalse(observers.isEmpty());
        SA4T.addTeacher(lrk);
        Assert.assertEquals(2, observers.size());
        Assert.assertEquals(cbf, observers.get(0));
        Assert.assertEquals(lrk, observers.get(1));*/
    }

    @Test
    public void delTeacher() {
        /*List<ObserverClass> observers = SA4T.getObservers();
        SA4T.addTeacher(cbf);
        SA4T.addTeacher(lrk);
        Assert.assertEquals(2, observers.size());
        SA4T.delTeacher(1);
        Assert.assertEquals(1, observers.size());
        Assert.assertEquals(lrk, observers.get(0));*/
    }

    @Test
    public void duplicate() {

    }

    @Test
    public void notifyObservers() {
    }
}