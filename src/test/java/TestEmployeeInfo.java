import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestEmployeeInfo {

    EmployeeInfo testObject = new EmployeeInfo("Charlie");

    @Test
    public void testGetEmployeeFirstName(){
        String expected = "Charlie";
        String actual = testObject.getFirstName();

        Assertions.assertEquals(expected, actual);
    }


}
