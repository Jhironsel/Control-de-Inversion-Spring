package sur.softsurena.IOC;

public class UsoID implements IInforme {
    /**
     * En esta parte estaremos desarrollando lo que es la Inyeccion de 
     * Dependencia. ID. Esta Inyecion se va a realizar primero por constructor.
     * @return 
     */
    @Override
    public String getInforme() {
        return "Este es el informe inyectado por UsoID";
    }    
}
