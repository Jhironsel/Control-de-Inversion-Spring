package sur.softsurena.anotaciones;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Value;

public class Cajero implements IEmpleados {
    
    private IInformes informeFinaciero;
    
    @Value("${email}")
    private String correo;
    
    @Value("${zona}")
    private String zona;

    public Cajero(IInformes informeFinaciero) {
        this.informeFinaciero = informeFinaciero;
    }
    
    @Override
    public String getTareas() {
        return "Realizo las facturas del establecimiento.";
    }

    @Override
    public String getInformes() {
        return informeFinaciero.getInformeFinaciero();
    }

    public String getCorreo() {
        return correo;
    }

    public String getZona() {
        return zona;
    }
    
    @PostConstruct
    private void inicio(){
        System.out.println("Inicio de este bean");
    }
    @PreDestroy
    private void fin(){
        //Este metodo solo funciona cuando el contexto se cierra.
        System.out.println("Final de este bean");
    }
}
