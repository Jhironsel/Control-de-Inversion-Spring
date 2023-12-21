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
            IPersona secretaria, jefe;
            //Es necesario utilizar la clase que tiene que ver con ingeniero 
            //para poder tener acceso a los getter y setter.
            Ingeniero ingeniero;
            
            secretaria = contexto.getBean(//Aqui pedimos un bean a netbeans.
                    "miSecretaria",
                    IPersona.class
            );
            
            jefe = contexto.getBean(//Aqui pedimos un bean a netbeans.
                    "miJefe",
                    IPersona.class
            );
            
            ingeniero = contexto.getBean(
                    "miIngeniero", 
                    Ingeniero.class
            );
            
            //Fijarse que el tipo de la variable silvia es la interface.
            //Los parameros que recibe es el nombre de bean y La interface con su atributo class.
            
            //3. Utilizar el bean que hemos creado.
            System.out.println("");
            System.out.println("Su tarea es: " + secretaria.getOficio());
            System.out.println("Sobre Informe: " + secretaria.getInforme());
            
            System.out.println("");
            
            System.out.println("Su tarea es: " + jefe.getOficio());
            System.out.println("Sobre informe: " + jefe.getInforme());
            System.out.println("");
            
            //Haciendo inyeccion de campo desde los campos de la clase.
            System.out.println("Su tarea es: " + ingeniero.getOficio());
            System.out.println("Sobre informe: " + ingeniero.getInforme());
            System.out.println("Area: " + ingeniero.getArea());
            System.out.println("Año de inicio: " + ingeniero.getAhno());
            System.out.println("");
        }
        

    }
}
