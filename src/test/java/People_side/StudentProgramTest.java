package People_side;

import UE_classes.ObserverUE;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class StudentProgramTest {
    StudentProgram prog2018 = new StudentProgram("4MA","2018", "13152");
    ObserverUE ue1 = new ObserverUE("DD4L", "1E4014", "13152");
    ObserverUE ue2 = new ObserverUE("DD4T", "1E4015", "13152");
    ObserverUE ue3 = new ObserverUE("DD4X", "1E4016", "13152");

    @Test
    public void getContents() {
        /*List<ObserverUE> content = prog2018.getContents();
        Assert.assertTrue(content.isEmpty());
        List<ObserverUE> obsr = Arrays.asList(ue1, ue2, ue3);
        content.add(ue1);
        content.add(ue2);
        content.add(ue3);
        Assert.assertEquals(obsr, content);*/
    }

    @Test
    public void addContent() {
        /*List<ObserverUE> content = prog2018.getContents();
        Assert.assertTrue(content.isEmpty());
        prog2018.addContent("4MIN", "DD4L");
        Assert.assertEquals(ue1, prog2018.getContents().get(0));
        prog2018.addContent("4MIN", "DD4L");
        Assert.assertEquals(ue2, prog2018.getContents().get(1));*/
    }

    @Test
    public void delContent() {
    }

    @Test
    public void calcCredits() {
    }

    @Test
    public void calcValidCredits() {
    }

    @Test
    public void getUES() {
    }
}