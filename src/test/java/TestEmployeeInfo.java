import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestEmployeeInfo {

    @Test
    public void checkGetEmployeeFirstName(){
        EmployeeInfo testObject = new EmployeeInfo("Charlie");

        String expected = "Charlie";
        String actual = testObject.getFirstName();

        Assertions.assertEquals(expected, actual);

    }
}
