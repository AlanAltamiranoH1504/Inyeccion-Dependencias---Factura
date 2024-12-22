package altamirano.hernandez.inyeccion_dependenciasfactura.models;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Cliente {
    //Atributos
    @Value("${config.factura.username}")
    private String name;
    @Value("${config.factura.lastname}")
    private String lastname;

    //Constrcutores
    public Cliente() {

    }
    public Cliente(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    //Metodos get y set
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
