package Personas;

public class Empleado extends Persona
{
    public int tiempoLaborado;
    
    //Contructor
    public Empleado(String nombre, int edad, int tiempoLaborado)
    {
        super(nombre, edad);
        this.tiempoLaborado = tiempoLaborado;
    }
    //metodo
    public void mostrarTiempoLaborado()
    {
        this.Saludar();
        System.out.println("Los años trabajados son: "+this.tiempoLaborado);
    }
    
    @Override //permite sobre escribir el metodo de la clase padre.
    public void mostrarDeudas()
    {
        System.out.println("Mis deudas son de 800.000");
    }
}
