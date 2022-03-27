package com.greatlearning.driver;

import com.greatlearning.model.AdminDepartment;
import com.greatlearning.model.HRDepartment;
import com.greatlearning.model.TechDepartment;

public class MainDriver {
    public static void main(String[] args) {

        // Create Admin, HR and Tech departments.
        AdminDepartment admin = new AdminDepartment();
        HRDepartment hr = new HRDepartment();
        TechDepartment tech = new TechDepartment();

        // Functionalities of Admin Department.
        System.out.println("Welcome to " + admin.departmentName());
        System.out.println(admin.getTodaysWork());
        System.out.println(admin.getWorkDeadline());
        System.out.println(admin.isTodayHoliday());
        System.out.println();

        // Functionalities of HrDepartment
        System.out.println("Welcome to " + hr.departmentName());
        System.out.println(hr.doActivity());
        System.out.println(hr.getTodaysWork());
        System.out.println(hr.getWorkDeadline());
        System.out.println(hr.isTodayHoliday());
        System.out.println();

        // Functionalities of TechDepartment
        System.out.println("Welcome to " + tech.departmentName());
        System.out.println(tech.getTodaysWork());
        System.out.println(tech.getWorkDeadline());
        System.out.println(tech.getTechStackInformation());
        System.out.println(tech.isTodayHoliday());
    }
}
