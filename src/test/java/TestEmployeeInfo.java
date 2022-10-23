import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestEmployeeInfo {

    EmployeeInfo testObject1;
    EmployeeInfo testObject2;
    EmployeeInfo testObject3;

    @BeforeEach
    public void setUpData(){
        testObject1 = new EmployeeInfo("Bellatrix", "Lestrange", 24, 26500);
        testObject2 = new EmployeeInfo("Severus", "Snape", 29, 34200);
        testObject3 = new EmployeeInfo("Tom Marvolo", "Riddle", 32, 55400);
    }

    @Test
    public void testGetEmployeeFirstName(){
        String expected = "Bellatrix";
        String actual = testObject1.getFirstName();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetEmployeeFirstName(){
        String expected = "Voldemort";
        testObject3.setFirstName(expected);
        String actual = testObject3.getFirstName();

        assertEquals(expected, actual);
    }

    @Test
    public void testGetEmployeeLastName(){
        String expected = "Snape";
        String actual = testObject2.getLastName();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetEmployeeLastName(){
        String expected = "The Dark Lord";
        testObject3.setLastName(expected);
        String actual = testObject3.getLastName();

        assertEquals(expected, actual);
    }

    @Test
    public void testGetEmployeeAge(){
        int expected = 24;
        int actual = testObject1.getEmployeeAge();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetEmployeeAge(){
        int expected = 25;
        testObject1.setEmployeeAge(expected);
        int actual = testObject1.getEmployeeAge();

        assertEquals(expected, actual);
    }

    @Test
    public void testGetEmployeeSalary(){
        double expected = 26500;
        double actual = testObject1.getEmployeeSalary();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetIncreasedSalary(){
        double expected = 36400;
        testObject2.setIncreasedSalary(expected);
        double actual = testObject2.getEmployeeSalary();

        assertEquals(expected, actual);
    }

    @Test
    public void testGetUniqeID_of_EmployeeOne(){
        int actual = testObject1.getUniqeEmployeeID();
        int expected = testObject2.getUniqeEmployeeID()-1;

        assertEquals(expected, actual);
    }

}
