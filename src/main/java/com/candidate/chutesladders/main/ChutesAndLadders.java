package com.candidate.chutesladders.main;


public class ChutesAndLadders {
  private static final Player players[] = new Player[2];
  public static Spinner spinner = new Spinner(6);
  private static String winner;
  public static final int ladders[][] = buildLadders();
  public static final int chutes[][] = buildChatters();

  public static void main(String[] args) {
    players[0] = new Player("Eric");
    players[1] = new Player("Paul");
    gameActive: // outer loop
    while (true) {
      for (int i = 0; i < players.length; i++) {
        players[i].spin(spinner);
        checkLadder(players[i]);
        checkChate(players[i]);
        if (players[i].getPosition() >= 100) {
          winner = players[i].getName();
          break gameActive;
        }
      }
    }
    System.out.println(String.format("\nThe winner is %s!", winner));
  }

  private static void checkLadder(Player p) {
    for (int i = 0; i < ladders.length; i++) {
      if (p.getPosition() == ladders[i][0]) {
        System.out.printf(String.format("--LADDER--> %s", ladders[i][1]));
        p.setPosition(ladders[i][1]);
      }
    }
  }

  private static void checkChate(Player p) {
    for (int i = 0; i < chutes.length; i++) {
      if (p.getPosition() == chutes[i][0]) {
        System.out.printf(String.format("--CHUTE--> %s", chutes[i][1]));
        p.setPosition(chutes[i][1]);
      }
    }
  }

  private static int[][] buildLadders() {
    int ladders[][] = new int[9][2];
    ladders[0][0] = 1;
    ladders[0][1] = 38;
    ladders[1][0] = 4;
    ladders[1][1] = 14;
    ladders[2][0] = 9;
    ladders[2][1] = 31;
    ladders[3][0] = 21;
    ladders[3][1] = 42;
    ladders[4][0] = 28;
    ladders[4][1] = 84;
    ladders[5][0] = 36;
    ladders[5][1] = 44;
    ladders[6][0] = 51;
    ladders[6][1] = 67;
    ladders[7][0] = 71;
    ladders[7][1] = 91;
    ladders[8][0] = 80;
    ladders[8][1] = 100;
    return ladders;
  }

  private static int[][] buildChatters() {
    int chutes[][] = new int[10][2];
    chutes[0][0] = 16;
    chutes[0][1] = 6;
    chutes[1][0] = 47;
    chutes[1][1] = 26;
    chutes[2][0] = 49;
    chutes[2][1] = 11;
    chutes[3][0] = 56;
    chutes[3][1] = 53;
    chutes[4][0] = 62;
    chutes[4][1] = 19;
    chutes[5][0] = 64;
    chutes[5][1] = 60;
    chutes[6][0] = 87;
    chutes[6][1] = 24;
    chutes[7][0] = 93;
    chutes[7][1] = 73;
    chutes[8][0] = 95;
    chutes[8][1] = 75;
    chutes[9][0] = 98;
    chutes[9][1] = 78;
    return chutes;
  }

}
