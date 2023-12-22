package sur.softsurena.anotaciones;

import org.springframework.stereotype.Component;

@Component
public class InformeFinacieroTRIM3 implements IInformes {

    @Override
    public String getInformeFinaciero() {
        return "Informe numero 3 del año.";
    }
    
}
