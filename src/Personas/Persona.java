package Personas;

public class Persona 
{
    //definir atributos del objeto
    public String nombre;
    public int edad;
    
    //Constructores
    public Persona(String nombre, int edad)
    {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public Persona(String nombre)
    {
        this.nombre = nombre;
    }  

    
    //metodos del objeto
    public void Saludar()
    {
        System.out.println("Hola, me llamo "+ nombre + ", tengo "+edad+" años");
    }
    
    public void mostrarDeudas()  //polimorfismo con sobrecarga de parametros sin parametros
    {
        System.out.println("Deudas por Doquier");
    }
    
    public void mostrarDeudas(int deuda) //polimorfismo con sobrecarga de parametros con parametro entero
    {
        System.out.println("Mi deuda es de: "+deuda);
    }
    
    public void mostrarDeudas(String tipoDeuda) //polimorfismo con sobrecarga de parametros con parametro String
    {
        System.out.println("Mi tipo de deuda es: "+tipoDeuda);
    }
}
