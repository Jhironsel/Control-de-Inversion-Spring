package sur.softsurena.anotaciones;

import org.springframework.stereotype.Component;

@Component
public class InformeFinacieroTRIM4 implements IInformes {

    @Override
    public String getInformeFinaciero() {
        return "Cierre del año.";
    }
    
}
