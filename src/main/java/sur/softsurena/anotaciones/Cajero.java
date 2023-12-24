package sur.softsurena.anotaciones;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class Cajero implements IEmpleados {
    
    private IInformes informeFinaciero;

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
