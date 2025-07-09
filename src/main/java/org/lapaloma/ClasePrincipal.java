/**
 * 
 */
package org.lapaloma;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

/*
* Isidoro Nevares Martín - Virgen de la Paloma
* Fecha creación: 7 jul 2025
*/
@SpringBootApplication
public class ClasePrincipal {

    /**
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(ClasePrincipal.class, args);
    }
    
    @PostConstruct
    public void init()
    {
        Logger log = LoggerFactory.getLogger(ClasePrincipal.class);
        log.info("Java app started");
    }

    public String getStatus() {
        return "OK";
    }
}
