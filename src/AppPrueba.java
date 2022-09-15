//importar las clases del paquete
import Personas.Persona;
import Personas.Estudiante;
import Personas.Empleado;
import Personas.TrabajadorIndependiente;
import java.util.Scanner; //libreria de scanner para ingresar información por consola


public class AppPrueba 
{
    public static void main(String args[])
    {
        // desde aca es donde se crea los objetos.
        
        Scanner sc = new Scanner(System.in); // se llama el metodo Scanner para poder ingresar valores.
        
        Estudiante unest = new Estudiante("Carlos",34,"Javeriana");
        unest.mostrarNombreUniversidad();
        
        Empleado unemp = new Empleado("Alejandra",19, 1);
        unemp.mostrarTiempoLaborado();
        
        TrabajadorIndependiente untra = new TrabajadorIndependiente("Paola", 26, "Programador");
        untra.mostrarTipoNegocio();
        
        Persona unapersona = new Persona("Ramiro", 35);
        unapersona.Saludar();
        
        Persona dospersona = new Persona("Natalia", 15);
        dospersona.Saludar();
        System.out.println("La edad de "+dospersona.nombre+" es: "+dospersona.edad);
        
        //INGRESANDO INFORMACION POR CONSOLA
        /**System.out.println("-------Registro de Personas------");
        System.out.println("Digita tu nombre: ");
        String nombreR = sc.nextLine(); // lee datos tipo String
        System.out.println("Digita tu edad: ");
        int edadR = sc.nextInt();// lee datos tipo enteros
        
        Persona trespersona = new Persona(nombreR, edadR);
        trespersona.Saludar();**/
        
        Persona trespersona = new Persona("Abril");
        trespersona.Saludar();
        trespersona.mostrarDeudas(); 
        unest.mostrarDeudas(); // llama el metodo mostrarDeudas de la clase hija "Estudiante".
        unemp.mostrarDeudas(); // llama el metodo mostrarDeudas de la clase hija "Empleado".
        untra.mostrarDeudas(); // llama el metodo mostrarDeudas de la clase hija "Trabajador independiente".
        
        //Arreglo de Personas
        Persona arregloPersonas[]= new Persona[4];
        arregloPersonas[0]=trespersona;
        arregloPersonas[1]=unest;
        arregloPersonas[2]=unemp;
        arregloPersonas[3]=untra;
        
        //ciclo for para llenar el arreglo
        for(int i=0;i<arregloPersonas.length;i++)
        {
            arregloPersonas[i].mostrarDeudas();//polimorfismo con sobrecarga de parametros sin parametros
        }
        
        for(int i=0;i<arregloPersonas.length;i++)
        {
            arregloPersonas[i].mostrarDeudas(20);//polimorfismo con sobrecarga de parametros con parametro entero
        }
        
        for(int i=0;i<arregloPersonas.length;i++)
        {
            arregloPersonas[i].mostrarDeudas("Bancaria");//polimorfismo con sobrecarga de parametros con parametro String
        }
    }
}
