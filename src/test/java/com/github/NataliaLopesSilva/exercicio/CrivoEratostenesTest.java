package com.github.NataliaLopesSilva.exercicio;

import com.github.natalialopessilva.cs20162.aula02.CrivoEratostenes;
import static com.github.natalialopessilva.cs20162.aula02.CrivoEratostenes.setCrivoEratostenes;
import org.junit.Assert;
import org.junit.Test;

public class CrivoEratostenesTest {

    @Test(expected = IllegalArgumentException.class)
    public void numeroMenorUmInvalido() {
        int[] a = {0, 0, 0, 0};
        CrivoEratostenes.verificaPrimo(0, a);
    }

    @Test(expected = IllegalArgumentException.class)
    public void vetorNaoZero() {
        int vetor[] = {1, 1, 0, 1, 1};
        CrivoEratostenes.verificaPrimo(4, vetor);
    }

    @Test
    public void numeroEsperadoNaoPrimo() {
        int vetor[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        CrivoEratostenes.verificaPrimo(10, vetor);
        int expected[] = {0, 0, 0, 0, 1, 0, 1, 0, 1, 1, 1};
        Assert.assertArrayEquals(expected, vetor);
    }

    @Test
    public void numeroEsperadoPrimo() {
        int vetor[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        CrivoEratostenes.verificaPrimo(11, vetor);
        int expected[] = {0, 0, 0, 0, 1, 0, 1, 0, 1, 1, 1, 0};
        Assert.assertArrayEquals(expected, vetor);
    }

    @Test
    public void cemPorCentoCobertura() {
        setCrivoEratostenes();
    }
}
