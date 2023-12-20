package sur.softsurena.IOC;

public class Ingeniero implements IPersona {

    @Override
    public String getOficio() {
        return "Realizo los sistema de la empresa.";
    }

    @Override
    public String getInforme() {
        return "Yo realizo los informes en los planos.";
    }
    
}
