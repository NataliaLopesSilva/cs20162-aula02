package com.github.natalialopessilva.cs20162aula2;

import com.github.natalialopessilva.cs20162.aula02.NumeroPrimo;
import org.junit.Assert;
import org.junit.Test;

public class NumeroPrimoTest {

    @Test(expected = IllegalArgumentException.class)
    public void numeroMenorQueUmInvalido() {
        NumeroPrimo.verificaPrimo(-1);
    }

    @Test
    public void resultadoVerdadeiro() {
        Assert.assertTrue(NumeroPrimo.verificaPrimo(13));
    }

    @Test
    public void resultadoFalso() {
        Assert.assertFalse(NumeroPrimo.verificaPrimo(8));
    }
}
