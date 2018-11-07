package UE_classes;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ObserverClassTest {
    ObserverClass SA4T = new ObserverClass("SA4T", "1E0101");

    @Test
    public void validate() {
        Assert.assertFalse(SA4T.getValidate());
        SA4T.validate();
        Assert.assertTrue(SA4T.getValidate());
    }

    @Test
    public void firstTimeUpdate() {
        Assert.assertEquals(0, SA4T.getNHours());
        SA4T.firstTimeUpdate();
        Assert.assertNotEquals(0, SA4T.getNHours());
    }

    @Test
    public void update() {
        SA4T.update(3);
        Assert.assertEquals(3, SA4T.getNHours());
        SA4T.update(5);
        Assert.assertEquals(5, SA4T.getNHours());
    }
}