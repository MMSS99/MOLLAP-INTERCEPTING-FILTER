package edu.estatuas.intercepting;

import edu.estatuas.intercepting.admin.TaskProgrammer;
import edu.estatuas.intercepting.clients.Mollapp;
import edu.estatuas.intercepting.filters.Authentication;
import edu.estatuas.intercepting.filters.Autorization;
import edu.estatuas.intercepting.targets.Vehicle;

public class App {
    public static void main(String[] args) {
        /**
         * Configuracion del programador de tareas
         * del sistema con el tipo de target elegido:
         * desde vehiculos a cualquier cosa que admita
         * la recepcion de un mensaje.
         */
        TaskProgrammer taskProgrammer = new TaskProgrammer(new Vehicle());

        /**
         * Añadir al sistema las tareas que queremos que el sistema
         * ejecute al recibir la peticion del cliente.
         */
        taskProgrammer.setTasks(new Authentication());
        taskProgrammer.setTasks(new Autorization());

        /**
         * Configuracion de la app cliente para que
         * ejecute las tareas programades y
         * envie el mensaje al sistema.
         */
        Mollapp mollapp = new Mollapp();
        mollapp.setTaskProgrammer(taskProgrammer);
        mollapp.sendPetition("Francis");
    }
}