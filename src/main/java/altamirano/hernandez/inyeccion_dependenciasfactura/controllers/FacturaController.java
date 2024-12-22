package altamirano.hernandez.inyeccion_dependenciasfactura.controllers;

import altamirano.hernandez.inyeccion_dependenciasfactura.models.Factura;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class FacturaController {
    @Autowired
    private Factura factura;

    @GetMapping("/mostrarFactura")
    public Factura mostrarFactura(){
        return factura;
    }
}
