package com.example.proyectocalculadora;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestCalculadora {
    @Test
    public void testSuma() {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.sumar(2.0, 3.0);
        assertEquals(5.0, resultado, 0.001);
    }

    @Test
    public void testResta() {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.restar(5.0, 2.0);
        assertEquals(3.0, resultado, 0.001);
    }

    @Test
    public void testMultiplicacion() {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.multiplicar(5.0, 2.0);
        assertEquals(10.0, resultado, 0.001);
    }

    @Test
    public void testDivision() {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.dividir(6.0, 2.0);
        assertEquals(3.0, resultado, 0.001);
    }

    @Test
    public void testPotencia() {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.potencia(2.0, 3);
        assertEquals(8.0, resultado, 0.001);
    }
    @Test
    public void testFibonacci() {
        Calculadora calculadora = new Calculadora();
        assertEquals(0, calculadora.fibonacci(0));
        assertEquals(1, calculadora.fibonacci(1));
        assertEquals(8, calculadora.fibonacci(6));
        assertEquals(55, calculadora.fibonacci(10));
    }


}

