package com.greatlearning.model;

public class AdminDepartment extends SuperDepartment {

    // Get department name.
    public String departmentName() {
        return "Admin Department";
    }

    // Get today's work.
    public String getTodaysWork() {
        return "Complete your documents submission";
    }

    // Get work deadline.
    public String getWorkDeadline() {
        return "Complete by EOD";
    }
}
