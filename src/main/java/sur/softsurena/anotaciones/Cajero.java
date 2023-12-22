package sur.softsurena.anotaciones;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
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
    
    
}
