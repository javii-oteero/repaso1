package es.iesmz.tests;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumerosTest {
    @Test
    void TestSonIgualesTresDistintos() {
        assertEquals(2, Numeros.sonIguales(4, 55, 7));
    }

    @Test
    void Test2SonIgualesTresDistintos() {
        assertEquals(2, Numeros.sonIguales(14, 23, 27));
    }

    @Test
    void TestSonIgualesDosIguales() {
        assertEquals(1, Numeros.sonIguales(14,55,14));
    }

    @Test
    void TestSonIgualesDosIguales2() {
        assertEquals(1, Numeros.sonIguales(14,14,33));
    }

    @Test
    void TestSonIgualesDosIguales3() {
        assertEquals(1, Numeros.sonIguales(32,55,55));
    }

    @Test
    void TestSonIgualesTodosIguales() {
        assertEquals(0, Numeros.sonIguales(329,329,329));
    }
}