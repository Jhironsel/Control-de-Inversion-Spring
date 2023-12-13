package sur.softsurena.IOC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoIoC {

    public static void main(String[] args) {
        /*Persona empleado = new Ingeniero();
        System.out.println(empleado.getOficio());*/
        //1. cargar el archivo xml.

        try (ClassPathXmlApplicationContext contexto
                = new ClassPathXmlApplicationContext(
                        "contextoApp.xml"
                )) {
            //2. Pedir el bean
            Persona silvia = contexto.getBean(
                    "miEmpleado",
                    Persona.class
            );

            //3. Utilizar el bean
            System.out.println(silvia.getClass().getCanonicalName());
            System.out.println("Su tarea es: " + silvia.getOficio());
        }

    }
}
