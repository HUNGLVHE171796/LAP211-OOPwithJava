/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0071;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author admin
 */
class Task {

    protected int id;
    protected String requirementName;
    protected int taskTypeId;
    protected Date date;
    protected double planFrom;
    protected double planTo;
    protected String assignee;
    protected String expert;

    public Task() {
    }

    public Task(int id, String requirementName, int taskTypeId, Date date, double planFrom, double planTo, String assignee, String expert) {
        this.id = id;
        this.requirementName = requirementName;
        this.taskTypeId = taskTypeId;
        this.date = date;
        this.planFrom = planFrom;
        this.planTo = planTo;
        this.assignee = assignee;
        this.expert = expert;
    }

    public int getId() {
        return id;
    }

    public String getRequirementName() {
        return requirementName;
    }

    public int getTaskTypeId() {
        return taskTypeId;
    }

    public Date getDate() {
        return date;
    }

    public double getPlanFrom() {
        return planFrom;
    }

    public double getPlanTo() {
        return planTo;
    }

    public String getAssignee() {
        return assignee;
    }

    public String getExpert() {
        return expert;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setRequirementName(String requirementName) {
        this.requirementName = requirementName;
    }

    public void setTaskTypeId(int taskTypeId) {
        this.taskTypeId = taskTypeId;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setPlanFrom(double planFrom) {
        this.planFrom = planFrom;
    }

    public void setPlanTo(double planTo) {
        this.planTo = planTo;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public void setExpert(String expert) {
        this.expert = expert;
    }
    
    public String getTaskTypeString() { 
        String taskTypeString = null;
        switch(taskTypeId) {
            case 1:
                taskTypeString = "Code";
                break;
            case 2:
                taskTypeString = "Test";
                break;
            case 3:
                taskTypeString = "Design";
                break;
            case 4:
                taskTypeString = "Review";
                break;
        }
        return taskTypeString;
    }
    
    public String getDateOfTask() { 
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        String dateOfTask = dateFormat.format(date);
        return dateOfTask;
    }
    
    public double getTime() {
        double time = 0;
        time = planTo - planFrom;
        return time;
    }

    @Override
    public String toString() {
        return String.format("%-5s %-15s %-15s %-15s %-15s %-15s %-15s\n",
                id, requirementName, getTaskTypeString(), getDateOfTask(), getTime(), assignee, expert );
    }
}
