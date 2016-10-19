/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.natalialopessilva.cs20162.aula02;

/**
 * Implementação da Propriedade 3025.
 *
 * <p>
 *
 * Algoritmo correspondente obtido da Lista de exercícios correspondentes a aula
 * 2, da disciplina Construção de software do prof. Fábio Nogueira de Lucena.
 *
 */
public class Propriedade3025 {

    /**
     * Construtor da classe.
     */
    protected Propriedade3025() {
    }

    /**
     * Acessa o construtor da Classe.
     */
    public static void setPropriedade3025() {
        Propriedade3025 propriedade3025 = new Propriedade3025();
    }

    /**
     * Número máximo que n pode assumir.
     */
    public static final int NUM_MAXIMO = 9999;

    /**
     * Número de valor 10 para a realizar as divisões necessárias.
     */
    public static final int NUM_DEZ = 10;

    /**
     * Número de valor 100 para a realizar as divisões necessárias.
     */
    public static final int NUM_CEM = 100;

    /**
     * Valor do expoente.
     */
    public static final int EXPOENTE = 3;

    /**
     * Obtém a verificação de um número na propriedade 3025.
     *
     * @param n O numero que vem por parametro do programa main. Valor igual ou
     * maior que 0 ou igual ou menor que 9999.
     *
     * @return true, se o numero final estiver igual ao parametro de entrada, ou
     * false, se o numero final não for compativel com o parametro de entrada.
     *
     * @throws IllegalArgumentException Se n for inválido (menor que 0 ou maior
     * que 9999).
     */
    public static boolean propriedade(final int n) {

        if (n < 0 || n > NUM_MAXIMO) {
            throw new IllegalArgumentException("valor de n inválido");
        }

        int i = 0, j = 0;

        i = n / NUM_CEM;
        j = n % NUM_CEM;

        int resultado = (i + j) * (i + j);

        return resultado == n;
    }
}
