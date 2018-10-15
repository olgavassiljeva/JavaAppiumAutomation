import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {

    MainClass mainClass = new MainClass();

    @Test
    public void testGetLocalNumber() {
        Assert.assertEquals("Local number should be 14", 14, mainClass.getLocalNumber());
    }

    @Test
    public void testGetClassNumber() {

        //Assertions.assertThat(mainClass.getLocalNumber()).isGreaterThan(45); // assertj library
        Assert.assertEquals("Number should be bigger than 45", 45, mainClass.getClassNumber());
    }

    @Test
    public void testGetClassString() {

        boolean isHelloPresent = mainClass.getClassString().contains("hello") || mainClass.getClassString().contains("Hello");
        Assert.assertTrue("String contains 'Hello'", isHelloPresent);
    }
}
