import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

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
        String expected = "Charlotte";
        testObject1.setFirstName(expected);
        String actual = testObject1.getFirstName();

        assertEquals(expected, actual);
    }

    @Test
    public void testGetEmployeeLastName(){
        String expected = "Uppsall";
        String actual = testObject1.getLastName();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetEmployeeLastName(){
        String expected = "Morling-Uppsall";
        testObject1.setLastName(expected);
        String actual = testObject1.getLastName();

        assertEquals(expected, actual);
    }

    @Test
    public void testGetEmployeeAge(){
        int expected = 33;
        int actual = testObject1.getEmployeeAge();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetEmployeeAge(){
        int expected = 34;
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
        double expected = 29000;
        testObject1.setIncreasedSalary(expected);
        double actual = testObject1.getEmployeeSalary();

        assertEquals(expected, actual);
    }

    @Test
    public void testGetUniqeID_of_EmployeeOne(){
        int actual = testObject1.getUniqeEmployeeID();
        int expected = 1;

        assertEquals(expected, actual);
    }

}
