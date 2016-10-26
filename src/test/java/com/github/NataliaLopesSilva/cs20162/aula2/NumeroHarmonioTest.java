package com.github.NataliaLopesSilva.cs20162.aula2;

import com.github.natalialopessilva.cs20162.aula02.NumeroHarmonico;
import org.junit.Assert;
import org.junit.Test;

public class NumeroHarmonioTest {

    @Test(expected = IllegalArgumentException.class)
    public void numeroMenorQueUmInvalido() {
        NumeroHarmonico.numeroHarmonico(-1);
    }

    @Test
    public void resultado() {
        Assert.assertEquals(1.83d, NumeroHarmonico.numeroHarmonico(3), 0.01d);
    }
}
