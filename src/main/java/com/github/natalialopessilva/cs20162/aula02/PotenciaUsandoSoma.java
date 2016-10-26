/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.natalialopessilva.cs20162.aula02;

/**
 * Implementação do Potência Usando Somas.
 *
 * <p>
 * Algoritmo correspondente obtido da Lista de exercícios correspondentes a aula
 * 2, da disciplina Construção de software do prof. Fábio Nogueira de Lucena.
 *
 * Importante ressaltar que nesse algoritmo utilizamos a classe
 * ProdutoInteiroPsotivoUsandoSoma já criada no projeto.
 *
 */
public final class PotenciaUsandoSoma {

    /**
     * Construtor da classe PotenciaUsandoSoma que impede que a mesma seja
     * instanciada ou acessada.
     */
    private PotenciaUsandoSoma() {
    }

    /**
     * Obtém a potência de um número com seu expoente.
     *
     * @param x O numero da base. Valor igual ou maior que 0.
     * @param y O expoente de x. Valor igual ou maior que 0.
     *
     * @return O valor resultante da potência.
     *
     * @throws IllegalArgumentException Se x ou y for inválido (menor que 0).
     */
    public static int potencia(final int x, final int y) {

        if (x < 0 || y < 0) {
            throw new IllegalArgumentException("valor de x ou y deve ser maior "
                    + " que 0.");
        }

        int potencia = 1;
        int i = 1;

        do {
            potencia = ProdutoInteiroPositivoUsandoSoma.produtoComSoma(potencia,
                    x);
            i++;
        } while (i <= y);

        return potencia;
    }
}
