package sur.softsurena.IOC;

public class Jefe implements IPersona {

    private IInforme iinforme;

    public void setIinforme(IInforme iinforme) {
        this.iinforme = iinforme;
    }
    
    @Override
    public String getOficio() {
        return "Solo Vengo hacer que la org. creesca.";
    }

    @Override
    public String getInforme() {
        return "Los Jefes solo leen los informes y "+iinforme.getInforme();
    }
    
    private void metodoInicial(){
        System.out.println("Iniciando en JEFE.");
    }
    
    private void metodoFinal(){
        System.out.println("Saliendo de JEFE.");
    }
    
}
