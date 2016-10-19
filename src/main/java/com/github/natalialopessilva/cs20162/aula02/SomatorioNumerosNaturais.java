package com.github.natalialopessilva.cs20162.aula02;

/**
 * Implementação do Somatório dos Numeros Naturais.
 *
 * <p>
 * Algoritmo correspondente obtido da Lista de exercícios correspondentes a aula
 * 2, da disciplina Construção de software do prof. Fábio Nogueira de Lucena.
 *
 */
public class SomatorioNumerosNaturais {

    /**
     * Construtor da classe.
     */
    protected SomatorioNumerosNaturais() {
    }

    /**
     * Acessa o construtor da Classe.
     */
    public static void setSomatorioNumerosNaturais() {
        SomatorioNumerosNaturais somatorioNumerosNaturais
                = new SomatorioNumerosNaturais();
    }

    /**
     * Número máximo que n pode assumir.
     */
    public static final int CONTADOR = 2;

    /**
     * Obtém a somatoria dos numeros naturais para n.
     *
     * @param n O numero de elementos da somatória. Valor igual ou maior que 1.
     *
     * @return O valor total da Somatória dos números naturais, que varia de 1,
     * ate n.
     *
     * @throws IllegalArgumentException Se n for inválido (menor que 1).
     */
    public static int somatorio(final int n) {

        if (n < 1) {
            throw new IllegalArgumentException("valor de n inválido");
        }

        int i = CONTADOR, s = 1;

        while (i <= n) {
            s += i;
            i++;
        }

        return s;
    }
}
