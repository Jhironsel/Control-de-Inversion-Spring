package sur.softsurena.IOC;

public class Ingeniero implements IPersona {

    //Campos y metodos de utilizado para la inyeccion de dependencia.
    private String area;
    private int ahno;

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getAhno() {
        return ahno;
    }

    public void setAhno(int ahno) {
        this.ahno = ahno;
    }
    
    @Override
    public String getOficio() {
        return "Realizo los sistema de la empresa.";
    }

    @Override
    public String getInforme() {
        return "Yo realizo los informes en los planos.";
    }    
}
