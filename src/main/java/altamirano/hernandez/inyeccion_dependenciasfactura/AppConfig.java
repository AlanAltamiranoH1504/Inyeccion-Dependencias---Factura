package altamirano.hernandez.inyeccion_dependenciasfactura;

import altamirano.hernandez.inyeccion_dependenciasfactura.models.Item;
import altamirano.hernandez.inyeccion_dependenciasfactura.models.Product;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AppConfig {
    @Primary
    @Bean
    List<Item> itemsFactura(){
        //Agregamos productos
        Product producto1 = new Product("Mosnter Negro", 35.50);
        Product producto2 = new Product("Monster Verde", 40.00);

        //Agregamos items (producto y cantidad)
        Item item1 = new Item(producto1, 2);
        Item item2 = new Item(producto2, 3);

        //Lista de items
        List<Item> items = new ArrayList<>();
        items.add(item1);
        items.add(item2);

        return  items;
    }

    @Bean
    List<Item> itemsFacturaOficina(){
        //Agregamos productos
        Product producto1 = new Product("Silla de Oficina", 1000);
        Product producto2 = new Product("Alexa EchoDOT 5", 850);
        Product producto3 = new Product("Cartuchos impresora", 450);
        Product producto4 = new Product("Ciento de hojas", 150);

        //Agregamos items (producto y cantidad)
        Item item1 = new Item(producto1, 3);
        Item item2 = new Item(producto2, 1);
        Item item3 = new Item(producto3, 2);
        Item item4 = new Item(producto4, 5);

        //Lista de items
        List<Item> items = new ArrayList<>();
        items.add(item1);
        items.add(item2);
        items.add(item3);
        items.add(item4);

        return  items;
    }
}
