package com.github.natalialopessilva.cs20162aula2;

import com.github.natalialopessilva.cs20162.aula02.Propriedade3025;
import org.junit.Assert;
import org.junit.Test;

public class Propriedade3025Test {

    @Test(expected = IllegalArgumentException.class)
    public void numeroMenorQueZeroInvalido() {
        Propriedade3025.propriedade(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void numeroMaoiorQue9999Invalido() {
        Propriedade3025.propriedade(10000);
    }

    @Test
    public void resultadoCorreto() {
        Assert.assertTrue(Propriedade3025.propriedade(3025));
    }

    @Test
    public void resultadoIncorreto() {
        Assert.assertFalse(Propriedade3025.propriedade(2521));
    }
}
