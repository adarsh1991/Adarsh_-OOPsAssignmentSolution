package com.greatlearning.model;

public class TechDepartment extends SuperDepartment {

    // Get department name.
    public String departmentName() {
        return "Tech Department";
    }

    // Get today's work.
    public String getTodaysWork() {
        return "Complete coding of Module 1";
    }

    // Get work deadline.
    public String getWorkDeadline() {
        return "Complete by EOD";
    }

    // Get Tech Stack info.
    public String getTechStackInformation() {
        return "Core Java";
    }
}
