package sur.softsurena.IOC;

public class Jefe implements IPersona {

    @Override
    public String getOficio() {
        return "Solo Vengo hacer que la org. creesca.";
    }

    @Override
    public String getInforme() {
        return "Yo solo leo los informes.";
    }
    
}
