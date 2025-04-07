public class ObjTable 
{
    private String Serial;
    private String Marca;
    private int Tamaño;
    private Double Precio;
    private String NombreUsuario;
    private boolean Disponible;
    private String cedula;
    public ObjTable() {
    }
    public ObjTable(String serial, String marca, int tamaño, Double precio, String nombreUsuario, boolean disponible,
            String cedula) {
        Serial = serial;
        Marca = marca;
        Tamaño = tamaño;
        Precio = precio;
        NombreUsuario = nombreUsuario;
        Disponible = disponible;
        this.cedula = cedula;
    }
    public String getSerial() {
        return Serial;
    }
    public void setSerial(String serial) {
        Serial = serial;
    }
    public String getMarca() {
        return Marca;
    }
    public void setMarca(String marca) {
        Marca = marca;
    }
    public int getTamaño() {
        return Tamaño;
    }
    public void setTamaño(int tamaño) {
        Tamaño = tamaño;
    }
    public Double getPrecio() {
        return Precio;
    }
    public void setPrecio(Double precio) {
        Precio = precio;
    }
    public String getNombreUsuario() {
        return NombreUsuario;
    }
    public void setNombreUsuario(String nombreUsuario) {
        NombreUsuario = nombreUsuario;
    }
    public boolean isDisponible() {
        return Disponible;
    }
    public void setDisponible(boolean disponible) {
        Disponible = disponible;
    }
    public String getCedula() {
        return cedula;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    
    
    //.oferr es como el push en pilas
    //= new Linked
}
