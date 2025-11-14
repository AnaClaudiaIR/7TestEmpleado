public class Gerente extends Empleado{
    private double bono;

    public Gerente(String nombre, double salario, String departamento, double bono) {
        super(nombre,salario,departamento);
        this.bono = bono;
    }

    public String toString(){
        return super.toString() + "\nBono: " + bono;
    }
}
