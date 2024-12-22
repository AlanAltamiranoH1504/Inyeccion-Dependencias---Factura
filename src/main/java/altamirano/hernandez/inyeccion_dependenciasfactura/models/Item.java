package altamirano.hernandez.inyeccion_dependenciasfactura.models;

public class Item {
    //Atributos
    private Product product;
    private int cantidad;

    //Constructores
    public Item(){

    }
    public Item(Product product, int cantidad){
        this.product = product;
        this.cantidad = cantidad;
    }

    //Metodos get y set
    public Product getProduct() {
        return product;
    }
    public void setProduct(Product product) {
        this.product = product;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
