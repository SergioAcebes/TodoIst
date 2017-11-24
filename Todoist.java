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

    /**
     * Metodo que nos devolvera el numero de tareas existentes.
     */
    public int getNumeroDeTareasPendientes(){
        return tareas.size(); 
    }

    /**
     * Metodo que imprimira por pantalla el numero de tareas pendientes.
     */
    public void mostrarNumeroTareasPendientes(){
        System.out.println(tareas.size());
    }

    /**
     * Metodo que eliminara la tarea que ocupa la posicion indicada como parametro(empezando en 0)
     * Devuelve true si la tarea existe y se elimina,false en el caso contrario.
     */
    public boolean eliminarTarea(int posicionTarea){
        boolean valorADevolver = false;
        if(posicionTarea >= 0 && posicionTarea < tareas.size()){
            tareas.remove(posicionTarea);
            valorADevolver = true;
        }
        
        return valorADevolver;
    }
}

