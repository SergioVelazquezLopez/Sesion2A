package Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import sesion2A.Calculadora;

class CalculadoraTest {

    Calculadora calc = new Calculadora();

    @Test
    void testSuma() {
        assertEquals(5, calc.suma(2, 3));
    }

    @Test
    void testResta() {
        assertEquals(1, calc.resta(5, 4));
    }

    @Test
    void testMultiplica() {
        assertEquals(12, calc.multiplica(3, 4));
    }

    @Test
    void testDivide() {
        assertEquals(2, calc.divide(10, 5));
    }

    @Test
    void testDividePor0() {
        assertEquals(-1, calc.divide(10, 0));
    }
}