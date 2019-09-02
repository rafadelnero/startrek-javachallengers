package com.defiant;

public class Spock {

  private void attack(String shipName) {
    if (shipName.equals("reliant"))
      System.out.println("The ship is destroyed");
    else {
      throw new StackOverflowError("Non-existent ship");
    }
  }

  public void doh() {
    System.out.println("Hey, this is from the Simpsons!");
  }

}


