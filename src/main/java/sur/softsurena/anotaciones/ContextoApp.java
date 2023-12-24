package sur.softsurena.anotaciones;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("sur.softsurena.anotaciones")
public class ContextoApp {
    
    public InformeFinacieroTRIM1 informeFinanciero1(){
        return new InformeFinacieroTRIM1();
    }
    
    public InformeFinacieroTRIM2 informeFinanciero2(){
        return new InformeFinacieroTRIM2();
    }
    
    public InformeFinacieroTRIM3 informeFinanciero3(){
        return new InformeFinacieroTRIM3();
    }
    
    public InformeFinacieroTRIM4 informeFinanciero4(){
        return new InformeFinacieroTRIM4();
    }
    
    @Bean
    public Cajero beanCajero(){
        return new Cajero(informeFinanciero4());
    }
}
