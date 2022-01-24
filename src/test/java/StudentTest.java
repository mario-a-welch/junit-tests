import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StudentTest {
    Student studentOne;
    Student studentTwo;


    @Before
    public void setUp(){
        studentOne = new Student("Mario", 1235);
        studentOne.addGrade(100);
        studentTwo = new Student("Alexis", 4578);
        studentTwo.addGrade(80);
        studentTwo.addGrade(100);
    }

//    @Test
//    public void studentProperlyInitialized(){
//        studentOne = new Student("Mario", 1235);
//        Assert.assertEquals("Mario", studentOne.getName());
//        Assert.assertEquals(1235, studentOne.getId());
//    }

    @Test
    public void testGetID(){
        Assert.assertEquals(1235, studentOne.getId());
        Assert.assertEquals(4578, studentTwo.getId());
    }

    @Test
    public void testGetName(){
        Assert.assertEquals("Mario", studentOne.getName());
        Assert.assertEquals("Alexis", studentTwo.getName());
    }

    @Test
    public void testAddGrade(){
        Assert.assertSame(100, studentOne.getGrades().get(0));
        Assert.assertSame(80, studentTwo.getGrades().get(0));
        Assert.assertSame(100, studentTwo.getGrades().get(1));
    }

    @Test
    public void testGetGradeAverage(){
        Assert.assertEquals(100, studentOne.getGradeAverage(), 0);
        Assert.assertEquals(90, studentTwo.getGradeAverage(), 0);
    }
}
