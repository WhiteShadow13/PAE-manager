package People_side;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {
    private Student MS = new Student("Matt", "Smith", 11);

    @Test
    public void getID() {
        int matricule = MS.getID();

        //Assert.assertEquals(11, matricule);
    }

    @Test
    public void getStatus() {
        //Assert.assertEquals(true, false);
    }

    @Test
    public void getCredits() {
    }

    @Test
    public void getValidCredits() {
    }

    @Test
    public void newProgram() {
    }
}