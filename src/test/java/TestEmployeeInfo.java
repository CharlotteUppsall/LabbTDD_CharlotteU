import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestEmployeeInfo {

    EmployeeInfo testObject = new EmployeeInfo("Charlie", "Uppsall", 33);

    @Test
    public void testGetEmployeeFirstName(){
        String expected = "Charlie";
        String actual = testObject.getFirstName();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetEmployeeLastName(){
        String expected = "Uppsall";
        String actual = testObject.getLastName();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetEmployeeAge(){
        int expected = 33;
        int actual = testObject.getAge();

        Assertions.assertEquals(expected, actual);
    }
}
