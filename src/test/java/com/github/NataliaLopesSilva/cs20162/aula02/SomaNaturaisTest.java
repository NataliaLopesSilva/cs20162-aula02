package com.github.NataliaLopesSilva.cs20162.aula02;

import com.github.natalialopessilva.cs20162.aula02.SomatorioNumerosNaturais;
import org.junit.Test;
import org.junit.Assert;

public class SomaNaturaisTest {

    @Test(expected = IllegalArgumentException.class)
    public void numeroMenorQueUmInvalido() {
        SomatorioNumerosNaturais.somatorio(0);
    }

    @Test
    public void resultado() {
        Assert.assertEquals(1 + 2 + 3 + 4 + 5 + 6,
                SomatorioNumerosNaturais.somatorio(6));
    }
}
