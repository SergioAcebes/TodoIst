
/**
 * Clase que nor permite almacenar las tareas que tendremos que hacer en el futuro.
 *
 * @SergioAcebes
 * @24/11/2017
 */
public class Todoist
{
    //tareas
    private String tarea0;

    private String tarea1;

    private String tarea2;

    /**
     * Contructor de la clase Todoist.Crea un gestor de 3 tareas(todavia vacias).
     */
    public Todoist(){
        tarea0 = null;
        tarea1 = null;
        tarea2 = null;
    }

    /**
     * Metodo que nos permite insertar una tarea en la posicion indicada.
     */
    public void addTarea(String nombreTarea, int posicion){
        if (posicion == 0){
            tarea0 = nombreTarea;
        }
        else if (posicion == 1){
            tarea1 = nombreTarea;
        }
        else if (posicion == 2){
            tarea2 = nombreTarea;
        }
    }

    /**
     * Metodo que nos permitira ver las tareas que tenemos guardadas.
     */
    public void mostrarTareas(){
        System.out.println("Tareas existentes: ");
        if (tarea0 != null){
            System.out.println("Tarea 1:" + tarea0);
        }
        if (tarea1 != null){ 
            System.out.println("Tarea 2:" + tarea1);
        }
        if (tarea2 != null){
            System.out.println("Tarea 3:" + tarea2);
        }
    }
}

