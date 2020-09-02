public class EmpleadoArena extends  Empleado{

    public EmpleadoArena(int diasVacaciones) {
        super(diasVacaciones);
    }

    public void sacarArena(){
        System.out.println("Saco arena");
    }

    @Override
    public void trabajar() {
        sacarArena();
    }
}
