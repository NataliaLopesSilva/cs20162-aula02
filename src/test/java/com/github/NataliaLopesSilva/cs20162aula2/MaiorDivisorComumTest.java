package com.github.natalialopessilva.cs20162aula2;

import com.github.natalialopessilva.cs20162.aula02.MaiorDivisorComum;
import org.junit.Assert;
import org.junit.Test;

public class MaiorDivisorComumTest {

    @Test(expected = IllegalArgumentException.class)
    public void aMenorbInvalido() {
        MaiorDivisorComum.verificaMaiorDivisor(3, 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void bMenorQue0Invalido() {
        MaiorDivisorComum.verificaMaiorDivisor(3, -1);
    }

    @Test
    public void resultado() {
        Assert.assertEquals(4, MaiorDivisorComum.verificaMaiorDivisor(20, 12));
    }
}
