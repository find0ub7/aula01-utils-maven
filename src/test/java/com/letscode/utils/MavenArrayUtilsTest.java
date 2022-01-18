package com.letscode.utils;

import org.junit.Assert;
import org.junit.Test;

public class MavenArrayUtilsTest {

  @Test
  public void estaVazioSeArrayForNulo() {
    String[] array = null;
    boolean estaVazio = MavenArrayUtils.estaVazio(array);
    Assert.assertTrue(estaVazio);
  }

  @Test
  public void estaVazioSeOTamanhoDoArrayForZero() {
    String[] array = {};
    boolean estaVazio = MavenArrayUtils.estaVazio(array);
    Assert.assertTrue(estaVazio);
  }

  @Test
  public void estaNaoVazioSeOArrayTiverElemento() {
    String[] array = {"1"};
    boolean estaVazio = MavenArrayUtils.estaVazio(array);
    Assert.assertEquals(false, estaVazio);
  }
}
