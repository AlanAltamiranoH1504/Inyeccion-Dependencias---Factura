package altamirano.hernandez.inyeccion_dependenciasfactura.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Factura {
    //Inyeccion del Cliente
    @Autowired
    private Cliente cliente;
    //Atributos de la clase
    private String descripcion;
    private List<Item> items;

    //Constructores
    public Factura(){

    }
    public Factura(Cliente cliente, String descripcion, List<Item> items){
        this.cliente = cliente;
        this.descripcion = descripcion;
        this.items = items;
    }

    //Metodos get y set

    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public List<Item> getItems() {
        return items;
    }
    public void setItems(List<Item> items) {
        this.items = items;
    }
}
