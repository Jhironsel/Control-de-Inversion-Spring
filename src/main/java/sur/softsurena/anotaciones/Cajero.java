package sur.softsurena.anotaciones;

import org.springframework.stereotype.Component;

@Component("beanCajero")
public class Cajero implements IEmpleados {

    @Override
    public String getTareas() {
        return "Realizo las facturas del establecimiento.";
    }

    @Override
    public String getInformes() {
        return "Realizo los cuadres los cuales deben coincidir con el cuadre.";
    }
    
}
