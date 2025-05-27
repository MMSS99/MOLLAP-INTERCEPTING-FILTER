package edu.estatuas.intercepting.admin;

import edu.estatuas.intercepting.filters.Filter;
import edu.estatuas.intercepting.targets.Target;

import java.util.ArrayList;
import java.util.List;

public class TaskProgrammer {
    private Tasks task;

    public TaskProgrammer(Target target) {
        task = new Tasks();
        task.setTarget(target);
    }

    public Tasks getTasks() {
        return task;
    }

    public void setTasks(Filter filter) {
        task.addTask(filter);
    }

    public void executeTasks(String username) {
        getTasks().execute(username);
    }
}
