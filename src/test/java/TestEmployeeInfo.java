import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestEmployeeInfo {

    EmployeeInfo testObject = new EmployeeInfo("Charlie", "Uppsall");

    @Test
    public void testGetEmployeeFirstName(){
        String expected = "Charlie";
        String actual = testObject.getFirstName();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetEmployeeLastName(){
        String expected = "Uppsal";
        String actual = testObject.getLastName();

        Assertions.assertEquals(expected, actual);
    }
}
