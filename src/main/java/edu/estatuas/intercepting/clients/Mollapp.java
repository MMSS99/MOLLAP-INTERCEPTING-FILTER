package edu.estatuas.intercepting.clients;

import edu.estatuas.intercepting.admin.TaskProgrammer;

import java.util.Optional;

public class Mollapp implements Client{
    private Optional<TaskProgrammer> taskProgrammer = Optional.empty();

    @Override
    public void setTaskProgrammer(TaskProgrammer taskProgrammer) {
        this.taskProgrammer = Optional.of(taskProgrammer);
    }

    @Override
    public void sendPetition(String username){
        if (taskProgrammer.isPresent()){
            taskProgrammer.get().executeTasks(username);
        } else {
            System.out.println("No task programmer found");
        };
    }


}
