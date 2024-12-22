package altamirano.hernandez.inyeccion_dependenciasfactura.models;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Factura {
    //Inyeccion del Cliente
    @Autowired
    private Cliente cliente;
    //Atributos de la clase
    @Value("${config.Factura.descripcion}")
    private String descripcion;
    //Inyectamos la lista de items
    @Autowired
    private List<Item> items;

    //Constructores
    public Factura(){

    }
    public Factura(Cliente cliente, String descripcion, List<Item> items){
        this.cliente = cliente;
        this.descripcion = descripcion;
        this.items = items;
    }

    //Metod PostContructor
    @PostConstruct
    public void init(){
        System.out.println("Creando el componente de la factura");
        this.cliente.setName(cliente.getName().concat(" - CMDX"));
        descripcion = this.descripcion.concat("- WALTMART");
    }
    //Metod PreDestroy
    @PreDestroy
    public void finish(){
        System.out.println("Se destruyo el componente Factura");
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

    //Calculamos el total de la factura
    public double getTotalFactura(){
        double total = 0;
        for (var item: this.items){
            total += item.getimporteItem();
        }
        return total;
    }
}
