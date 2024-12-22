package altamirano.hernandez.inyeccion_dependenciasfactura.models;

public class Product {
    //Atributos
    private String nombre;
    private double precio;

    //Constructores
    public Product(){

    }
    public Product(String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    //Metodos get y set
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
