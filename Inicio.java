import java.util.Scanner;
import java.util.GregorianCalendar;

public class Inicio
{
    static Scanner teclado = new Scanner(System.in);
    static Viaje v;
    
    public static void main(String [] args)
    {
        int opcion;
        
        do 
        {
            String mensajeMenu = "MENU PRINCIPAL \n"+
                                 "1) Crear viaje \n"+
                                 "2) Añadir pasajeros al viaje \n"+
                                 "3) Mostrar pasajeros \n"+
                                 "4) Asignar bus \n"+
                                 "5) Buscar pasajeros en el viaje \n"+
                                 "0) Salir";
            System.out.println(mensajeMenu);
            opcion = Integer.parseInt(teclado.nextLine());
            switch(opcion)
            {
                case 1:
                    crearViaje();
                    System.out.println("Viaje creado: \n"+v.toString());
                    break;
                
                case 2:
                    anadirPasajero();
                    break;
                
                case 3:
                    System.out.println(v.presentarPasajeros());
                    break;
                    
                case 4:
                    break;
                
                case 5:
                    buscarPasajeros();
                    break;
                
                case 0:
                    break;
                    
                default:
                    
            }
        }
        while(opcion != 0);
    }
    
    public static Pasajero preguntarPasajero()
    {
        //Preguntas
        System.out.println("Ingrese nombre del pasajero:");
        String nombre = teclado.nextLine();
        System.out.println("Ingrese apellido del pasajero:");
        String apellido = teclado.nextLine();
        System.out.println("Ingrese documento del pasajero:");
        int numDocumento = Integer.parseInt(teclado.nextLine());
        String [] equipajes = new String[3];
        for (int i=0; i<3; i++)
        {
            System.out.println("Ingrese equipaje "+(i+1)+" del pasajero:");
            equipajes[i] = teclado.nextLine();    
        }
        
        Pasajero pas = new Pasajero(nombre, apellido, numDocumento, equipajes);
        return pas;
    }
    
    public static void anadirPasajero()
    {
        Pasajero p = preguntarPasajero();
        v.anadirPasajero(p);
    }
    
    public static void crearBus()
    {
        Bus b = new Bus();
    }
    
    public static GregorianCalendar preguntarFecha(String dato)
    {
        System.out.println("Ingrese fecha "+dato+" (dd-mm-yyyy):");
        String fechaS = teclado.nextLine();
        String [] datosFechaS = fechaS.split("-");
        System.out.println("Ingrese hora "+dato+" (hh:mm):");
        String horaS = teclado.nextLine();
        String [] datosHoraS = horaS.split(":");
        GregorianCalendar fecha = new GregorianCalendar(Integer.parseInt(datosFechaS[2]), 
                                                              Integer.parseInt(datosFechaS[1])-1, 
                                                              Integer.parseInt(datosFechaS[0]), 
                                                              Integer.parseInt(datosHoraS[0]), 
                                                              Integer.parseInt(datosHoraS[1]));
        return fecha;
    }
    
    public static void crearViaje() 
    {
        System.out.println("Ingrese origen:");
        String origen = teclado.nextLine();
        System.out.println("Ingrese destino:");
        String destino = teclado.nextLine();
        GregorianCalendar fechaSalida = preguntarFecha("de salida");
        GregorianCalendar fechaLlegada = preguntarFecha("de llegada");
        System.out.println("Ingrese cantidad de pasajeros:");
        int cantPasajeros = Integer.parseInt(teclado.nextLine());
        v = new Viaje(origen, destino, fechaSalida, fechaLlegada, cantPasajeros);
    }
    
    public static void buscarPasajeros()
    {
        System.out.println("Ingrese nombre, apellido o documento a buscar en el viaje");
        String criterio = teclado.nextLine();
        System.out.println("Pasajeros encontrados:");
        System.out.println(v.buscarPasajeros(criterio));
    }
    
}

