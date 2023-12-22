package sur.softsurena.IOC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoIoC {

    public static void main(String[] args) {
        
        try (ClassPathXmlApplicationContext contexto //La variable context 
                = new ClassPathXmlApplicationContext(
                        "contextoApp.xml" //Aqui esta el archivo xml.
                )) {
            //
            IPersona secretaria, jefe;
            Ingeniero ingeniero;
            
            secretaria = contexto.getBean(
                    "miSecretaria",
                    IPersona.class
            );
            
            jefe = contexto.getBean(
                    "miJefe",
                    IPersona.class
            );
            
            ingeniero = contexto.getBean(
                    "miIngeniero", 
                    Ingeniero.class
            );
            /*
                He realizado una modificacion en el archivo xml, el cual agrego
            la propiedad scope al bean de secretario, el cual le pase como valor
            prototype, ahora este bean envia instancia en diferentes memorias 
            del sistema.
            */
            System.out.println("");
            System.out.println("Memoria: "+secretaria);
            System.out.println("Su tarea es: " + secretaria.getOficio());
            System.out.println("Sobre Informe: " + secretaria.getInforme());
            
            /*
                El bean de jefe no tiene la propiedad scope seteada, pero por 
            defecto spring utiliza el patron de diseño singleton. Es por ellos
            que vez que tiene la misma direccion de memoria. 
            */
            System.out.println("");
            System.out.println("Memoria: "+jefe);
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
