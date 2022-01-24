import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CohortTest {
    Cohort firstCohort;
    Student mario;
    Student maverick;

    @Before
    public void setUp(){
        firstCohort = new Cohort();
        mario = new Student(1234, "Mario");
        maverick = new Student(7777, "Maverick");
    }

    @Test
    public void testAddStudent(){
        Assert.assertTrue(firstCohort.getStudents().isEmpty());
        firstCohort.addStudent(mario);
        firstCohort.addStudent(maverick);
        Assert.assertEquals(2, firstCohort.getStudents().size());
    }

    @Test
    public void testGetStudents(){
        firstCohort.addStudent(mario);
        firstCohort.addStudent(maverick);
        Assert.assertEquals(mario, firstCohort.getStudents().get(0));
        Assert.assertEquals(maverick, firstCohort.getStudents().get(1));
    }

    @Test
    public void testCohortAverage(){
        firstCohort.addStudent(mario);
        mario.addGrade(100);
        mario.addGrade(80);

        firstCohort.addStudent(maverick);
        maverick.addGrade(100);
        maverick.addGrade(80);

        Assert.assertEquals(90, firstCohort.getCohortAverage(), 0);
    }
}
