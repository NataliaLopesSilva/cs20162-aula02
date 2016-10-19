package com.github.NataliaLopesSilva.exercicio;

import com.github.natalialopessilva.cs20162.aula02.CrivoEratostenesSubtracoes;
import static com.github.natalialopessilva.cs20162.aula02.CrivoEratostenesSubtracoes.setCrivoEratostenesSubtracoes;
import org.junit.Assert;
import org.junit.Test;

public class CrivoEratostenesSubtracoesTest {
    @Test(expected = IllegalArgumentException.class)
    public void aMenorbInvalido() {
        CrivoEratostenesSubtracoes.verificaMaiorDivisor(3, 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void bMenorQue0Invalido() {
        CrivoEratostenesSubtracoes.verificaMaiorDivisor(3, -1);
    }

    @Test
    public void resultado() {
        Assert.assertEquals(4, CrivoEratostenesSubtracoes.verificaMaiorDivisor(20, 12));
    }
    
    @Test
    public void cemPorCentoCobertura() {
        setCrivoEratostenesSubtracoes();
    }
}
