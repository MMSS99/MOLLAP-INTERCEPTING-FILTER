package edu.estatuas.intercepting.clients;

import edu.estatuas.intercepting.admin.TaskProgrammer;

public interface Client {
    void setTaskProgrammer(TaskProgrammer taskProgrammer);
    void sendPetition(String username);
}
