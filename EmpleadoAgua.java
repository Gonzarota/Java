public class EmpleadoAgua extends Empleado {

    public EmpleadoAgua(int diasVacaciones) {
        super(diasVacaciones);
    }

    public void echoAgua(){
        System.out.println("Echo agua");
    }

    @Override
    public void trabajar() {
        echoAgua();
    }
}
