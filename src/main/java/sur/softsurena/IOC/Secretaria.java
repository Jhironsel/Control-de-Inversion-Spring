package sur.softsurena.IOC;

public class Secretaria implements IPersona {

    @Override
    public String getOficio() {
        return "Escribo cartas y tomo notas.";
    }

    @Override
    public String getInforme() {
        return "Las secretarias hacen informe todos los dias.";
    }
    
}
