package es.iesmz.tests;

public class Numeros {
    public static int sonIguales(int a, int b, int c) {
        if (a == b && b == c) return 0;
        if (a != b && a != c && b != c) return 2;
        return 1;
    }
}
