package edu.estatuas.intercepting.admin;

import edu.estatuas.intercepting.filters.Filter;
import edu.estatuas.intercepting.targets.Target;

import java.util.ArrayList;
import java.util.List;

public class Tasks {
    private List<Filter> tasklist = new ArrayList<Filter>();

    private Target target = null;

    public List<Filter> getTasklist() { return tasklist; }

    public Target getTarget() { return target; }

    public void setTarget(Target target) { this.target = target; }

    public void addTask(Filter task) { tasklist.add(task); }

    public void execute(String username){

    }


}


