package sur.softsurena.anotaciones;

import org.springframework.stereotype.Component;

@Component
public class InformeFinacieroTRIM2 implements IInformes {

    @Override
    public String getInformeFinaciero() {
        return "Informe de TRIM 2";
    }
    
}
