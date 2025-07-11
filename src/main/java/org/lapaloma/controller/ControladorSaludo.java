/**
 * 
 */
package org.lapaloma.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/*
* Isidoro Nevares Martín - Virgen de la Paloma
* Fecha creación: 7 jul 2025
*/

@RestController
public class ControladorSaludo {

    @GetMapping("/saludo/{usuario}")
    public String index(@PathVariable String usuario) {
        return "Saludo realizado por " + usuario;
    }
}
