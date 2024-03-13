package com.example.proyectocalculadora;

import java.util.ArrayList;
import java.util.List;

public class Calculadora  {
        public double sumar(double num1, double num2) {
            return num1 + num2;
        }

        public double restar(double num1, double num2) {
            return num1 - num2;
        }

        public double multiplicar(double num1, double num2) {
            return num1 * num2;
        }

        public double dividir(double num1, double num2) {
            if (num2 != 0) {
                return num1 / num2;
            } else {
                return Double.NaN;
            }
        }

        public double potencia(double base, int exponente) {
            if (exponente == 0) {
                return 1;
            } else if (exponente < 0) {
                return 1 / (base * potencia(base, -exponente - 1));
            } else {
                return base * potencia(base, exponente - 1);
            }
        }

    public List<Integer> serieFibonacci(int n) {
        List<Integer> serie= new ArrayList<>();

        if (n < 0) {
            return serie;
        }

        for (int i = 0; i <= n; i++) {
            serie.add(fibonacci(i));
        }

        return serie;
    }

    public int fibonacci(int n) {
        if (n < 0) {
            return -1;
        } else if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            int NumMenos1 = fibonacci(n - 1);
            int NumMenos2 = fibonacci(n - 2);
            return NumMenos1 + NumMenos2;
        }
    }


}

