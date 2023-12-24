package sur.softsurena.anotaciones;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnotacionesSpring {

    public static void main(String[] args) {
        // Pedimos el bean.
        try (AnnotationConfigApplicationContext contexto
                = new AnnotationConfigApplicationContext(
                        ContextoApp.class
                )) {
            // Pedimos el bean.
            Cajero jhironsel = contexto.getBean(
                    "beanCajero",//Aqui solo llamo la clase, debe ser minuscula al inicial.
                    Cajero.class
            );  // Pedimos el bean.
            
            System.out.println("MEMORIA: " + jhironsel);
            System.out.println("Sus tareas son: " + jhironsel.getTareas());
            System.out.println("En los informes: " + jhironsel.getInformes());
            System.out.println("Correo: "+jhironsel.getCorreo());
            System.out.println("Zona: "+jhironsel.getZona());
            System.out.println("");
        }
    }
}
