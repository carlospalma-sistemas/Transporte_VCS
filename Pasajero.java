public class Pasajero
{
    private String nombre;
    private String apellido;
    private int numDocumento;
    private String [] equipajes;
    
    //Constructor vacío
    public Pasajero()
    {
        this.nombre = "";
        this.apellido = "";
        this.numDocumento = 0;
        this.equipajes = new String[3];
        this.equipajes[0] = "";
        this.equipajes[1] = "";
        this.equipajes[2] = "";
    }
    
    //Constructor con datos
    public Pasajero(String nombre, String apellido, int numDocumento, String [] equipajes)
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numDocumento = numDocumento;
        this.equipajes = equipajes;
    }
    
    void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    
    void setApellido(String apellido)
    {
        this.apellido = apellido;
    }
    
    public void setNumDocumento(int numDocumento)
    {
        this.numDocumento = numDocumento;
    }
    
    public void setEquipajes(String [] equipajes)
    {
        this.equipajes = equipajes;
    }
    
    public String getNombre()
    {
        return this.nombre;
    }
    
    public String getApellido()
    {
        return this.apellido;
    }
    
    public int getNumDocumento()
    {
        return this.numDocumento;
    }
    
    public String [] getEquipajes()
    {
        return this.equipajes;
    }
    
    public String toString()
    {
        return  "  Nombre: "+this.nombre+"\n"+
                "  Apellido: "+this.apellido+"\n"+
                "  Documento: "+this.numDocumento+"\n"+
                "  Equipajes: "+this.equipajes[0] + " , " + this.equipajes[1] + " , " +this.equipajes[2];
    }
}


