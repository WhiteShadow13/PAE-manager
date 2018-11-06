package UE_classes;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ClassTest {
    Class SA4T = new Class("SA4T", "1E0101");

    @Test
    public void getName() {
        Assert.assertEquals("SA4T", SA4T.getName());
    }

    @Test
    public void getCode() {
        Assert.assertEquals("1E0101", SA4T.getCode());
    }

    @Test
    public void getNHours() {
        SA4T.testSetParam();
        Assert.assertEquals(10, SA4T.getNHours());
    }

    @Test
    public void getTeachers() {
        Assert.assertTrue(false);
    }
}