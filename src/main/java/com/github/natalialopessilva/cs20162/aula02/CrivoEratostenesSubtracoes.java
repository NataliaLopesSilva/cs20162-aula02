/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.natalialopessilva.cs20162.aula02;

/**
 * Implementação do Algoritmo de maior divisor comum.
 *
 * <p>
 *
 * Algoritmo correspondente obtido da Lista de exercícios correspondentes a aula
 * 2, da disciplina Construção de software do prof. Fábio Nogueira de Lucena.
 */
public final class CrivoEratostenesSubtracoes {

    /**
     * Construtor da classe CrivoEratostenesSubtracoes que impede que a mesma
     * seja instanciada ou acessada.
     */
    private CrivoEratostenesSubtracoes() {
    }

    /**
     * Verifica o maior divisor comum entre dois números, contudo, limita-se ao
     * uso de subtrações (não faz uso do resto da divisão inteira).
     *
     * @param a O primeiro numero da comparação. Valor maior ou igual a b.
     * @param b O segundo numero da comparação. Valor maior que 0.
     *
     * @return maior divisor comum entre a e b.
     *
     * @throws IllegalArgumentException Se a for inválido(menor que b).
     * @throws IllegalArgumentException Se b for inválido(menor que 0).
     */
    public static int verificaMaiorDivisor(final int a, final int b) {

        if (a < b) {
            throw new IllegalArgumentException("valor de a inválido");
        }
        if (b < 0) {
            throw new IllegalArgumentException("valor de b inválido");
        }

        int m = 0;
        int c = a;
        int d = b;

        do {
            if (c > d) {
                c = c - d;
            } else {
                d = d - c;
            }

        } while (c != d);

        return c;
    }
}
