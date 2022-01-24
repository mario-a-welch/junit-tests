import org.junit.Test;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

public class MyFirstTest {
    @Test
    public void codeupIsNotCodeUp(){
        String correct = "Codeup";
        String commonly = "CodeUp";

        Assert.assertNotEquals(correct, commonly);
    }

    @Test
    public void marioIsMario(){
        String father = "Mario";
        String student = "Mario";

        Assert.assertEquals(father, student);
    }

    public void listsAreDifferent(){
        List<String> languages = new ArrayList<>();
        List<String> names = new ArrayList<>();

        Assert.assertEquals(languages, names);
//        Assert.assertNotSame(languages, names);
    }
    @Test
    public void arraysAreEqual() {
        int[] numbers = {1, 2, 3};
        int[] otherNumbers = new int[3];
        otherNumbers[0] = 1;
        otherNumbers[1] = 2;
        otherNumbers[2] = 3;

//        Assert.assertEquals(numbers, otherNumbers); --- Will Fail because it has its own method: assertArrayEquals
        Assert.assertArrayEquals(numbers, otherNumbers);
    }

    @Test
    public void funWithPHP(){
        String language = "PHP";
        Assert.assertTrue(language.contains("H"));
    }
}
