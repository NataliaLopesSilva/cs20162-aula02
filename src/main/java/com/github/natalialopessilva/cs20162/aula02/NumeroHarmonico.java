/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.natalialopessilva.cs20162.aula02;

/**
 * Implementação do Algoritmo de números harmônicos.
 *
 * <p>
 *
 * Algoritmo correspondente obtido da Lista de exercícios correspondentes a aula
 * 2, da disciplina Construção de software do prof. Fábio Nogueira de Lucena.
 *
 */
public final class NumeroHarmonico {

    /**
     * Número máximo de divisores que um número primo pode ter (um e ele mesmo).
     */
    public static final int INICIO_TERMOS = 2;

    /**
     * Construtor da classe NumeroHarmonico que impede que a mesma seja
     * instanciada ou acessada.
     */
    private NumeroHarmonico() {
    }

    /**
     * Obtêm o n-ésimo número harmônico..
     *
     * @param n O numero de termos. Valor maior ou igual a 1.
     * @return somatório do número harmônico.
     *
     * @throws IllegalArgumentException Se n for inválido (menor que 1).
     */
    public static double numeroHarmonico(final int n) {

        if (n < 1) {
            throw new IllegalArgumentException("Valor de n deve ser maior ou "
                    + "igual a 1");
        }

        int i = INICIO_TERMOS;
        double s = 1;

        do {
            s += (double) 1 / i;
            i++;
        } while (i <= n);

        return s;
    }
}
