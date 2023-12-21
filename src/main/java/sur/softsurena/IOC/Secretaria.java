package sur.softsurena.IOC;

public class Secretaria implements IPersona {
    
    private final IInforme nuevoInforme;

    //Creacion de constructor que inyecta la dependencia.
    public Secretaria(IInforme nuevoInforme) {
        this.nuevoInforme = nuevoInforme;
    }
    
    @Override
    public String getOficio() {
        return "Escribo cartas y tomo notas.";
    }

    @Override
    public String getInforme() {
        return "Las secretarias hacen informe del tipo y "+nuevoInforme.getInforme();
    }
    
}
