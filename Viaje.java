import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class Viaje
{
    private String origen;
    private String destino;
    private GregorianCalendar horaSalida;
    private GregorianCalendar horaLlegada;
    private Bus bus;
    
    private List<Pasajero> listaPasajeros;
    
    private int cantPasajeros;
    private int cont;
    
    public Viaje()
    {
        
    }
    
    public Viaje(String origen, String destino, GregorianCalendar horaSalida, GregorianCalendar horaLlegada, int cantPasajeros)
    {
        this.origen = origen;
        this.destino = destino;
        this.horaSalida = horaSalida;
        this.horaLlegada = horaLlegada;
        this.cantPasajeros = cantPasajeros;
        
        listaPasajeros = new ArrayList<Pasajero>();
        
        this.cont = 0;
    }
    
    public String getOrigen()
    {
        return this.origen;
    }

    public void setOrigen(String origen)
    {
        this.origen = origen;
    }

    public String getDestino()
    {
        return this.destino;
    }

    public void setDestino(String destino)
    {
        this.destino = destino;
    }

    public GregorianCalendar getHoraSalida()
    {
        return this.horaSalida;
    }

    public void setHoraSalida(GregorianCalendar horaSalida)
    {
        this.horaSalida = horaSalida;
    }

    public GregorianCalendar getHoraLlegada()
    {
        return this.horaLlegada;
    }

    public void setHoraLlegada(GregorianCalendar horaLlegada)
    {
        this.horaLlegada = horaLlegada;
    }

    public Bus getBus()
    {
        return this.bus;
    }

    public void setBus(Bus bus)
    {
        this.bus = bus;
    }

    public int getCantPasajeros()
    {
        return this.cantPasajeros;
    }
    
    public void anadirPasajero(Pasajero p)
    {
        this.listaPasajeros.add(p);
    }
    
    public void setPasajeros(int cantPasajeros)
    {
        this.cantPasajeros = cantPasajeros;
    }
    
    public String presentarPasajeros()
    {
        String listado = "";
 
        int i = 0;
        for (Pasajero pas: listaPasajeros)
        {
            listado = listado + "Pasajero #"+(i+1) + "\n" + pas.toString() + "\n";
            i++;
        }
        
        return listado;
    }
    
    public String buscarPasajeros(String criterio)
    {
        String listado = "";
        for (Pasajero pas: listaPasajeros)
        {
            int i=0;
            if (pas.getNombre().equals(criterio) || pas.getApellido().equals(criterio) || (pas.getNumDocumento()+"").equals(criterio))
            {
                listado = listado + "Pasajero #"+(i+1) + "\n" + pas.toString() + "\n";    
            }
            i++;
        }
        return listado;
    }
    
    public String toString()
    {
        SimpleDateFormat formato = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss");
        return  "Viaje"+"\n"+
                "  Origen: "+this.origen+"\n"+
                "  Destino: "+this.destino+"\n"+
                "  Hora salida: "+formato.format(this.horaSalida.getTime())+"\n"+
                "  Hora llegada: "+formato.format(this.horaLlegada.getTime());
    }

}