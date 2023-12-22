package sur.softsurena.anotaciones;

import org.springframework.stereotype.Component;

@Component
public class InformeFinacieroTRIM1 implements IInformes{

    @Override
    public String getInformeFinaciero() {
        return "Se genero el informe del trimestre 1.";
    }
    
}
