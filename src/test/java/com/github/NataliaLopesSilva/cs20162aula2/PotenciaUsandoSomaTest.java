package com.github.natalialopessilva.cs20162aula2;

import com.github.natalialopessilva.cs20162.aula02.PotenciaUsandoSoma;
import org.junit.Assert;
import org.junit.Test;

public class PotenciaUsandoSomaTest {

    @Test(expected = IllegalArgumentException.class)
    public void xMenorZeroInvalido() {
        PotenciaUsandoSoma.potencia(-1, 2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void yMenorQueZeroInvalido() {
        PotenciaUsandoSoma.potencia(3, -1);
    }

    @Test
    public void resultado() {
        Assert.assertEquals(9, PotenciaUsandoSoma.potencia(3, 2));
    }
}
