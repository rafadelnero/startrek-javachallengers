package com.characters;

public class Simpson {

  private void drinkBeer(String name) {
    if (name.equals("Homer"))
      System.out.println("All beers were empty by Homer");
    else {
      throw new StackOverflowError("Only Homer can drink");
    }
  }

  public void doh() {
    System.out.println("D'oh!");
  }

}


