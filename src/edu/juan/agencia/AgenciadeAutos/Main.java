package edu.juan.agencia.AgenciadeAutos;
import edu.juan.agencia.AgenciadeAutos.ui.CLI;

/**
 *
 * Clase principal de sistema.
 * Es el único punto de inicio de la aplicación.
 */
public class Main {

    /**
     *
     * Método principal que inicia la ejecución del programa.
     * Llama a la interfaz de usuario por consola (CLI).
     * @param args argumentos de línea de comandos
     */
    public static void main(String[] args) {
        CLI.iniciar();
    }
}