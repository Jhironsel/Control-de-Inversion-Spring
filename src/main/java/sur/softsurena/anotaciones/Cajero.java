package sur.softsurena.anotaciones;

import org.springframework.stereotype.Component;

@Component//Si eliminamos el ID del componente podemos llamar la clase desde getbean.
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
    
    
}
