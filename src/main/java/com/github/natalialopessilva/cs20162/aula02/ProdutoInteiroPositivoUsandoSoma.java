package com.github.natalialopessilva.cs20162.aula02;

/**
 * Implementação do Produto de Inteiros positivos usando somas.
 *
 * <p>
 *
 * Algoritmo correspondente obtido da Lista de exercícios correspondentes a aula
 * 2, da disciplina Construção de software do prof. Fábio Nogueira de Lucena.
 *
 */
public class ProdutoInteiroPositivoUsandoSoma {

    /**
     * Construtor da classe.
     */
    protected ProdutoInteiroPositivoUsandoSoma() {
    }

    /**
     * Acessa o construtor da Classe.
     */
    public static void setProdutoInteiroPositivoUsandoSoma() {
        ProdutoInteiroPositivoUsandoSoma produtoInteiroPositivoUsandoSoma
                = new ProdutoInteiroPositivoUsandoSoma();
    }

    /**
     * Obtém o produto de dois inteiros usando a menor quantidade de somas.
     *
     * @param a O somatório de parcelas. Valor maior que 0.
     * @param b O somatório de parcelas. Valor maior que 0.
     *
     * @return O produto de dois inteiros.
     *
     * @throws IllegalArgumentException Se a ou b for inválido (menor que 0).
     */
    public static int produtoComSoma(final int a, final int b) {
        int totalParcelas = a, parcela = b;

        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("valor de a ou b deve ser maior "
                    + "que 0");
        }

        if (b < a) {
            totalParcelas = b;
            parcela = a;
        }

        int i = 1, s = 0;

        do {
            s += parcela;
            i++;
        } while (i <= totalParcelas);

        return s;
    }
}
