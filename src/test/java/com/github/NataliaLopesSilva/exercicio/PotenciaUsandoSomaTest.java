package com.github.NataliaLopesSilva.exercicio;

import com.github.natalialopessilva.cs20162.aula02.PotenciaUsandoSoma;
import static com.github.natalialopessilva.cs20162.aula02.PotenciaUsandoSoma.setPotenciaUsandoSoma;
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

    @Test
    public void cemPorCentoCobertura() {
        setPotenciaUsandoSoma();
    }
}
