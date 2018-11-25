package UE_classes;

import org.junit.Assert;
import org.junit.Test;

public class ObserverUETest {
    ObserverUE DD4L = new ObserverUE("DD4L", "1E4014", "13152");
    ObserverUE DD4X = new ObserverUE("DD4X", "1E4015", "13152");

    @Test
    public void validate() {
        Assert.assertFalse(DD4L.getValidated());
        DD4L.validate();
        Assert.assertTrue(DD4L.getValidated());
    }

    @Test
    public void getId() {
        Assert.assertNotSame(DD4L.getId(), DD4X.getId());
    }

    @Test
    public void getOwner() {
        Assert.assertEquals("13152", DD4L.getOwner());
    }

    @Test
    public void getStatus() {
        Assert.assertFalse(DD4L.getStatus());
        DD4L.testSetParam2();
        Assert.assertTrue(DD4L.getStatus());
    }

    @Test
    public void calcValidCredits() {
        DD4L.testSetParam();
        DD4L.testSetParam2();
        Assert.assertEquals(0, DD4L.calcValidCredits());
        DD4L.getClasses().get(0).validate();
        Assert.assertEquals(0, DD4L.calcValidCredits());
        DD4L.getClasses().get(1).validate();
        Assert.assertEquals(30, DD4L.calcValidCredits());
    }

    @Test
    public void update() {
        DD4L.testSetParam();
        Assert.assertEquals(30, DD4L.getHours());
        Assert.assertEquals(30, DD4L.getCredits());
        Assert.assertEquals("base", DD4L.getInfoSheet());

        DD4L.update(99, 98, "second");
        Assert.assertEquals(99, DD4L.getCredits());
        Assert.assertEquals(98, DD4L.getHours());
        Assert.assertEquals("second", DD4L.getInfoSheet());
    }
}