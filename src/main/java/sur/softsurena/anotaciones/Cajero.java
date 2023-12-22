package sur.softsurena.anotaciones;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class Cajero implements IEmpleados {
    
    @Autowired
    @Qualifier("informeFinacieroTRIM1")
    private IInformes informeFinaciero;

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
        System.out.println("Final de este bean");
    }
    
    
}
