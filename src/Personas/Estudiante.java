package Personas;

public class Estudiante extends Persona  //"extends" explicara a la maquina que estudiantes heredara los atributos y metodos de la calse padre"Persona"
{
    //definir atributo de la clase hija
    public String nombreUniversidad;
    
    //Constructor
    
    public Estudiante(String nombre, int edad, String nombreUniversidad)
    {
        super(nombre, edad);
        this.nombreUniversidad = nombreUniversidad;
    }
    
    //metodo    
    public void mostrarNombreUniversidad()
    {
        this.Saludar();//llamo el metodo del clase padre
        System.out.println("Estudio en: "+this.nombreUniversidad);
    }
    @Override //permite sobre escribir el metodo de la clase padre.
    public void mostrarDeudas()
    {
        System.out.println("Soy estudiante y no tengo deudas");
    }
    
}
