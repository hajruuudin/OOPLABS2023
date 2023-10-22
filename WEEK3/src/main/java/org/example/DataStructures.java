package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataStructures {
    private List<TaskItem> tasks = new ArrayList<>();

    public DataStructures() {
        tasks = Arrays.asList(
                new TaskItem(1,"Push lab code to the github", Status.TO_DO),
                new TaskItem(2,"Prepare for the quiz", Status.IN_PROGRESS),
                new TaskItem(3,"Go over tasks from lab2", Status.COMPLETED));
    }

    public List<TaskItem> getAll(){
        return this.tasks;
    }

    public List<TaskItem> getByStatus(Status stat){
        return (List<TaskItem>) tasks
                .stream()
                .filter(tasks -> {return tasks.getStatus().equals(stat);});
    }

    public List<TaskItem> getParam2(){
        return tasks
                .stream()
                .filter(tasks -> tasks.getTaskId() >= 2)
                .toList();
    }

    public void multiplyAgeAndPrint(){
        tasks.stream().map(task -> task.getTaskDescription()).forEach(x -> {
            System.out.println(x);
        });
    }
}
