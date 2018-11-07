package UE_classes;

import com.sun.org.apache.xpath.internal.operations.Bool;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ObserverUETest {
    ObserverUE DD4L = new ObserverUE("DD4L", "1E4014");

    @Test
    public void validate() {
        Assert.assertFalse(DD4L.testValidate());
        DD4L.validate();
        Assert.assertTrue(DD4L.testValidate());
    }

    @Test
    public void getStatus() {
        Assert.assertFalse(DD4L.getStatus());
        DD4L.testSetParam();
        Assert.assertTrue(DD4L.getStatus());
    }

    @Test
    public void calcValidCredits() {
        DD4L.update();

    }

    @Test
    public void update() {
    }
}