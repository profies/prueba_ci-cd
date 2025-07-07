/**
 * 
 */
package org.lapaloma.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*
* Isidoro Nevares Martín - Virgen de la Paloma
* Fecha creación: 7 jul 2025
*/

@RestController
public class ControladorSaludo {

    @GetMapping("/")
    public String index() {
        return "Saludo realizado por XXX";
    }
}
