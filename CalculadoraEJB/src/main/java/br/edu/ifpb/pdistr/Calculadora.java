package br.edu.ifpb.pdistr;

import jakarta.ejb.Stateless;

@Stateless(name = "calculadoraService")
public class Calculadora implements CalculadoraIF {
    public int somar(int num1, int num2) {
        return num1 + num2;
    }
}

