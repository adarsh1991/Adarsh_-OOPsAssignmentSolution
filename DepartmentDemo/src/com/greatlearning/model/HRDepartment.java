package com.greatlearning.model;

public class HRDepartment extends SuperDepartment {

    // Get department name.
    public String departmentName() {
        return "HR Department";
    }

    // Get today's work.
    public String getTodaysWork() {
        return "Fill today’s timesheet and mark your attendance";
    }

    // Get work deadline.
    public String getWorkDeadline() {
        return "Complete by EOD";
    }

    // Get activities.
    public String doActivity() {
        return "team Lunch";
    }
}
