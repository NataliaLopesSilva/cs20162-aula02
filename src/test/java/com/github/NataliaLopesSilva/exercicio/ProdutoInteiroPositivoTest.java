package com.github.NataliaLopesSilva.exercicio;

import com.github.natalialopessilva.cs20162.aula02.ProdutoInteiroPositivoUsandoSoma;
import static com.github.natalialopessilva.cs20162.aula02.ProdutoInteiroPositivoUsandoSoma.setProdutoInteiroPositivoUsandoSoma;
import org.junit.Assert;
import org.junit.Test;

public class ProdutoInteiroPositivoTest {

    @Test(expected = IllegalArgumentException.class)
    public void aMenorZeroInvalido() {
        ProdutoInteiroPositivoUsandoSoma.produtoComSoma(-1, 2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void bMenorQueZeroInvalido() {
        ProdutoInteiroPositivoUsandoSoma.produtoComSoma(3, -1);
    }

    @Test
    public void resultadoEsperado() {
        Assert.assertEquals(9, ProdutoInteiroPositivoUsandoSoma.produtoComSoma(3, 3));
    }

    @Test
    public void resultadoEsperadoParaBMenorQueA() {
        Assert.assertEquals(8, ProdutoInteiroPositivoUsandoSoma.produtoComSoma(4, 2));
    }

    @Test
    public void cemPorCentoCobertura() {
        setProdutoInteiroPositivoUsandoSoma();
    }
}
