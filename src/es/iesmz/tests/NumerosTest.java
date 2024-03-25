package es.iesmz.tests;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumerosTest {
    @Test
    void TestSonIgualesTresDistintos() {
        assertEquals(2, Numeros.sonIguales(4, 55, 7));
    }
}