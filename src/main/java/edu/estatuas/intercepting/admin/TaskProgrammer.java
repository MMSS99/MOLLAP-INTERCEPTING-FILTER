package edu.estatuas.intercepting.admin;

import edu.estatuas.intercepting.filters.Filter;
import edu.estatuas.intercepting.targets.Target;

import java.util.ArrayList;
import java.util.List;

public class TaskProgrammer {
    private Filter filter;
    private Tasks task = null;

    public TaskProgrammer(Target target) {
        this.filter = filter;
    }

    public Tasks getTasks() {
        return task;
    }

    public void setTasks(Tasks task) {
        this.task = task;
    }

    public void setFilter(Filter filter) {
        this.filter = filter;
    }

    public void executeTasks(String username) {
        getTasks().execute(username);
    }
}
