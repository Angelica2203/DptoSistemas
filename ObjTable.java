public class ObjTable 
{
    private String serial;
    private String marca;
    private Double tamaño;
    private Double precio;
    private String nombreUsuario;
    private String carnet;
    private boolean disponible;
    public ObjTable() {
    }
    public ObjTable(String serial, String marca, Double tamaño, Double precio, String nombreUsuario, String carnet,
            boolean disponible) {
        this.serial = serial;
        this.marca = marca;
        this.tamaño = tamaño;
        this.precio = precio;
        this.nombreUsuario = nombreUsuario;
        this.carnet = carnet;
        this.disponible = disponible;
    }
    public String getSerial() {
        return serial;
    }
    public void setSerial(String serial) {
        this.serial = serial;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public Double getTamaño() {
        return tamaño;
    }
    public void setTamaño(Double tamaño) {
        this.tamaño = tamaño;
    }
    public Double getPrecio() {
        return precio;
    }
    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    public String getNombreUsuario() {
        return nombreUsuario;
    }
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
    public String getCarnet() {
        return carnet;
    }
    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }
    public boolean isDisponible() {
        return disponible;
    }
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    

    
    //.oferr es como el push en pilas
    //= new Linked
}
