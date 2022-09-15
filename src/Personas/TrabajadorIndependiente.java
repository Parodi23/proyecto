package Personas;

public class TrabajadorIndependiente extends Persona
{
    public String tiponegocio;
    
    //Constructore
    public TrabajadorIndependiente(String nombre, int edad, String tiponegocio)
    {
        super(nombre, edad);
        this.tiponegocio = tiponegocio;
    }
    
    //metodos
    public void mostrarTipoNegocio()
    {
        this.Saludar();
        System.out.println("Mi tipo de negocio es: "+this.tiponegocio);
    }
    
    @Override //permite sobre escribir el metodo de la clase padre.
    public void mostrarDeudas()
    {
        System.out.println("Mis deudas sobrepasan los 10 millones");
    }
}
