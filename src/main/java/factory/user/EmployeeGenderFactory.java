package factory.user;

import domain.user.EmployeeGender;

public class EmployeeGenderFactory {


    public static EmployeeGender buildEmployeeGender(int empId, int genderId){

        return new EmployeeGender().employeeGender(genderId, empId);
    }

}
