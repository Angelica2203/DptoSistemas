public class ObjComputador 
{
    private String serial;
    private String marca;
    private int memoriaCam;
    private int discoDuro;
    private Double precio;
    private String nomEstudiante;
    private int carnet;
    private boolean disponible;
    private String cedula;
    public ObjComputador() 
    {
        
    }
    public ObjComputador(String serial, String marca, int memoriaCam, int discoDuro, Double precio,
            String nomEstudiante, int carnet, boolean disponible, String cedula) {
        this.serial = serial;
        this.marca = marca;
        this.memoriaCam = memoriaCam;
        this.discoDuro = discoDuro;
        this.precio = precio;
        this.nomEstudiante = nomEstudiante;
        this.carnet = carnet;
        this.disponible = disponible;
        this.cedula = cedula;
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
    public int getMemoriaCam() {
        return memoriaCam;
    }
    public void setMemoriaCam(int memoriaCam) {
        this.memoriaCam = memoriaCam;
    }
    public int getDiscoDuro() {
        return discoDuro;
    }
    public void setDiscoDuro(int discoDuro) {
        this.discoDuro = discoDuro;
    }
    public Double getPrecio() {
        return precio;
    }
    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    public String getNomEstudiante() {
        return nomEstudiante;
    }
    public void setNomEstudiante(String nomEstudiante) {
        this.nomEstudiante = nomEstudiante;
    }
    public int getCarnet() {
        return carnet;
    }
    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }
    public boolean isDisponible() {
        return disponible;
    }
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    public String getCedula() {
        return cedula;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    
    

}
