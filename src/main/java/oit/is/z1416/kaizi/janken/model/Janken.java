package oit.is.z1416.kaizi.janken.model;

public class Janken {

  public String result;

  public Janken(String hand) {
    if (hand == "Gu") {
      result = "Draw";
    }
    if (hand == "Choki") {
      result = "You lose";
    }
    if (hand == "Pa") {
      result = "You win";
    }
  }

}
