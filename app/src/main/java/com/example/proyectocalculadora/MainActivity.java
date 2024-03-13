package com.example.proyectocalculadora;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;


import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TextView resultado;
    private String input = "";
    private double num1 = 0, num2 = 0;
    private char operador = ' ';
    private Calculadora calculadora = new Calculadora();

    Button regresar;

    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultado = findViewById(R.id.resultado);
        regresar = findViewById(R.id.regresar);

        regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, princi.class);
                startActivity(intent);
            }
        });
    }

    public void numeros(View view) {
        Button boton = (Button) view;
        String numero = boton.getText().toString();

        if (input.equals("0")) {
            input = numero;
        } else {
            input += numero;
        }

        resultado.setText(input);
    }

    public void operadores(View view) {
        Button boton = (Button) view;
        if (!input.isEmpty()) {
            num1 = Double.parseDouble(input);
            operador = boton.getText().toString().charAt(0);

            resultado.setText(num1 + " " + operador + " ");

            input = "";
        }
    }

    public void punto(View view) {
        if (!input.contains(".")) {
            input += ".";
            resultado.setText(input);
        }
    }

    public void igual(View view) {
        if (!input.isEmpty()) {
            num2 = Double.parseDouble(input);
            double resultadoCalculado = 0.0;

            switch (operador) {
                case '+':
                    resultadoCalculado = calculadora.sumar(num1, num2);
                    break;
                case '-':
                    resultadoCalculado = calculadora.restar (num1, num2);
                    break;
                case '×':
                    resultadoCalculado = calculadora.multiplicar(num1, num2);
                    break;
                case '÷':
                    resultadoCalculado = calculadora.dividir(num1, num2);
                    break;
                case '^':
                    resultadoCalculado = calculadora.potencia(num1, (int) num2);
                    break;
                default:
                    resultadoCalculado = Double.NaN;
            }

            input = String.valueOf(resultadoCalculado);

            if (Double.isNaN(resultadoCalculado)) {
                resultado.setText("ERROR");
            } else {
                resultado.setText(input);
            }
        }
    }

    public void ACReset(View view) {
        num1 = 0;
        num2 = 0;
        operador = ' ';
        input = "";
        resultado.setText("0");
    }

    public void Fibonacci(View view) {
        if (!input.isEmpty()) {
            int numFibonacci = Integer.parseInt(input);
            List<Integer> serieFibonacci = calculadora.serieFibonacci(numFibonacci);
            resultado.setText("Serie Fibonacci(" + numFibonacci + "): " + serieFibonacci);
        }
    }


}
