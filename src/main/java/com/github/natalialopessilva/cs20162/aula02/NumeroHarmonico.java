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
public class NumeroHarmonico {

    /**
     * Construtor da classe.
     */
    protected NumeroHarmonico() {
    }

    /**
     * Acessa o construtor da Classe.
     */
    public static void setNumeroHarmonico() {
        NumeroHarmonico numeroHarmonico = new NumeroHarmonico();
    }

    /**
     * Número máximo de divsores que um número primo pode ter (um e ele mesmo).
     */
    public static final int INICIO_TEMOS = 2;

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
            throw new IllegalArgumentException("valor de n inválido");
        }

        int i = INICIO_TEMOS;
        double s = 1;

        do {
            s += (double) 1 / i;
            i++;
        } while (i <= n);

        return s;
    }
}
