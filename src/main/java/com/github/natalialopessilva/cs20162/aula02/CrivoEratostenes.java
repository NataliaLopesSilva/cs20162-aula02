/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package com.github.natalialopessilva.cs20162.aula02;

/**
 * Implementação do Crivo de Eratóstenes.
 *
 * <p>
 * Algoritmo correspondente obtido da Lista de exercícios correspondentes a aula
 * 2, da disciplina Construção de software do prof. Fábio Nogueira de Lucena.
 *
 */
public class CrivoEratostenes {

    /**
     * Construtor da classe.
     */
    private CrivoEratostenes() {
    }

    /**
     * Acessa o construtor da Classe.
     */
    public static void setCrivoEratostenes() {
        CrivoEratostenes crivoEratostenes = new CrivoEratostenes();
    }

    /**
     * Número máximo de divsores que um número primo pode ter (um e ele mesmo).
     */
    public static final int NUM_MAXIMO_DIVISORES = 2;

    /**
     * Consiste num método de determinação de números primos,.
     *
     * @param n O numero a ser verificado. Valor maior que 1.
     * @param a Vetor de verificação. Valor igual a 0, para todo 2 <= i <= n.
     *
     * @throws IllegalArgumentException Se n for inválido (menor ou igual a 1).
     */
    public static void verificaPrimo(final int n, final int[] a) {

        if (n < NUM_MAXIMO_DIVISORES) {
            throw new IllegalArgumentException("valor de n inválido");
        }

        for (int i = 2; i <= n; i++) {
            if (a[i] != 0) {
                throw new IllegalArgumentException("Vetor inválido");
            }
        }

        int i = 0, c = 0;

        i = NUM_MAXIMO_DIVISORES;

        while (i <= n / NUM_MAXIMO_DIVISORES) {
            if (a[i] == 0) {
                c = i + i;

                while (c <= n) {
                    a[c] = 1;
                    c += i;
                }
            }

            i++;
        }
    }
}
