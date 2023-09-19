package br.edu.ifpb.pdistr;

import jakarta.ejb.Remote;

@Remote
public interface CalculadoraIF {
    int somar(int num1, int num2);
}

