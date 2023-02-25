package org.example;

import java.util.ArrayList;

public class SearchService {
    public String employeeSearch(String firstName, String secondName, Director director){
        for (Employee employee: director.employees){
        if(employee.getFirstName().equals(firstName) && employee.getSecondName().equals(secondName)){
            return " EMPLOYEE EXISTS: "+ employee;
        }else if(employee instanceof Director ){
                    return employeeSearch(firstName, secondName,(Director) employee);
                }
            }
        return "EMPLOYEE DOES NOT EXIST";

    }
}
