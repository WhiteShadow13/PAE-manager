package UE_classes;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ObservableUETest {
    ObservableUE DD4L = new ObservableUE("DD4L", "1E4014");

    ObserverUE ue1 = new ObserverUE("DD4L", "1E4014", "13152");
    ObserverUE ue2 = new ObserverUE("DD4L", "1E4014", "13152");
    ObserverUE ue3 = new ObserverUE("DD4L", "1E4014", "13152");

    @Test
    public void calcHours() {
        List<ObservableClass> classes = DD4L.getClasses();
        Assert.assertEquals(0, DD4L.getHours());
        DD4L.testSetParam2();
        DD4L.calcHours();
        Assert.assertEquals(20, DD4L.getHours());
    }

    @Test
    public void duplicate() {
        DD4L.testSetParam2();
        Assert.assertTrue(DD4L.getObservers().isEmpty());
        DD4L.duplicate(ue1.getOwner(), ue1.getId());
        Assert.assertFalse(DD4L.getObservers().isEmpty());
        Assert.assertEquals(ue1.getId(), DD4L.getObservers().get(0).getId());
        Assert.assertEquals(47, ue1.getHours());
        Assert.assertNotSame(47, ue2.getHours());

        DD4L.setHours(8);
        DD4L.duplicate(ue1.getOwner(), ue1.getId());
        Assert.assertEquals(2, DD4L.getObservers().size());
        Assert.assertEquals(8, ue1.getHours());
        Assert.assertNotSame(8, ue2.getHours());
        Assert.assertNotSame(8, ue3.getHours());
    }

    @Test
    public void notifyObserver() {
    }
}