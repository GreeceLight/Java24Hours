package com.java24hours;

import java.util.HashMap;
import java.util.Map;

public class Company {
    HashMap<String, String> employees = new HashMap<>();

    public listEmails(){
        employees.put("Michael", "example1@gmail.com");
        employees.put("Reece", "example2@gmail.com");
        employees.put("Shaquille", "example3@gmail.com");

        for (Map.Entry<String, String> employee: employees.entrySet()
             ) {
            String employeeName = employee.getKey();
            String employeeEmail = employee.getValue();
            System.out.println(employeeName + " " + employeeEmail);
        }
    }

    public static void main(String[] args) {
        new listEmails();
    }
}
