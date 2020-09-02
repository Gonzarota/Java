public abstract class Empleado {
    
    
    private int diasVacaciones;
    
    public Empleado(int diasVacaciones){
        this.diasVacaciones=diasVacaciones;
    }
    
    public void cobrarNomina(){
        System.out.println("Nómina cobrada");
    }
    
    public void vacaciones(){
        StringBuilder sb=new StringBuilder();
        sb.append("Te quedan ");
        sb.append(diasVacaciones);
        sb.append(" días de vacaciones");
        System.out.println(sb.toString());
    }
    
    public abstract void trabajar();
    
}
