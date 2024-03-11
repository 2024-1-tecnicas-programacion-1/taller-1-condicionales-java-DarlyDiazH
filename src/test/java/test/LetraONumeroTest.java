package test;

import ejercicios.LetraONumero;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author danielsanchez
 */
public class LetraONumeroTest {
    @Test
    public void testEsNumero() {
        String valorEsperado = "Es numero";
        String valorActual = LetraONumero.evaluar('9');
        assertEquals(valorEsperado, valorActual);
    }
    
    // TODO: Agrega tus otros casos de prueba aquí
    @Test
    public void testEsLetraMayuscula() {
        String valorEsperado = "Es letra Mayuscula";
        String valorActual = LetraONumero.evaluar('A');
        assertEquals(valorEsperado, valorActual);
    }
    
    @Test
    public void testEsLetraMinuscula() {
        String valorEsperado = "Es letra Minuscula";
        String valorActual = LetraONumero.evaluar('a');
        assertEquals(valorEsperado, valorActual);
    }
    
    @Test
    public void testNoEsLetraNiNumero() {
        String valorEsperado = "No es letra ni número";
        String valorActual = LetraONumero.evaluar('#');
        assertEquals(valorEsperado, valorActual);
    }
}
