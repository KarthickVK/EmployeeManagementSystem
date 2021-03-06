package com.launchclub.employee.validation;

import com.launchclub.employee.dao.EmployeeDao;
import com.launchclub.employee.dao.EmployeeDaoImpl;

public class EmployeeValidation {

    private static final EmployeeDao EMPLOYEE_DAO = EmployeeDaoImpl.getInstance();

    /**
     * Validate Choice.
     */
    public static boolean validateChoice(final String choice) {
        return ((choice.matches("[aA-dD]")||"YES".equalsIgnoreCase(choice) || "NO".equalsIgnoreCase(choice)
                || "GOMENU".equalsIgnoreCase(choice) || "EXIT".equalsIgnoreCase(choice))) ? true : false;
    }

    /**
     * Validate employeeId already present.
     */
    public static boolean validateIdPresent(final String employeeId) {
        return (EMPLOYEE_DAO.getAllEmployees().containsKey(employeeId)) ? true : false;
    }
}
