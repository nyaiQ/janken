package oit.is.z1416.kaizi.janken.model;

public class Janken {
  public static int Gu = 0;
  public static int Choki = 1;
  public static int Pa = 2;

  public static int draw = 0;
  public static int lose = 1;
  public static int win = 2;

  public static int janken(int myHand) {
    int cpuHand = 0;
    int result = (myHand - cpuHand + 3) % 3;
    return result;
  }

}
