package sur.softsurena.IOC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoIoC {

    public static void main(String[] args) {
        /*
        Esta es la forma tradicional de hacer instancias de nuestras clases.
        La forma en como se usaba. 
        Persona empleado = new Ingeniero();
        System.out.println(empleado.getOficio());
        */

        //1. cargar el archivo xml.
        try (ClassPathXmlApplicationContext contexto //La variable context 
                = new ClassPathXmlApplicationContext(
                        "contextoApp.xml" //Aqui esta el archivo xml.
                )) {
            //2. Pedir el bean
            IPersona silvia;
            IPersona jhironsel;
            silvia = contexto.getBean(//Aqui pedimos un bean a netbeans.
                    "miEmpleado",
                    IPersona.class
            );
            
            jhironsel = contexto.getBean(//Aqui pedimos un bean a netbeans.
                    "miEmpleado2",
                    IPersona.class
            );
            //Fijarse que el tipo de la variable silvia es la interface.
            //Los parameros que recibe es el nombre de bean y La interface con su atributo class.
            
            //3. Utilizar el bean que hemos creado.
            System.out.println(silvia.getClass().getCanonicalName());
            System.out.println("Su tarea es: " + silvia.getOficio());
            System.out.println("Sobre Informe: " + silvia.getInforme());
            
            System.out.println(jhironsel.getClass().getCanonicalName());
            System.out.println("Su tarea es: " + jhironsel.getOficio());
            System.out.println("Sobre informe: " + jhironsel.getInforme());
            
        }
        

    }
}
