/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0071;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author admin
 */
class ManageTask {

    void createInforRequestedOfTask(ArrayList<Task> tasksList) {
        // delete data of taskList
        tasksList.clear();
        // read data from file to task List
        tasksList = DoFile.readFromFile("listTask.txt", tasksList);
        System.out.println("------------Add Task---------------");
        int id = DoFile.getIdFromFile();
        String requirementName = GetInput.getString("Requirement Name: ", "String invalid", "[a-zA-Z ]+");
        int taskTypeId = GetInput.getInteger("Task Type: ", "Task Type Must Be Integer Number");
        Date date = GetInput.getDate("Date: ", "Date must be format dd-MM-yyyy", "dd-MM-yyyy");
        double planFrom = GetInput.getDouble("From: ", "Plan From Must Be Number");
        double planTo = GetInput.getDouble("To: ", "Plan From Must Be Number");
        String assignee = GetInput.getString("Assignee: ", "Assignee Must Be String", "[a-zA-Z ]+");
        String expert = GetInput.getString("Reviewer: ", "Assignee Must Be String", "[a-zA-Z ]+");
        // check duplicate task 
        if (checkDuplicatePlan(date, planFrom, planTo, assignee, tasksList)) {
            System.out.println("------------Duplicate Task---------------");
        } // task is valid add task in tasksList 
        else {
            Task task = new Task(id, requirementName, taskTypeId, date, planFrom,
                    planTo, assignee, expert);
            tasksList.add(task);
            System.out.println("------------Create Successfull---------------");
            // increase id, write id to file
            DoFile.writeIdToFile(id, "id.txt");
            // write task to file
            DoFile.writeToFile("listTask.txt", tasksList);
        }
    }
    
    private boolean checkDuplicatePlan(Date date, double planFrom, double planTo, String assignee, ArrayList<Task> tasksList) {
        // for each element of tasksList
        for (Task task : tasksList) {
            // check date and assignee of new task same date and assignee of task in taskList
            if (task.getDate().equals(date) && task.getAssignee().equalsIgnoreCase(assignee)) {
                // if from 2 < form 1 && to 2 > from 1 ==> duplicate task
                if (planFrom < task.getPlanFrom() && planTo > task.getPlanFrom()) {
                    return true;
                }
                // if from 2 = from 1 ==> duplicate task
                if (planFrom == task.getPlanFrom()) {
                    return true;
                }
                // if from 2 > from 1 && from 2 < to 1 ==> duplicate task
                if (planFrom > task.getPlanFrom() && planFrom < task.getPlanTo()) {
                    return true;
                }
            }
        }
        return false;
    }

    void deleteTaskById(ArrayList<Task> tasksList) {
        tasksList.clear();
        tasksList = DoFile.readFromFile("listTask.txt", tasksList);
        // task list empty requires the user to enter the task's data first
        if (tasksList.isEmpty()) {
            System.out.println("Data of file not exist, please create information of task before");
        } // task list have data
        else {
            System.out.println("---------Del Task---------");
            Task deleteTask = findTaskById(tasksList);
            // not found id
            if (deleteTask == null) {
                System.out.println("Not Found Id");
            } // found
            else {
                tasksList.remove(deleteTask);
                System.out.println("---------Delete Successfully---------");
                DoFile.writeToFile("listTask.txt", tasksList);
            }
        }
    }
    
    private Task findTaskById(ArrayList<Task> tasksList) {
        int idDelete = GetInput.getInteger("ID: ", "Id Must Be Integer Number");
        // loop for each element in tasksList
        for (Task task : tasksList) {
            // check if the id you want to search for is same id of task in task list
            if (task.getId() == idDelete) {
                return task;
            }
        }
        return null;
    }

    void display(ArrayList<Task> tasksList) {
        tasksList.clear();
        tasksList = DoFile.readFromFile("listTask.txt", tasksList);
        // task list empty requires the user to enter the task's data first
        if (tasksList.isEmpty()) {
            System.out.println("Data of file not exist, please create information of task before");
        }// task list have data 
        else {
            System.out.println("----------------------------------------- Task ---------------------------------------");
            System.out.format("%-5s %-15s %-15s %-15s %-15s %-15s %-15s\n", "ID",
                    "Name", "Task Type", "Date", "Time", "Assignee", "Reviewer");
            // loop for each element in tasksList
            for (Task task : tasksList) {
                System.out.print(task);
            }
        }
    }
    
}
