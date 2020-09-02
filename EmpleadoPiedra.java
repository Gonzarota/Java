public class EmpleadoPiedra extends Empleado {
    
    public EmpleadoPiedra(int diasVacaciones){
        super(diasVacaciones);
    }

    @Override
    public void trabajar() {
        picarPiedra();
    }

    public void picarPiedra(){
        System.out.println("Pico piedra");
    }
}
