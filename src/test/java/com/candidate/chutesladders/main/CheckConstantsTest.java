package com.candidate.chutesladders.main;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for ChutesAndLadders constants
 */

public class CheckConstantsTest {
  @Test
  public void testLadder() {
    for (int i = 0; i < ChutesAndLadders.ladders.length; i++) {
      Assert.assertTrue(
          String.format("%s, %s is not a ladder", ChutesAndLadders.ladders[i][0],
              ChutesAndLadders.ladders[i][1]),
          ChutesAndLadders.ladders[i][0] < ChutesAndLadders.ladders[i][1]);
    }

  }

  @Test
  public void testChute() {
    for (int i = 0; i < ChutesAndLadders.chutes.length; i++) {
      Assert.assertTrue(
          String.format("%s, %s is not a chute", ChutesAndLadders.chutes[i][0],
              ChutesAndLadders.chutes[i][1]),
          ChutesAndLadders.chutes[i][0] > ChutesAndLadders.chutes[i][1]);
    }
  }

  @Test
  public void testSpinner() {
    int spin = ChutesAndLadders.spinner.getSpin();
    Assert.assertTrue(1 <= spin);
    Assert.assertTrue(6 >= spin);
  }
}
