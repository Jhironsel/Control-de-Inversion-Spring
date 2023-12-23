package sur.softsurena.anotaciones;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnotacionesSpring {

    public static void main(String[] args) {
        // Pedimos el bean.
        try (AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(
                ContextoApp.class
        )) {
            // Pedimos el bean.
            IEmpleados jhironsel = contexto.getBean(
                    "cajero",//Aqui solo llamo la clase, debe ser minuscula al inicial.
                    IEmpleados.class
            );  // Pedimos el bean.
            IEmpleados jhironsel2 = contexto.getBean(
                    "cajero",//Aqui solo llamo la clase, debe ser minuscula al inicial.
                    IEmpleados.class
            );  //Usamos el bean
            System.out.println("MEMORIA: " + jhironsel);
            System.out.println("Sus tareas son: " + jhironsel.getTareas());
            System.out.println("En los informes: " + jhironsel.getInformes());
            System.out.println("");
            //Usamos el bean
            System.out.println("MEMORIA: " + jhironsel2);
            System.out.println("Sus tareas son: " + jhironsel2.getTareas());
            System.out.println("En los informes: " + jhironsel2.getInformes());
            //Si no se cierra el contexto el @PreDestroy no funcionara.
        }
    }
}
