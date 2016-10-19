package com.github.natalialopessilva.cs20162.aula02;

/**
 * Implementação do Algoritmo de maior divisor comum.
 *
 * <p>
 *
 * Algoritmo correspondente obtido da Lista de exercícios correspondentes a aula
 * 2, da disciplina Construção de software do prof. Fábio Nogueira de Lucena.
 *
 */
public class MaiorDivisorComum {

    /**
     * Construtor da classe.
     */
    protected MaiorDivisorComum() {
    }

    /**
     * Acessa o construtor da Classe.
     */
    public static void setMaiorDivisorComum() {
        MaiorDivisorComum maiorDivisorComum = new MaiorDivisorComum();
    }

    /**
     * Verifica o maior divisor comum entre dois números.
     *
     * @param a O primeiro numero da comparação. Valor maior ou igual a b.
     * @param b O segundo numero da comparação. Valor maior que 0.
     *
     * @return maior divisor comum entre a e b.
     *
     * @throws IllegalArgumentException Se a for inválido (menor que b).
     * @throws IllegalArgumentException Se b for inválido (menor que 0).
     */
    public static int verificaMaiorDivisor(final int a, final int b) {

        if (a < b) {
            throw new IllegalArgumentException("valor de a inválido");
        }
        if (b < 0) {
            throw new IllegalArgumentException("valor de b inválido");
        }

        int m = 0, c = a, d = b;

        do {
            m = c % d;
            c = d;
            d = m;
        } while (d != 0);

        return c;
    }
}
