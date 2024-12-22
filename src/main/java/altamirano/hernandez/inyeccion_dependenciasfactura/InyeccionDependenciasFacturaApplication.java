package altamirano.hernandez.inyeccion_dependenciasfactura;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@SpringBootApplication
@PropertySources({
        @PropertySource("classpath:nuevasPropiedades.properties")
})
public class InyeccionDependenciasFacturaApplication {

    public static void main(String[] args) {
        SpringApplication.run(InyeccionDependenciasFacturaApplication.class, args);
    }

}
