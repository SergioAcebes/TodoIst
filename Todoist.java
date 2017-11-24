import java.util.ArrayList;
/**
 * Clase que nor permite almacenar las tareas que tendremos que hacer en el futuro.
 *
 * @SergioAcebes
 * @24/11/2017
 */
public class Todoist
{
    //tareas
    private ArrayList<String> tareas;
    /**
     * Contructor de la clase Todoist.Crea un gestor de 3 tareas(todavia vacias).
     */
    public Todoist(){
        tareas = new ArrayList<String>();
    }

    /**
     * Metodo que nos permite insertar una nueva tarea.
     */
    public void addTarea(String nombreTarea){
        tareas.add(nombreTarea);
    }

    /**
     * Metodo que nos permitira ver las tareas que tenemos guardadas.
     */
    public void mostrarTareas(){
        System.out.println("Tareas existentes: ");
        System.out.println(tareas);
    }
}

