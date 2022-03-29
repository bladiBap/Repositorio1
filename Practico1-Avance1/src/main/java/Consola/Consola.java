package Consola;

import Ventana.Ventana;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Consola {

    static Logger logger = LogManager.getRootLogger();
    public static void main(String[] args) {

        Ventana V = new Ventana();

        //logger.debug("asdasd");
        //logger.info("info");
        //logger.warn("warn");
        //logger.error("Error");

        //V.setVisible(true);
        /*
        SEVERE: Nivel de mensaje indicando un error serio.
        WARNING: Indica un error potencial.
        INFO: Para mensajes informativos
        CONFIG: Usado con mensajes relacionados con la configuración.
        FINE: Proporciona información de traza de la ejecución.
        FINER: Información de traza más detallada.
        FINEST: Información de traza muy detallada.
         */
    }
}
