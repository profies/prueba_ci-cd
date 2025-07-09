/**
 * 
 */
package org.lapaloma;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/*
* Isidoro Nevares Martín - Virgen de la Paloma
* Fecha creación: 9 jul 2025
*/
public class TestClasePrincipal {
    @Test
    public void testApp() {
        ClasePrincipal myApp = new ClasePrincipal();

        String result = myApp.getStatus();

        assertEquals("OK", result);
    }

}
