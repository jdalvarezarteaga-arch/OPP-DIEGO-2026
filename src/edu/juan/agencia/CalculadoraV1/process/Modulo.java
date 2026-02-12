package edu.juan.agencia.CalculadoraV1.process;
/**
 * Clase encargada de calcular el módulo usando resta.
 */
public class Modulo {

    /**
     * Calcula el residuo usando restas sucesivas.
     * @throws ArithmeticException si el divisor es 0
     */
    public int modulo(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir entre cero");
        }

        int resto = Math.abs(a);
        while (resto >= Math.abs(b)) {
            resto -= Math.abs(b);
        }

        return resto;
    }
}