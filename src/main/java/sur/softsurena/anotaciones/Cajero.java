package sur.softsurena.anotaciones;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component//Si eliminamos el ID del componente podemos llamar la clase desde getbean.
public class Cajero implements IEmpleados {
    
    private IInformes informeFinaciero;

    @Autowired
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
    
    
}
