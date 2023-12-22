package sur.softsurena.anotaciones;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnotacionesSpring {
    public static void main(String[] args) {
        // Llamamos el archivo xml.
        // Yo utilizo un try resources para dejar que sea este que cierre el 
        // contexto.
        try(ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext(
                "contextoApp.xml"
        )){
            
            // Pedimos el bean.
            IEmpleados jhironsel = contexto.getBean(
                    "beanCajero", 
                    IEmpleados.class
            );
        
            //Usamos el bean
            
            System.out.println("Sus tareas son: "+jhironsel.getTareas());
            System.out.println("En los informes: "+jhironsel.getInformes());
        }
        
        
    }
}
