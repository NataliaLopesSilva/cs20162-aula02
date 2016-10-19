package com.github.natalialopessilva.cs20162.aula02;

/**
 * Implementação do Algoritmo de números Primos.
 *
 * <p>
 * Algoritmo correspondente obtido da Lista de exercícios correspondentes a aula
 * 2, da disciplina Construção de software do prof. Fábio Nogueira de Lucena.
 *
 */
public class NumeroPrimo {

    /**
     * Construtor da classe.
     */
    protected NumeroPrimo() {
    }

    /**
     * Acessa o construtor da Classe.
     */
    public static void setNumeroPrimo() {
        NumeroPrimo numeroPrimo = new NumeroPrimo();
    }

    /**
     * Verifica se um numero é primo.
     *
     * @param n O numero a ser verificado. Valor maior que 1.
     *
     * @return true se o número for primo, ou falso se não for.
     *
     * @throws IllegalArgumentException Se n for inválido (menor ou igual a 1).
     */
    public static boolean verificaPrimo(final int n) {

        if (n <= 1) {
            throw new IllegalArgumentException("valor de n inválido");
        }

        int i = 2;

        do {
            if (n % i == 0) {
                return false;
            }
            i++;

        } while (i <= (n - 1));

        return true;
    }
}
