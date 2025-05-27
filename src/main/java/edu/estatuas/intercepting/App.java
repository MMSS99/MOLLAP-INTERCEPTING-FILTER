package edu.estatuas.intercepting;

import edu.estatuas.intercepting.admin.TaskProgrammer;
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
    }
}