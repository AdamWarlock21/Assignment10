package factory.user;

import domain.user.EmployeeGender;
import factory.user.EmployeeGenderFactory;
import org.junit.Assert;
import org.junit.Test;

public class EmployeeGenderFactoryTest {

    @Test
    public void buildEmployeeGender() {

        EmployeeGender employeeGender = EmployeeGenderFactory.buildEmployeeGender(1, 1);
        Assert.assertNotNull(employeeGender);

    }

}