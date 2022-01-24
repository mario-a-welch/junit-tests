import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HelloWorldTest {
    private String expected;
    private String hiMav;

    @Before
    public void setUp(){
        this.expected = "Hello, World!";
        this.hiMav = "Hello, Maverick!";
    }

    @Test
    public void testForHelloWorld(){
        Assert.assertEquals(this.expected, HelloWorld.hello());
    }

    @Test
    public void testForHelloMav(){
            Assert.assertEquals(this.hiMav, HelloWorld.hello("Maverick"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testForNull(){
        Assert.assertNotEquals("Hello, null!", HelloWorld.hello(null));
    }
}
